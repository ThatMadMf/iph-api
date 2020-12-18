package com.example.publication;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class PublicationService {
    private final List<Publication> publications;

    public PublicationService() {
        publications = Arrays.asList(new Work("Lab1", new GregorianCalendar(2017, Calendar.JANUARY , 25)),
                new Announcement("announcement about deadline"),
                new Work("Lab3"));
    }

    public List<Publication> getAll() {
        return publications;
    }
}
