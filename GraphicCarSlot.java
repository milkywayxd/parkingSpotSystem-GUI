import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Write a description of class GraphicCarSlot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GraphicCarSlot extends JPanel
{
    // instance variables - replace the example below with your own
    public JFrame f;
    public JLabel staffL, vistorL;
    public JPanel staffP, vistorP;
   

    /**
     * Constructor for objects of class GraphicCarSlot
     */
    public GraphicCarSlot()
    {
        // initialise instance variables
        f = new JFrame("List All Car Slots");
        staffL = new JLabel("Staff");
        vistorL = new JLabel("Vistor");
        staffP = new JPanel();
        vistorP = new JPanel();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f.setTitle("GUI CarPark System");
        f.setSize(800,600);
        f.setLayout(null);
        //mainFrame.pack();
        f.setVisible(true);
        
        staffP.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //panelMenu.setLayout(new GridLayout(0,1));
        staffP.setBackground(Color.RED);
        staffP.setSize(100,200);
        vistorP.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        vistorP.setBackground(Color.BLUE);
        vistorP.setSize(100,200);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void displayCarSlot()
    {
        new GraphicCarSlot();
        staffP.add(staffL);
        vistorP.add(vistorL);
        f.add(staffP);
        f.add(vistorP);
       
    }
}
