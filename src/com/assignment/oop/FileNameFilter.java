/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Nataliya Kizyuk
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
