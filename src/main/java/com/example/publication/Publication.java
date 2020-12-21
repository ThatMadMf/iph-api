package com.example.publication;

import java.time.LocalDateTime;

public class Publication {
    private int id;
    private int subjectId;
    private String title;
    private String text;
    private int authorId;
    private LocalDateTime creationDate;
    private LocalDateTime deadline;

    public Publication() {
    }

    public Publication(int id, int subjectId, String title, String text, int authorId) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
        this.creationDate = LocalDateTime.now();
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }
}

