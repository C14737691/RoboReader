
package com.assignment.oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.Character.isAlphabetic;
import java.util.Scanner;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
 *Method: Read Document */
public class DocumentReader 
{
    protected File myDocument;
    protected Scanner myScanner;
    protected String word;
    protected StringBuffer wordsString;
    
    public StringBuffer ReadDocument(String documentName)
    {
        try
        { 
            this.myDocument  =  new File(documentName);
            this.myScanner   =  new Scanner(this.myDocument);
            this.wordsString =  new StringBuffer();
            
            System.out.println(this.myScanner.hasNextLine());
            
            while(myScanner.hasNextLine())
            {
                //REFERENCE: http://alvinalexander.com/blog/post/java/remove-non-alphanumeric-characters-java-string
                this.word = myScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();

                this.wordsString.append(this.word).append(" ");  
            }
            this.myScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return this.wordsString;
    }
}
