package com.catmap.files;

import java.io.File;

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
        }
        System.out.println("Invalid directory path : Path either does'nt exit or is not a directory.");
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
            System.out.println("Failed to delete File.");
        };
    }

    public String createFile(String text){
        return text;
    }

}

