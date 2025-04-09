

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ButtonSelection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ButtonSelection implements ActionListener
{
    // instance variables - replace the example below with your own
    JFrame frame = new JFrame("Button Selection");
    JButton option1 = new JButton("List All Car Slots");
    Drawing draw = new Drawing();
   
    int shape = 0;

    /**
     * Constructor for objects of class ButtonSelection
     */
    public ButtonSelection()
    {
        JPanel pane = (JPanel)frame.getContentPane();
        pane.add(draw, "Center");
        JPanel panel = new JPanel();
        panel.add(option1);
        frame = new JFrame(); 
        //frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("CAR PARK SYSTEM");
        frame.pack();
        frame.setVisible(true);
        frame.add(panel);
        frame.add(pane);
        //frame.getContentPane().setBackground(new Color(0x523336));
        
        pane.add(panel,"North");
       
        frame.pack();
        
        option1.addActionListener(this);
        //frame.add(label);// initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
    
    public static void main(String[] args) 
    {
        new ButtonSelection();
        
    }  
    
     class Drawing extends JComponent
   {
      public void paint(Graphics g)
      {
         if (shape == 1)
         {
            g.setColor(Color.blue);
            g.drawRect(50, 50, 100, 100);
         }
         else
         {
            g.setColor(Color.green);
            g.drawOval(50, 50, 100, 100);
         }
        
      }     
   }
   
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == option1)
         {shape = 1;}
      
      draw.repaint();
   }
} 


