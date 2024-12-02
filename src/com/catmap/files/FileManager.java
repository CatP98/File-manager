package com.catmap.files;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileManager {

    public void listDirContent(String directoryPath) {
        File directory = new File(directoryPath);

        if(directory.exists() && directory.isDirectory()) {
            File[] contents = directory.listFiles();

            if(contents != null) {
                for(File file : contents) {
                    if(file.isDirectory()) {
                        System.out.println("[DIR]: " + file.getName());
                    } else {
                        System.out.println("[FILE]: " + file.getName());
                    }
                }
            } else {
                System.out.println("Directory is empty");
            }
        } else {
        System.out.println("Invalid directory path : Path either doesn't exit or is not a directory.");
        }
    }

    public void createDirectory(String directoryPath){
        File directory = new File(directoryPath);

        if(directory.mkdir()) {
            System.out.println("Successfully created Directory.");
        } else {
            System.out.println("Faliked to create Directory");
        }
    }

    public void deleteFileDirectory(String directoryOrFilePath){
        File file = new File(directoryOrFilePath);

        if(file.delete()) {
            System.out.println("Successfully Deleted the file!");
        } else {
            System.out.println("Failed to delete File. That directory/file does not exist. ");
        };
    }

    public boolean createFile(String filePath) {
        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + filePath);
                return true;
            } else {
                System.out.println("File already exists: " + filePath);
                return false;
            }
        } catch (IOException e){
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            return false;
        }
    }
}

