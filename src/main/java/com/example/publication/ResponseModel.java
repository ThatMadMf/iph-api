package com.example.publication;

import com.example.subject.Subject;
import com.example.users.Teacher;
import com.example.users.User;

import java.time.LocalDateTime;

public class ResponseModel {
    private int id;
    private Subject subject;
    private String title;
    private String text;
    private User author;
    private LocalDateTime creationDate;
    private LocalDateTime deadline;

    public ResponseModel(int id, Subject subject, String title, String text, User author, LocalDateTime creationDate, LocalDateTime deadline) {
        this.id = id;
        this.subject = subject;
        this.title = title;
        this.text = text;
        this.author = author;
        this.creationDate = creationDate;
        this.deadline = deadline;
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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(Teacher author) {
        this.author = author;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
