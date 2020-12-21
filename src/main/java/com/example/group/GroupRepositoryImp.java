package com.example.group;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupRepositoryImp implements GroupRepository {
    private ArrayList<Group> publications = new ArrayList<>(Arrays.asList(
            new Group(1, "KC-172", new ArrayList<>(Arrays.asList(1, 2, 3))),
            new Group(2, "KC-173", new ArrayList<>(Arrays.asList(1, 3, 4)))
    ));
}
