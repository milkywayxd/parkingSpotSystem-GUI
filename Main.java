import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main implements ActionListener
{
    public JFrame mainFrame;
    public JPanel panelMenu,panelDisplay;
    public JButton botton_listAll, botton_parkCar, botton_findCar, botton_removeCar, botton_addCarSlot, botton_deleteCarSlot, botton_exit;
    public JLabel label;
    public JTextField tf;
    
     public static CarPark c = new CarPark();
     public static String slotId;
     public static ParkingSlot ps = new ParkingSlot(slotId, true, false, "null", "null", true);
     public static String reg;
     public static String owner;
     public static Car car = new Car(reg,"null",true);
     public static int option; 
     public static int indexS;
     public static int indexV;
     public static boolean newslotIfStaff;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        mainFrame = new JFrame(); 
        botton_listAll = new JButton("List all car slots");
        botton_parkCar = new JButton("Park a car");
        botton_findCar = new JButton("Find a car"); 
        botton_removeCar = new JButton("Remove a car"); 
        botton_addCarSlot = new JButton("Add car slot"); 
        botton_deleteCarSlot = new JButton("Delete car slot"); 
        botton_exit = new JButton("Exit"); 
        panelMenu = new JPanel();
        this.panelDisplay = new JPanel();
        //panelMenu.setSize(200,550);
        panelMenu.setBounds(0,0,200,550);
        panelMenu.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //panelMenu.setLayout(new GridLayout(0,1));
        panelMenu.setBackground(new Color(0,204,204));
        panelDisplay.setSize(600,550);
        panelDisplay.setBounds(200,0,550,550);
        panelDisplay.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panelDisplay.setLayout(new GridLayout(0,1));
        panelDisplay.setBackground(new Color(255,255,255));
        
        panelMenu.add(botton_listAll);// initialise instance variables
        panelMenu.add(botton_parkCar);
        panelMenu.add(botton_findCar);
        panelMenu.add(botton_removeCar);
        panelMenu.add(botton_addCarSlot);
        panelMenu.add(botton_deleteCarSlot);
        panelMenu.add(botton_exit);
        
        
        mainFrame.add(panelMenu);
        mainFrame.add(panelDisplay);
        //startButton.setBackground(Color.white);
        //startButton.setLocation(200, 371); 
        //mainFrame.add(panelMenu, BorderLayout.CENTER);
        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainFrame.setTitle("GUI CarPark System");
        mainFrame.setSize(800,600);
        mainFrame.setLayout(null);
        //mainFrame.pack();
        mainFrame.setVisible(true);
        botton_listAll.addActionListener(this);  
        botton_parkCar.addActionListener(this); 
        botton_findCar.addActionListener(this); 
        botton_removeCar.addActionListener(this); 
        botton_addCarSlot.addActionListener(this); 
        botton_deleteCarSlot.addActionListener(this); 
        botton_exit.addActionListener(this); 
    }
    public static void main(String[] args) 
    {
        new Main();
        
    }  
    
   
    @Override
        public void actionPerformed(ActionEvent e)
        {
        
         /*if (e.getSource()==botton_listAll)
         {
            JFrame f = new JFrame();
            //Drawing draw = new Drawing();
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setTitle("Display All Car Slots");
            f.setSize(800,600);
            f.setLayout(new GridLayout(0,1));
            f.setBackground(new Color(0,204,204));
            f.setVisible(true);
            
            //f.add(draw,"CENTER");
         }
        
         if (e.getSource()==botton_parkCar)
         {
            c.printSlot();
            slotId =JOptionPane.showInputDialog(null,"Please enter slot ID");
            reg =JOptionPane.showInputDialog(null,"Please enter car registration");
            owner =JOptionPane.showInputDialog(null,"Please enter owner's name");
            String input =JOptionPane.showInputDialog(null,"Enter'Y' if the owner is staff, Enter'N' if the owner is not staff");
            System.out.println(owner);
           boolean carIfStaff = car.staffCar(input);
           boolean slotIfStaff = ps.isStaff(slotId);
           ParkingSlot ps = new ParkingSlot(slotId, slotIfStaff, true, reg, owner,carIfStaff);
            if (ps.slotId.matches("[A-Z]\\d\\d\\d") && ps.reg.matches("[A-Z]\\d\\d\\d\\d\\d"))
           {
           int i;
          for(i=0; i<c.slotList.size(); i++ )
          {
            String searchsid = c.slotList.get(i).slotId; 
            if (searchsid.equals(slotId))
            {
                 break;
            }
        }
        
        System.out.println(i);
        c.slotList.set(i,ps);                     
        System.out.println("SlotID: " + ps.slotId +", is occupied by " + ps.reg);
       }
    }
       else { System.out.println("Please enter correct information");}
       
    
     
            
         if(e.getSource()==botton_exit)
         {
            
                System.exit(0);
            
            }
           
        }  
       class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         g.setColor(Color.RED);  
         g.fillRect(10,10,100,200);  
         g.setColor(Color.BLUE);  
         g.fillRect(210,110,100,200);  
   }
          
        
    }*/

}
}


