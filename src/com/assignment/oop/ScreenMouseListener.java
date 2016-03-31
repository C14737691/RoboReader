/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop;

import java.awt.event.*;
import javax.swing.*;
/**
 * Assignment. Topic: Robo-Reader
 * 18/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class that contains method used by RoboScreen to implement MouseListener
 */
public class ScreenMouseListener extends JFrame implements MouseListener
{   
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        System.out.println("mouse is working ");
        
        if( e.getSource()== RoboScreen.textField1)
        {  
           RoboScreen.textField1.selectAll();
           RoboScreen.textField1.setText("");
        }
        else if( e.getSource()== RoboScreen. textField2)
        {
            RoboScreen.textField2.selectAll();
            RoboScreen.textField2.setText("");
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
