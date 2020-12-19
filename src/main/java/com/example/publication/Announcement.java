package com.example.publication;

public class Announcement extends Publication {


    public Announcement(String title, String text) {
        super(title, text);
    }

    public Announcement(int id, String title, String text) {
        super(id, title, text);
    }

    public Announcement() {
    }
}
