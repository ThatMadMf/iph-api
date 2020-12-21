package com.example.group;

import java.util.ArrayList;
import java.util.List;

public interface GroupRepository {
    ArrayList<Integer> getSubjectIds(int id);
}
