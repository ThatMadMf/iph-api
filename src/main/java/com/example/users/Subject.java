package com.example.users;

public class Subject {
    private int id;
    private String title;

    public Subject(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Subject() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
