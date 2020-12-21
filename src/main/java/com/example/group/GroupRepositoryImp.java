package com.example.group;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

@Repository
public class GroupRepositoryImp implements GroupRepository {
    private final ArrayList<Group> groups = new ArrayList<>(Arrays.asList(
            new Group(1, "KC-172", new ArrayList<>(Arrays.asList(1, 2, 3))),
            new Group(2, "KC-173", new ArrayList<>(Arrays.asList(1, 3, 4)))
    ));

    @Override
    public ArrayList<Integer> getSubjectIds(int id) {
        return Objects.requireNonNull(groups.stream().filter(g -> g.getId() == id).findFirst().orElse(null)).getSubjects();
    }
}
