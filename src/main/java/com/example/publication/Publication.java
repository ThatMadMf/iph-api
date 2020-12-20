package com.example.publication;

import com.example.users.Subject;

abstract class Publication {
    private int id;
    private int subjectId;
    private String title;
    private String text;

    public Publication() {
    }

    public Publication(int id, int subjectId, String title, String text) {
        this.id = id;
        this.subjectId = subjectId;
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

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}

