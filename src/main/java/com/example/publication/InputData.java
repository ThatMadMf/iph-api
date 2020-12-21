package com.example.publication;

import java.time.LocalDateTime;
import java.util.Calendar;

public class InputData {
    private int id;
    private int subjectId;
    private String title;
    private String text;
    private int authorId;
    private LocalDateTime deadline = LocalDateTime.of(4000, 1, 25, 0, 0);;
    private Type type = Type.ANNOUNCEMENT;

    public InputData(int id, int subjectId, String title, String text, int authorId, Type type) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
        this.type = type;
    }

    public InputData(int id, int subjectId, String title, String text, int authorId, LocalDateTime deadline, Type type) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
        this.deadline = deadline;
        this.type = type;
    }

    public InputData(int id, int subjectId, String title, String text, int authorId) {
        this.id = id;
        this.subjectId = subjectId;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
    }

    public InputData() {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
