import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput implements ActionListener
{
    // instance variables - replace the example below with your own
    public JFrame inputFrame;
    public JPanel inputPanel;
    public JButton button_OK, button_Cancel;
    
    /**
     * Constructor for objects of class UserInput
     */
    public UserInput()
    {
        inputFrame = new JFrame("User Input");
        inputPanel = new JPanel();
        inputFrame.getContentPane();
        button_OK = new JButton("Ok");
        button_Cancel = new JButton("Cancel");
        Dimension size1 = button_OK.getPreferredSize();
        Dimension size2 = button_Cancel.getPreferredSize();
        button_OK.setBounds(150, 200, size1.width, size1.height);
        button_Cancel.setBounds(220, 200, size2.width, size2.height);
        button_OK.addActionListener(this);  
        button_Cancel.addActionListener(this); 
        Label t1= new Label("Please enter slot ID");
        TextField sd = new TextField("", 20);
        Label t2= new Label("Please enter car registration");
        TextField r = new TextField("", 20);
        Label t3= new Label("Please enter owner's name");
        TextField o = new TextField("", 20);
        Label t4= new Label("Enter'Y' if the owner is staff, Enter'N' if the owner is not staff");
        TextField ip = new TextField("", 20);
        inputPanel.setSize(500,350);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        inputPanel.setLayout(null);
        //panel.setLayout(new GridLayout(0,1));
        inputPanel.setBackground(new Color(0,204,204));
        inputPanel.add(t1);
        inputPanel.add(sd);
        inputPanel.add(t2);
        inputPanel.add(r);
        inputPanel.add(t3);
        inputPanel.add(o);
        inputPanel.add(t4);
        inputPanel.add(ip);
        inputPanel.add(button_OK);
        inputPanel.add(button_Cancel);
        inputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        inputFrame.add(inputPanel);
        inputFrame.setSize(500,350);
        inputFrame.setVisible(true);
        
    }

     @Override
        public void actionPerformed(ActionEvent e)
        {
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
}
}
