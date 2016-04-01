
package com.assignment.oop;
/**
 * Assignment. Topic: Robo-Reader
 * 25/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class that instancing other classes to get input from user and set required output to user 
 */
public final class TxtDocument 
{
    //class attributes
    private String docName;
    private StringBuffer docContents;
    private String wordsToExclude;
    private String docDescription;
    private CheckTextDocName document;
    
    // class constructor 
    public TxtDocument(String[] listOfDocuments)
    {
        try
        {
            //display message to the user
            System.out.println("This tool will allow you to automatically identify "
                               + "what the document is about."+"\r\n");
            System.out.println("List of the text documents to read:");
            for(int i= 0; i<listOfDocuments.length; i++)
            {
                System.out.println(i+1+")" + listOfDocuments[i]);
            }
            System.out.println("\r\n"+"Please enter the name of the text document "
                              + "from the List above in the format: document name.txt");
            this.document = new CheckTextDocName();
            //to get document name from user and check if correct format: document.txt
            this.docName = this.document.CheckName(new InputGetter().GetInput());
            System.out.println("Name of the document to read is:"+this.getDocName());

            //display message to the user
            System.out.println("Please enter the words that you would like to exclude separated by coma  ");
            //to get words to exclude from document description from user, replace all commas with white spaces
            this.wordsToExclude = new InputGetter().GetInput().trim().replaceAll(",", " ");
            System.out.println("The words to exclude are:"+this.getWordsToExclude());

            //to read document required by user
            this.docContents = new DocumentReader().ReadDocument(this.docName);

            //to get ten words most used in the document
            this.docDescription = new WordCounter(this.getDocContents(),this.wordsToExclude).DisplayTenMostUsed();

            //to display output to user
            System.out.println("The document "+this.docName+ " is about: "+ this.docDescription);  
        }  
        catch(Exception e)
        {
            System.out.println("The document not found! Please Try Again!");
        }
    }

    public String getDocName() 
    {
        return docName;
    }

    public void setDocName(String docName)
    {
        this.docName = docName;
    }

    public StringBuffer getDocContents() 
    {
        return docContents;
    }

    public void setDocContents(StringBuffer docContents) 
    {
        this.docContents = docContents;
    }

    public String getWordsToExclude() 
    {
        return wordsToExclude;
    }

    public void setWordsToExclude(String wordsToExclude) 
    {
        this.wordsToExclude = wordsToExclude;
    }
}
