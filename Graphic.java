import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Write a description of class Graphic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graphic extends JPanel
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Graphic
     */
    public Graphic()
    {
        // initialise instance variables
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
  public void paintComponent(Graphics g) {
    super.paintComponent(g);  
    g.setColor(Color.RED);  
    g.fillRect(10,10,100,200);  
    g.setColor(Color.BLUE);  
    g.fillRect(210,110,100,200);  
    
    
  }

  public Dimension getPreferredSize() {
    return new Dimension(200,100 ); // appropriate constants
  }
}
    
