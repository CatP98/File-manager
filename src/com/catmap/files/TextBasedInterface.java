package com.catmap.files;

import java.util.Scanner;

public class TextBasedInterface implements UserInterface, UIEventHandler{
    private UIEventHandler handler = null;


    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while(run){
            displayMenu();

            int userChoice = -1;

            if(scanner.hasNextInt()){
                userChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                scanner.nextLine();
                System.out.println("Invalid input, please enter a number.");
                continue;
            }

            switch (userChoice){
                case 1 :
                    System.out.println("Enter directory path: ");
                    handler.onList(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Enter the name of the new directory: ");
                    handler.onCreate(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Enter directory path to delete: ");
                    handler.onDelete(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Exiting... ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Would you like to continue? (Y/N)");
            //scanner.nextLine();
            String choice = scanner.nextLine().toLowerCase();
            if(!choice.equals("y")){
                System.out.println("Goodbye!");
                //return;
                run = false;
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("File Manager Menu:");
        System.out.println("1. List Files");
        System.out.println("2. Create Directory");
        System.out.println("3. Delete a File or Directory");
        System.out.println("4. Exit program");
        System.out.println("Please enter your choice:");
    }


    @Override
    public void subscribe(UIEventHandler handler) {
        if(this.handler == null){
            this.handler = handler;
        }
    }

    @Override
    public void display(String message) {
        System.out.println(message);
    }

    @Override
    public void onList(String path) {

    }

    @Override
    public void onCreate(String path) {

    }

    @Override
    public void onDelete(String path) {

    }
}
