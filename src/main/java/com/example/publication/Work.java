package com.example.publication;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Work extends Publication {
    //temporarily
    private Calendar deadline = new GregorianCalendar(4000, Calendar.JANUARY , 25);

    public Work(String text, Calendar deadline) {
        super(text);
        this.deadline = deadline;
    }

    public Work(String text) {
        super(text);
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
