package rectanglegui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RectangleGUI extends JFrame implements ActionListener
{
    private Rectangle myRectangle = new Rectangle(0,0,0);
    
    private JLabel lengthLabel = new JLabel("Length");
    private JTextField lengthField = new JTextField(5);
    private JLabel heightLabel = new JLabel("Height");
    private JTextField heightField = new JTextField(5);
    private JLabel priceLabel = new JLabel("Price/sqm");
    private JTextField priceField = new JTextField(5);
    private JButton periButton = new JButton("Calculate Perimeter");
    private JButton areaButton = new JButton("Calculate Area");
    private JButton quoteButton = new JButton("Quote");
    private JTextArea displayArea = new JTextArea(2,20);
    
    public static void main(String [] args)
    {
        new RectangleGUI();
    }
    
    public RectangleGUI()
    {
        setTitle("Rectangle GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(240,135);
        setLocation(300,300);
        
        add(lengthLabel);
        add(lengthField);
        add(heightLabel);
        add(heightField);
        add(priceLabel);
        add(priceField);
        add(periButton);
        add(areaButton);
        add(quoteButton);
        add(displayArea);
        
        areaButton.addActionListener(this);
        periButton.addActionListener(this);
        quoteButton.addActionListener(this);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String lengthEntered = lengthField.getText();
        String heightEntered = heightField.getText();
        String priceEntered = priceField.getText();
        
        myRectangle.setLength(Double.parseDouble(lengthEntered));
        myRectangle.setHeight(Double.parseDouble(heightEntered));
        myRectangle.setPrice(Double.parseDouble(priceEntered));
        
        if(lengthEntered.length() == 0 || heightEntered.length() == 0 || priceEntered.length() == 0)
        {
            displayArea.setText("Price, Length and Height must be entered");
        }
        
        else
        {
            if(e.getSource() == periButton)
            {     
            displayArea.setText("The perimeter of the rectangle is " + myRectangle.calculatePerimeter());
            }
            
            else if(e.getSource() == areaButton)
            {
            displayArea.setText("The Area of the rectangle is " + myRectangle.calculateArea()); 
            }
            
            else if(e.getSource() == quoteButton && priceEntered.length() > 0)
            {
                displayArea.setText("The Price for the amount of turf you want is £." + myRectangle.calculatePrice()); 
            }
        }
    }
}