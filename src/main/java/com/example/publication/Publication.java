package com.example.publication;

public class Publication {
    private String text;

    public Publication(String text) {
        this.text = text;
    }

    public Publication() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

