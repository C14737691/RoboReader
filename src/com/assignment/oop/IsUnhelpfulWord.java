
package com.assignment.oop;
/**
 * Assignment. Topic: Robo-Reader
 * 30/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class that contains array of unhelpful words and checks if passed word is unhelpful
 */
public class IsUnhelpfulWord 
{
    //class attributes
    private String[] unhelpfulWords;
    private String wordString;
    private boolean index;
    
    //method that takes in parameters: word and excludedByUserWords and returns: true or false
    public boolean IsUnhelpfulWord(String word, String excludedByUser )
    {
        try
        {
            this.wordString = "all are was were which has and for with you your "
                            + "him his she her our its the that they them their "
                            + "there this those ";
            //adds excluded words to wordString and converts the string to array of strings
            this.unhelpfulWords = this.wordString.concat(excludedByUser).split(" ");
            for (int i = 0; i < this.unhelpfulWords.length; i++) 
            {
                if (this.unhelpfulWords[i].trim().compareToIgnoreCase(word.trim()) == 0)
                {
                    this.index = true;
                    break;
                } 
                else 
                {
                    this.index = false; 
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return this.index;
    }
    
}
