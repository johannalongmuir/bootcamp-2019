package com.manchesterdigital.studentchallenge;

public class Students {
    /*
    Given  list of students for English, German and French, collect the students into individual groups
    such that
    - all students are specific language, then each of those
    - Each student must have a score greater than 50, then each of those
    - Each students name must start with A or S

        3 groups.
        Print your final list.
     */

    private final String name;
    private final Integer score;
    private final String languageClass;

    public Students(String name, Integer score, String languageClass) {
        this.name = name;
        this.score = score;
        this.languageClass = languageClass;
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }

    public String getLanguageClass() {
        return languageClass;
    }

    @Override
    public String toString() {
        return "Students: " + name + '\'' +
                ", score = " + score +
                ", Class = " + languageClass + '\'';
    }
}
