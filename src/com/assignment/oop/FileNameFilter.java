
package com.assignment.oop;

import java.io.File;
import java.io.FilenameFilter;
/**
 * Assignment. Topic: Robo-Reader
 * 03/03/2016
 * @author Nataliya Kizyuk
 * * *******************************
   Class FileNameFilter that implements FilenameFilter Interface 
   It allows to filter files and display to the user only files with extension
   In our case it is text files
   * REFERENCE:https://docs.oracle.com/javase/7/docs/api/java/io/FilenameFilter.html
 */
public class FileNameFilter implements FilenameFilter 
{
    private String fileExtension;
    
    public FileNameFilter(String fileExtension) 
    {
        this.fileExtension = fileExtension;
    }
    @Override
    public boolean accept(File directory, String fileName) 
    {
        return (fileName.endsWith(this.fileExtension));
    }
    
}
