package com.example.publication;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class InputData {
    private int id;
    private String title;
    private String text;
    private Calendar deadline = new GregorianCalendar(4000, Calendar.JANUARY , 25);
    private Type type = Type.ANNOUNCEMENT;


    public InputData() {
    }

    public InputData(int id, String title, String text, Type type) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.type = type;
    }

    public InputData(int id, String title, String text, Calendar deadline, Type type) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.deadline = deadline;
        this.type = type;
    }

    public InputData(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
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

    public Calendar getDeadline() {
        return deadline;
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}