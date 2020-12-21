package com.example.subject;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class SubjectRepositoryImp implements SubjectRepository {
    private final ArrayList<Subject> subjects = new ArrayList<>(Arrays.asList(
            new Subject(1, "Math", new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(1))),
            new Subject(2, "Web", new ArrayList<>(Arrays.asList(1)), new ArrayList<>(Arrays.asList(1))),
            new Subject(3, "Economy", new ArrayList<>(Arrays.asList(1, 2)), new ArrayList<>(Arrays.asList(1))),
            new Subject(4, "PE", new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(2)))
    ));

    public Subject getSubjectById(int id) {
        return subjects.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }


}
