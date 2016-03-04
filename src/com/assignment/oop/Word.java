
package com.assignment.oop;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 02/03/16
 * @author Nataliya Kizyuk
 * *******************************
 */
public class Word 
{
   private String wordValue;
   private int    wordNumber;

    public Word(String wordValue,int wordNumber) 
    {
        this.wordValue  = wordValue;
        this.wordNumber = wordNumber;
    }
    
    public String toString() 
    {
        return this.getWordValue()+","+this.getWordNumber();
    }

    /**
     * @return the wordValue
     */
    public String getWordValue() {
        return wordValue;
    }

    /**
     * @param wordValue the wordValue to set
     */
    public void setWordValue(String wordValue) {
        this.wordValue = wordValue;
    }

    /**
     * @return the wordNumber
     */
    public int getWordNumber() {
        return wordNumber;
    }

    /**
     * @param wordNumber the wordNumber to set
     */
    public void setWordNumber(int wordNumber) {
        this.wordNumber = wordNumber;
    }
    
}
