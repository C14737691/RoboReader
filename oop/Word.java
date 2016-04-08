
package com.assignment.oop;
/*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 02/03/16
 * @author Nataliya Kizyuk
 * *******************************
 Class Word that is object of ArrayList and implements Interface Comparable
 It brings in parameters: String wordValue,int wordOccurences.
*reference: http://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/*/
public final class Word implements Comparable<Word>
{
    //class attributes
    private String wordValue;
    private int    wordOccurences;
    
    // class constructor  
    public Word(String wordValue,int wordOccurences) 
    {
        this.setWordValue(wordValue);
        this.setWordOccurences(wordOccurences);   
    }
    
    @Override //method that compares word's occurences from reference above
    public int compareTo(Word compareWord) 
    {
        int compareOccurences =((Word)compareWord).getWordOccurences();

        /* For Descending order */
        return this.wordOccurences - compareOccurences;
    }
    
   @Override // method that returns string in format: word (occurences)
    public String toString() 
    {
        return this.wordValue+" ("+Integer.toString(this.wordOccurences)+")";
    }

    /**
     * @return the wordValue
     */
    public String getWordValue() 
    {
        return wordValue;
    }

    /**
     * @param wordValue the wordValue to set
     */
    public void setWordValue(String wordValue) 
    {
        this.wordValue = wordValue;
    }

    /**
     * @return the wordNumber
     */
    public int getWordOccurences() 
    {
        return wordOccurences;
    }

    /**
     * @param wordOccurences the wordNumber to set
     */
    public void setWordOccurences(int wordOccurences) 
    {
        this.wordOccurences = wordOccurences;
    }
}
