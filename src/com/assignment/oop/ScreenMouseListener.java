
package com.assignment.oop;

import java.awt.event.*;
import javax.swing.*;
/**
 * Assignment. Topic: Robo-Reader
 * 18/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class ScreenMouseListener that contains method used by RoboScreen to implement MouseListener
 */
public class ScreenMouseListener extends JFrame implements MouseListener
{   
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        System.out.println("mouse is working ");
        
        if( e.getSource()== RoboScreen.TEXRFIELD1)
        {  
           RoboScreen.TEXRFIELD1.selectAll();
           RoboScreen.TEXRFIELD1.setText("");
        }
        else if( e.getSource()== RoboScreen. TEXTFIELD2)
        {
            RoboScreen.TEXTFIELD2.selectAll();
            RoboScreen.TEXTFIELD2.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Mouse clicked on empty space");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
  
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
       
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {

    }  
    
}
