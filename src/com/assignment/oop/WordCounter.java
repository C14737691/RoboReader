
package com.assignment.oop;

import java.util.ArrayList; //reference: https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
import java.util.Collections;
 /*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 01/03/16
 * @author Nataliya Kizyuk
 * *******************************
   Class that counts words occurences in the text
 */
public class WordCounter 
{ 
    //class attributes
    private String currentWord;
    private String nextWord;
    private IsUnhelpfulWord word;
    private String[] wordsArray;
    private StringBuilder docDescription;
    private ArrayList <Word> finalList; //arrayList of object - Class Word
    private int counter;
    
    //class constructor that takes in arguments:StringBuffer text(text from document),
    //                                          String excludedWords(words excluded by user)
    public WordCounter(StringBuffer text, String excludedWords)
    {
        this.finalList       = new ArrayList();//instanciating Class ArrayList
        this.wordsArray      = text.toString().split(" ");//converts string to string array
        this.docDescription  = new StringBuilder();
   
        try
        {   
            for (int i = 0; i < this.wordsArray.length; i++)
            {   //nested for loop to compare each word to all words of the array 
                this.currentWord = wordsArray[i];
                this.counter = 1;
                this.word = new IsUnhelpfulWord();//to check if current word is in the list of unhelpfull or excluded words
                if(!word.IsUnhelpfulWord(this.currentWord, excludedWords) && this.currentWord.length() > 2)
                {
                    for(int j = 0; j < this.wordsArray.length; j++)
                    {
                        this.nextWord = wordsArray[j];
                        if(this.currentWord.equals(this.nextWord))
                        {
                            this.counter++; 
                            this.wordsArray[j] = "";//remove word by assigning it to empty string
                        }   
                    }
                    Word word = new Word();//instanciating class Word
                    word.setWordValue(currentWord);
                    word.setWordOccurences(counter);
                  
                    this.finalList.add(word);
                }  
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    //method that returns ten most used words of the text document
    public String DisplayTenMostUsed()
    { 
        try
        {
        //reference for Collections: http://beginnersbook.com/2013/12/sort-arraylist-in-descending-order-in-java/
        Collections.sort(this.finalList, Collections.reverseOrder()); //to sort arrayList in descending order
        
        for(int i = 0; i < 10; i++)
        { 
            if(i == 4)//to divide string into two lines
            {
                this.currentWord = this.finalList.get(i).toString().concat("\r\n");
            }
            else
            {
                this.currentWord = this.finalList.get(i).toString().concat(",  ");
            }
            this.docDescription.append(this.currentWord.toUpperCase());
        } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return this.docDescription.toString();
    }
}

