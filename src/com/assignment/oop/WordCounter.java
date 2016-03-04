
package com.assignment.oop;
import java.io.File;
import java.util.ArrayList; //reference: https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
import java.util.Scanner;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 01/03/16
 * @author Nataliya Kizyuk
 * *******************************
 */
public class WordCounter 
{
  
    //while(fileName.hasNext()) 
    // {
        //myList.add(word);
    //}
    private File myDocument;
    private Scanner myScanner;
    private String word1;
    private String word2;
    private int counter;
    //Using Class 'ArrayList' from API to create the list(array) of words that
    //will store words from the text document and number of time it appears in the document.
    protected ArrayList<Word> myList = new ArrayList<>();
    
    public ArrayList CountWords(String DocumentName)
    {
        try
        {
            this.myDocument =  new File(DocumentName);
            this.myScanner  =  new Scanner(this.myDocument);
            
            System.out.println(this.myScanner.hasNext());
            
            while(this.myScanner.hasNext())
            {
                this.word1 = this.myScanner.next();
                this.counter = 1;
                while(this.myScanner.hasNext())
                {
                   this.word2 = this.myScanner.next();
                   if(this.word1.equals(this.word2))
                   {
                       counter++;
                   }
                }
                //Word nextWord = new Word(this.word1, this.counter);
                //this.myList.add(nextWord);
                System.out.printf(this.word1, this.counter);
            }
            this.myScanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return this.myList;
    }
}

