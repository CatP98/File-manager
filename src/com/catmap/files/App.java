package com.catmap.files;

public class App implements UIEventHandler {

    FileManager fileManager;

    public static void main(String[] args) {
        UserInterface ui = new TextBasedInterface();
        ui.subscribe(new App());

        ui.start();


    }

    public App(){
        this.fileManager = new FileManager();
    }

    @Override
    public void onList(String path) {
        this.fileManager.listDirContent(path);
    }

    @Override
    public void onCreate(String path) {
        this.fileManager.createFile(path);
    }

    @Override
    public void onDelete(String path) {
        this.fileManager.deleteFileDirectory(path);
    }
}
