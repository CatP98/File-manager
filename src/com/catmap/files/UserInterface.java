package com.catmap.files;

public interface UserInterface {

    public void start();
    public void subscribe(UIEventHandler handler); // allow any other class as long as it implements another ui, to subscribe events that the user intyerface produces
    public void display(String message);
}
