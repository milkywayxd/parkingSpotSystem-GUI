import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Write a description of class Application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Application implements ActionListener
{
    public static CarPark cp = new CarPark();
    public JFrame frame, mainFrame, frameDisplay;
    public JPanel panel, panelMenu, panelDisplay;
    public JButton startButton, button_listAll, button_parkCar, button_findCar, button_removeCar, button_addCarSlot, button_deleteCarSlot, button_exit;
    public JLabel label, l1, l2;
    public JTextField tf1,tf2;
    public static int indexS;
    public static int indexV;
    public static String slotId;
    public static ParkingSlot ps = new ParkingSlot(slotId, true, false, "null", "null", true);
    public static String reg;
    public static String owner;
    public static Car car = new Car(reg,"null",true);
    public static int option; 
    public static boolean newslotIfStaff;
    /**
     * Constructor for objects of class Application
     */
    public Application()
    {
        // initialise instance variables
        frame = new JFrame(); 
        startButton = new JButton("Create New Carpark");
        label = new JLabel("Welcome back! Start to establish a car parking with slots for staff and visitors");//set text for label");
        l1 = new JLabel("Please enter the number of slots for staff");
        tf1 = new JTextField("",20);
        l2 = new JLabel("Please enter the number of slots for vistor");
        tf2 = new JTextField("",20);
        
        label.setFont(new Font("Roboto",Font.BOLD,15));
        label.setForeground(Color.WHITE);
        panel = new JPanel();
        panel.setSize(400,400);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //panel.setLayout(new GridLayout(0,1));
        panel.setBackground(new Color(0,204,204));
        panel.add(label);
        panel.add(l1);
        panel.add(tf1);
        panel.add(l2);
        panel.add(tf2);
        panel.add(startButton);
        
        button_listAll = new JButton("List all car slots");
        button_parkCar = new JButton("Park a car");
        button_findCar = new JButton("Find a car"); 
        button_removeCar = new JButton("Remove a car"); 
        button_addCarSlot = new JButton("Add car slot"); 
        button_deleteCarSlot = new JButton("Delete car slot"); 
        button_exit = new JButton("Exit"); 
        panelMenu = new JPanel();
        panelMenu.setBounds(0,0,600,400);
        panelMenu.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //panelMenu.setLayout(new GridLayout(0,1));
        panelMenu.setBackground(new Color(0,204,204));
        panelMenu.add(button_listAll);// initialise instance variables
        panelMenu.add(button_parkCar);
        panelMenu.add(button_findCar);
        panelMenu.add(button_removeCar);
        panelMenu.add(button_addCarSlot);
        panelMenu.add(button_deleteCarSlot);
        panelMenu.add(button_exit);
        panelMenu.setVisible(false);
        panel.setVisible(true);
        
        frame.add(panel);
        frame.add(panelMenu);
        
          
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI CarPark System");
        frame.setSize(600,300);
        //frame.pack();
        frame.setVisible(true);
      
        startButton.addActionListener(this);  
        button_listAll.addActionListener(this);  
        button_parkCar.addActionListener(this); 
        button_findCar.addActionListener(this); 
        button_removeCar.addActionListener(this); 
        button_addCarSlot.addActionListener(this); 
        button_deleteCarSlot.addActionListener(this); 
        button_exit.addActionListener(this); 
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args) 
    {
        new Application();
        
    }  
    
    @Override
        public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==startButton){
            indexS = Integer.parseInt(tf1.getText());
            indexV = Integer.parseInt(tf2.getText());
            System.out.println(indexS + " " + "slots for staff are created successfully");
            System.out.println(indexV + " " + "slots for vistor are created successfully");
            JOptionPane.showMessageDialog(frame,indexS + " " + "slots for staff are created successfully; "+ indexV + " " + "slots for vistor are created successfully" ,"Message",JOptionPane.PLAIN_MESSAGE);
            cp.initialCarPark(indexS,indexV);
            cp.printSlot();
            panelMenu.setVisible(true);
            panel.setVisible(false);
             
            }
         if (e.getSource()==button_listAll)
         {
             listSlots(indexS,indexV);
             frameDisplay = new JFrame("List All Car Slots");
             JPanel p = new JPanel();
             frameDisplay.setLayout(new GridLayout(4,3));
             for(int s =0; s<cp.slotList.size(); s++)
             {
                 String id = cp.slotList.get(s).slotId;
                 String regi = cp.slotList.get(s).reg;
                 String oc;
                 
                 if(cp.slotList.get(s).isOccupied)
                 {
                    //no registration number update is required
                    oc = "Occupied";
                 }
                 else
                 {
                     regi = "NA";
                     oc = "Available";
                 }
                 
                 String message = "SoltID: "+ id + " " + oc + " " + "Regi: " + regi;
                 JButton sf = new JButton(String.valueOf(message));
                 frameDisplay.add(sf);
                 if (cp.slotList.get(s).isOccupied)
                 {
                     sf.setBackground(Color.RED);
                     sf.setForeground(Color.WHITE);
                 }
                 else
                 {
                     sf.setBackground(Color.BLUE);
                     sf.setForeground(Color.WHITE);
                 }
                
                                
            }
                frameDisplay.setSize(1000,800);
                frameDisplay.setVisible(true);
                frameDisplay.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
              
             
         }   
            
            if (e.getSource()==button_parkCar)
         {
            cp.printSlot();
            slotId =JOptionPane.showInputDialog(null,"Please enter slot ID").trim();
            reg =JOptionPane.showInputDialog(null,"Please enter car registration").trim();
            owner =JOptionPane.showInputDialog(null,"Please enter owner's name").trim();
            String input =JOptionPane.showInputDialog(null,"Enter'Y' if the owner is staff, Enter'N' if the owner is not staff").trim();
            System.out.println(owner);
           boolean carIfStaff = car.staffCar(input);
           boolean slotIfStaff = ps.isStaff(slotId);
           ParkingSlot ps = new ParkingSlot(slotId, slotIfStaff, true, reg, owner,carIfStaff);
            if (ps.slotId.matches("[A-Z]\\d\\d\\d") && ps.reg.matches("[A-Z]\\d\\d\\d\\d\\d"))
           {
           int i;
          for(i=0; i<cp.slotList.size(); i++ )
          {
            String searchsid = cp.slotList.get(i).slotId; 
            if (searchsid.equals(slotId))
            {
                 break;
            }
        }
        
        System.out.println(i);
        cp.slotList.set(i,ps);                     
        System.out.println("SlotID: " + ps.slotId +", is occupied by " + ps.reg);
        JOptionPane.showMessageDialog(frame,"SlotID: " + ps.slotId +", is occupied by " + ps.reg,"Message",JOptionPane.PLAIN_MESSAGE);  
       }
    
       else { System.out.println("Please enter correct information");
              JOptionPane.showMessageDialog(frame,"Please enter correct information","Message",JOptionPane.PLAIN_MESSAGE); 
        }
       
    }
         if(e.getSource()==button_findCar)
          { 
            String reg1 =JOptionPane.showInputDialog(null,"Please enter car registration number").trim();
            String flag = "false";
             if (reg1.matches("[A-Z]\\d\\d\\d\\d\\d") )
              {
                
                int j;
                for(j=0; j<cp.slotList.size(); j++ )
                    {
                        String searchreg = cp.slotList.get(j).reg; 
                        if (searchreg.equals(reg1))
                            {
                            String carslotid = cp.slotList.get(j).slotId;
                            String carowner =  cp.slotList.get(j).owner;     
                            System.out.println("Car found. SlotID: " + carslotid + " Car Owner: " + carowner);
                            flag = "true";
                            JOptionPane.showMessageDialog(frame,"Car found. SlotID: " + carslotid + " Car Owner: " + carowner ,"Message",JOptionPane.PLAIN_MESSAGE);
                            break;
                           }
                        else
                            {
                                flag = "false";  
                            }    
                    }
                
                    if  (flag.equals("false"))
                    {
                        System.out.println("Car not found.");
                        JOptionPane.showMessageDialog(frame,"Car not found. ","Message",JOptionPane.PLAIN_MESSAGE);
                    }
                }
            else
               {
                  System.out.println("Please enter valid regi");
                  JOptionPane.showMessageDialog(frame,"Please enter valid regi eg A11111","Message",JOptionPane.PLAIN_MESSAGE);  
                }      
       }          
          
       if(e.getSource()==button_removeCar)
          {
            String reg2 =JOptionPane.showInputDialog(null,"Please enter car registration number").trim();
             if (reg2.matches("[A-Z]\\d\\d\\d\\d\\d"))
           {
                int k;
                for(k=0; k<cp.slotList.size(); k++ )
                {
                    String searchreg = cp.slotList.get(k).reg; 
                    if (searchreg.equals(reg2))
                    {
                     break;
                    }
                }
                
                String removecarslotid = cp.slotList.get(k).slotId;
                boolean removecarisStaff = cp.slotList.get(k).isStaff;
                boolean removecarstaffCar = cp.slotList.get(k).staffCar;
                               
                ParkingSlot removecar = new ParkingSlot(removecarslotid, removecarisStaff, false, "null", "null",removecarstaffCar);
                
                cp.slotList.set(k,removecar);
                
                System.out.println("Car found Removed. SlotID: " + removecarslotid + " Car Reg: " + reg2);
                JOptionPane.showMessageDialog(frame,"Car found Removed. SlotID: " + removecarslotid + " Car Reg: " + reg2,"Message",JOptionPane.PLAIN_MESSAGE);  
           }
        else
           {
              System.out.println("Please enter a valid car reg number. ");
              JOptionPane.showMessageDialog(frame,"Please enter a valid car reg number.","Message",JOptionPane.PLAIN_MESSAGE); 
            }
        }
             if(e.getSource()==button_addCarSlot)
             {
              String newslotId =JOptionPane.showInputDialog(null,"Please enter slot ID").trim();
              String slotowner =JOptionPane.showInputDialog(null,"Please enter S for staff or V for vistor").trim();   
              if (slotowner == "S")
           {
                newslotIfStaff = false;
           }
            else
           {
                newslotIfStaff = true;
           } 
           
           ParkingSlot newps = new ParkingSlot(newslotId, newslotIfStaff, false, "null", "null",true);
           if (newps.slotId.matches("[A-Z]\\d\\d\\d"))
            {
            cp.slotList.add(newps);                     
            System.out.println("SlotID: " + newslotId +", is added");
            JOptionPane.showMessageDialog(frame,"SlotID: " + newslotId +", is added","Message",JOptionPane.PLAIN_MESSAGE); 
            }
       
           else { System.out.println("Please enter correct information");
                  JOptionPane.showMessageDialog(frame,"Please enter correct information","Message",JOptionPane.PLAIN_MESSAGE);
            }    
               
        }
         
            if(e.getSource()==button_deleteCarSlot)
            {
              String deleteslotid =JOptionPane.showInputDialog(null,"Please enter slot ID:").trim();
              if (deleteslotid.matches("[A-Z]\\d\\d\\d") )
               {
                    int z;
                    for(z=0; z<cp.slotList.size()-1; z++ )
                        {
                            String searchdeleteslotid = cp.slotList.get(z).slotId; 
                            if (searchdeleteslotid.equals(deleteslotid))
                            {
                                 break;
                            }
                        }
                    boolean deleteslotOccupied = cp.slotList.get(z).isOccupied;
                    boolean deleteisStaff = cp.slotList.get(z).isStaff; 
                    boolean deletestaffCar = cp.slotList.get(z).staffCar;
                    String deletereg = cp.slotList.get(z).reg;
                    String deleteowner = cp.slotList.get(z).owner; 
                    ParkingSlot deleteps = new ParkingSlot(deleteslotid, deleteisStaff, deleteslotOccupied, deletereg, deleteowner,deletestaffCar);
                    
                    
                    if (deleteslotOccupied)
                    {
                        System.out.println("SlotID: " + deleteslotid + " is occupied and can not be removed." );
                        JOptionPane.showMessageDialog(frame,"SlotID: " + deleteslotid + " is occupied and can not be removed.","Message",JOptionPane.PLAIN_MESSAGE);
                    }
                    else
                    {
                        cp.slotList.remove(z);
                        System.out.println("SlotID: " + deleteslotid + " has been removed." );
                        JOptionPane.showMessageDialog(frame,"SlotID: " + deleteslotid + " has been removed.","Message",JOptionPane.PLAIN_MESSAGE);
                    }  
            }
        }
            
         if(e.getSource()==button_exit)
         {
            
                System.exit(0);
            
            }
          
    }  

        public static void listSlots(int indexS ,int indexV)
    {
         cp.printSlot();
    }
    
       
}
    
    


