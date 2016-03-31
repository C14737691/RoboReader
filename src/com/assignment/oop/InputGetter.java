
package com.assignment.oop;

import java.util.Scanner;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
  Class that takes input from the user
 */
public class InputGetter 
{
    //class attributes
    private String userInput;
    private Scanner inputReader;
    
    //class method that reads input and returns String
    public String GetInput()
    {
        //to get input (file name)from user from command prompt
        this.setInputReader(new Scanner(System.in));

        //Getting input in String format
        this.setUserInput(this.getInputReader().nextLine());
        
        return this.getUserInput();
    }  

    /**
     * @return the document_name
     */
    public String getUserInput() 
    {
        return userInput;
    }

    /**
     * @param userInput the document_name to set
     */
    public void setUserInput(String userInput) 
    {
        this.userInput = userInput;
    }

    /**
     * @return the inputReader
     */
    public Scanner getInputReader() 
    {
        return inputReader;
    }

    /**
     * @param inputReader the inputReader to set
     */
    public void setInputReader(Scanner inputReader)
    {
        this.inputReader = inputReader;
    }
    
}
