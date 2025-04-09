import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Write a description of class DisplayPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DisplayPanel
{
    public JPanel displayPanel; 

    /**
     * Constructor for objects of class DisplayPanel
     */
    public DisplayPanel()
    {
        displayPanel = new JPanel();
        displayPanel.setSize(600,550);
        displayPanel.setBounds(200,0,550,550);
        displayPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        //panelDisplay.setLayout(new GridLayout(0,1));
        displayPanel.setBackground(new Color(255,255,255));
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
}
