package com.example.publication;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Work extends Publication {
    private Calendar deadline = new GregorianCalendar(4000, Calendar.JANUARY , 25);

    public Work(int id, String title, String text, Calendar deadline) {
        super(id, title, text);
        this.deadline = deadline;
    }

    public Work(int id, String title, String text) {
        super(id, title, text);
    }

    public Work(String title, String text) {
        super(title, text);
    }

    public Work(String title, String text, Calendar deadline) {
        super(title, text);
        this.deadline = deadline;
    }

    public Work() {
    }



    public Calendar getDeadline() {
        return deadline;
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }
}
