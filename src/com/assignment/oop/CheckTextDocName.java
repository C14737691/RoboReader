
package com.assignment.oop;
/**
 * Assignment. Topic: Robo-Reader
 * 03/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class that checks if name of document is in correct format: document.txt
 */
public class CheckTextDocName 
{
    //class attributes
    private boolean returnVal;
    private String expectedInput;
    
    public String CheckName(String input)
    {
        try
        {
            //Checking if inputed String name is ending with ".txt"
            this.returnVal = input.endsWith(".txt");

            if(this.returnVal == false)
            {
                //add(concatenate)".txt" to a document name and save it to the String variable
                this.expectedInput = input.concat(".txt");

                System.out.println(this.expectedInput);    
            }
            else
            {
               this.expectedInput = input; 
            }
        }
            catch (Exception e) 
        {
            System.out.println(e);
        }
        return this.expectedInput.toLowerCase();
    }  
    
}
