package com.example.publication;

import com.example.users.Subject;

public class ResponseModel {
    private int id;
    private Subject subject;
    private String title;
    private String text;

    public ResponseModel(int id, Subject subject, String title, String text) {
        this.id = id;
        this.subject = subject;
        this.title = title;
        this.text = text;
    }

    public ResponseModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
