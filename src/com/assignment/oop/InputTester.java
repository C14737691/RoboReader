
package com.assignment.oop;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
 *'TestDocumentname()'Class with 'TestName()' method that will check the format 
 * of the document's name inputed by user
 */
public class InputTester 
{
    private boolean returnVal;
    private String expectedInput;
    
    public String TestName(String documentName)
    {
        //Checking if inputed String name is ending with ".txt"
        this.returnVal = documentName.endsWith(".txt");
        
        if(this.returnVal == true)
        {
            System.out.println( "The name of the document that you want to identify is: " + documentName);
        }
        else
        {
            //add(concatenate)".txt" to a document name and save it to the String variable
            this.expectedInput = documentName.concat(".txt");
          
            System.out.println("Invalid  format of input!!! You entered " + documentName + ", instead of " + this.expectedInput);    
        }
        return this.expectedInput;
    }   
}
