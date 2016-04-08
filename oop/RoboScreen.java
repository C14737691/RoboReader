
package com.assignment.oop;

import java.awt.*;
import javax.swing.*;
/**
 * Assignment. Topic: Robo-Reader
 * 18/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
    Class RoboScreen that extends Java Swing Class JFrame.
 *  It brings in parameters: GUI title, List of text documents
 *  And displays the GUI to user
 */
public class RoboScreen extends JFrame 
{
    //parameters/arguments
    public JButton button1, button2; 
    public JLabel imageLabel,labelCombo,label1, label2, label3;
    static JTextField TEXRFIELD1,TEXTFIELD2;
    public JComboBox listOfDoc;
    public ImageIcon icon1,icon2;
    public int columns = 30;
    
    // constructor
    public RoboScreen(String title,String[] listOfTextDocs) 
    {
    	super(title);
        
    	setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1400,900);
        setLocation(1200,600);
        setResizable(false);
        
        Font roboScreenFontPlain = new Font("Serif", Font.PLAIN, 28);
        Font roboScreenFontBold = new Font("Serif", Font.BOLD, 28);
        //REFERENCE: https://docs.oracle.com/javase/tutorial/uiswing/components/icon.html
        icon1 = new ImageIcon("image.jpg");//to add image to the label
        icon2 = new ImageIcon("image2.jpg");
        
        label1 = new JLabel("This tool will allow you to automatically identify "
                           + "what the document is about.  ",icon1,JLabel.CENTER);
        label1.setFont(roboScreenFontBold);
        add(label1);
       
        labelCombo = new JLabel("List of the text documents to read");
        labelCombo.setFont(roboScreenFontBold);
        add(labelCombo);
        
        listOfDoc = new JComboBox(listOfTextDocs);
        listOfDoc.setFont(roboScreenFontPlain);
        add(listOfDoc);
       
        //REFERENCE: https://docs.oracle.com/javase/tutorial/uiswing/components/html.html
        label2 = new JLabel("<html><font color=#CC0000; size = 6>Or you can enter the "
                           + "name of the text document from the List above in the "
                           + "format: document name.txt</font></html>",JLabel.CENTER);
        add(label2);
        
        TEXRFIELD1 = new JTextField("Enter the name of the text document here  ",columns);
        TEXRFIELD1.setToolTipText("<html><font size = 6>Click on the text field "
                                  + "to enter the document </font></html>");
        TEXRFIELD1.setFont(roboScreenFontPlain);
        add(TEXRFIELD1);
        
        button1 = new JButton("<html><font size = 5>Click here to continue</font></html>");
        add(button1);

        label3 = new JLabel("<html><font color=#CC0000; size = 6>You can enter the "
                           + "words that you would like to exclude separated by coma "
                           + "(e.g.: the, it, is, a, there):  </font></html>",JLabel.CENTER);
        add(label3);
        
        TEXTFIELD2 = new JTextField(" Enter the words to exclude here ",columns);
        TEXTFIELD2.setToolTipText("<html><font size = 6>Click on the text field "
                                  + "to enter the words</font></html>");
        TEXTFIELD2.setFont(roboScreenFontPlain);
        add(TEXTFIELD2);
      
        button2 = new JButton("<html><font size = 5>Click here to continue</font></html>");
       	add(button2);
        
        imageLabel = new JLabel("",icon2,JLabel.CENTER);
        add(imageLabel); 
         
        addMouseListener(new ScreenMouseListener());
        TEXRFIELD1.addMouseListener(new ScreenMouseListener());
        TEXTFIELD2.addMouseListener(new ScreenMouseListener());
        
       	setVisible(true);	
    }  
}

