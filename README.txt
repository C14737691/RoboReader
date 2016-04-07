This project is the Robo_Reader tool that allows a user to automatically identify what a text document is about.  . It asks user to enter the name of the document that user wants to identify and to enter the words that user wants to exclude from identification and displays ten most used words of the text document and number of their occurrences.
1.	To interact with a user the RoboScreen Class is used that provides a user with GUI. RoboScreen Class uses RoboScreenMouseListener Class to make Screen to respond on Mouse Click.
2.	The RoboScreenInput Class extends RoboScreen class and implements ActionListener to take input from the user, check the format of the input(name of the document) using CheckTextDocname Class and send it to the SetOutput() method .  
3.	The SetOutput () method sends input (name of the document) to the DocumentReader Class.
4.	DocumentReader Class contains method ReadDocument() that brings in documentName and returns StringBuffer documentContest.
5.	WordCounter Class brings in BufferString  documentContest and String excludedWords. It converts BufferString  documentContest into the array of Strings (words). It counts occurrences of each unique word in the array of words. It uses two other classes:  
6.	IsUnhelpfulWord Class that brings in the word and String excludedWords as a parameter, check the word within the array of unhelpful words + excluded words and returns true or false.
7.	Word Class that represents object “word” that has a word value and number of occurrences within the text. This object is comparable and implements Comparable interface. It has method ToString() that returns object information in the format:  word (10)
8.	WordCounter Class uses Class Word to set word value and number of word occurrences to the ArrayList<Word> that is array of objects. 
9.	Also, WordCounter Class uses the DisplayTenMostused() method. This method sorts the arrayList of objects (Word Class) on number of word occurrences in descending order and using  for loop appends ten first objects.ToString()  to the  StringBuilder.  Method DisplayTenMostused() returns strings of ten words with their occurrences.


