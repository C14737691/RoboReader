
package com.assignment.oop;

import java.util.Scanner;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
 */
public class InputGetter 
{
    protected String document_name;
    protected Scanner inputReader;
    
    public String GetName()
    {
        //to get input (file name)from user from command prompt
        this.inputReader = new Scanner(System.in);
        
        //display message to the user
        System.out.println("Please enter the name of the text document in the format - document_name.txt: ");

        //Getting input in String format
        this.document_name = this.inputReader.nextLine();
        
        return this.document_name;
    }  
}
