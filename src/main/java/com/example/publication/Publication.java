package com.example.publication;

abstract class Publication {
    private int id;
    private String title;
    private String text;

    public Publication() {
    }

    public Publication(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public Publication(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

