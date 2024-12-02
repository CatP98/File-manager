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
        System.out.println("createDirectory(_) Not implemented yet");
    }

    public void deleteFileDirectory(String directoryPath){
        System.out.println("deleteFileDirectory(_) Not implemented yet");
    }

    public String createFile(String text){
        return text;
    }

}

