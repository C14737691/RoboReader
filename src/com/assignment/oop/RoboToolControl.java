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

import java.awt.Font;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import javax.swing.JFrame;

/*
 * *******************************
 * Assignment. Topic: Robo-Reader
 * Date: 28/02/16
 * @author Nataliya Kizyuk
 * *******************************
 */
public class RoboToolControl //main class
{
    public String[] listOfTextFiles;
    
    public static void main(String[] args)throws Exception
    {
        String title = "Welcome to the Robo-Reader tool!";
        System.out.println(title);
        
        //instancing classes to list text files (".txt") in current directory (".")
        //Reference: http://www.codejava.net/java-se/file-io/how-to-list-files-and-directories-in-a-directory
        FileNameFilter fileFilter = new FileNameFilter(".txt");
        File currentDir = new File(".");
        
        // String array to store the names of all files ending with .txt 
        String[]listOfTextFiles = currentDir.list(fileFilter);

        //instancing class TxtDocument to run current program from terminal
        TxtDocument userDocument = new TxtDocument(listOfTextFiles);
         
        //instancing class RoboScreenActionListener to run current program from Java GUI, get input from user and display result
        //RoboScreenActionListener inputAction = new RoboScreenActionListener(title,listOfTextFiles); 
    }   
}
