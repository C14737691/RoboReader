/*This tool will allow a user to automatically identify what a document is about. 
Imagine you have a text document and you need to automatically identify what it is about.  
As a human that’s easy – just read it.  For this tool, the answer will be the ten most 
common words from the document  - in the hope that these convey the topic – it’s up to 
the user to put meaning on the set of words when they see the answer.
The most basic version of the tool is that  the user enters a file name at the command line, 
and the system returns the top ten words (with word counts)  such as Christmas (12), train(6) etc.
So the words returned should be informative.  E.g. if there is a document about 
Christmas activities in Dublin City Centre, the words from the document that might convey what this document is about are:
Christmas, Dublin, City, Centre,  Activities, Shops, People, Tree, Lights etc
It certainly wouldn’t help to have words such as “is, “a, “this”.. etc. 
And nouns help too  - so perhaps there is a way of identifying unhelpful words?

Advanced features might include things such as:
•	A GUI to run this 
•	A GUI to display the results back
•	The ability for the user to say what words to exclude form the topic finder.
•	What else?
1.the user enters a file name at the command line
2.the system returns the top ten words (with word counts)
3.the ability for the user to say what words to exclude form the topic finder
*/
package com.assignment.oop;
/*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
 */
public class RoboToolControl 
{
     public static void main(String[] args) 
    {
        //display message to the user
        System.out.println("Welcome to the Robo-Reader tool! ");
        System.out.println("This tool will allow you to automatically identify what a document is about.");
        System.out.println();//empty line
        
        //instanciating classes
        InputGetter documentName      = new InputGetter();
        InputTester properName        = new InputTester();
        DocumentReader textDocument   = new DocumentReader();
        WordCounter wordList          = new WordCounter();
        
        //textDocument.ReadDocument( properName.TestName(documentName.GetName()));
        wordList.CountWords( properName.TestName(documentName.GetName()));
    }   
}
