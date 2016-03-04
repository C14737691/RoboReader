
package com.assignment.oop;

import java.io.File;
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
    private File myDocument;
    private Scanner myScanner;
    
    public void ReadDocument(String DocumentName)
    {
        try
        {
            this.myDocument =  new File (DocumentName);
            this.myScanner  =  new Scanner(this.myDocument);
            
            System.out.println(this.myScanner.hasNextLine());
            
            while(this.myScanner.hasNextLine())
            {
                String line = this.myScanner.nextLine();
                
                System.out.println(line);
            }

            this.myScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
