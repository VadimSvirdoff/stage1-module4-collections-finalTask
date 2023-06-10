package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        HashSet<String> lessons = new HashSet();
        timetable.forEach((key,value) -> {
            value.forEach(lesson -> {
                lessons.add(lesson);
            });
        });
        return lessons;
    }
}
