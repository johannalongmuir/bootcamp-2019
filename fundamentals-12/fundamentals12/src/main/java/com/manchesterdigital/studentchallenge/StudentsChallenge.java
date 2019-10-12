package com.manchesterdigital.studentchallenge;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentsChallenge {

    /*
        Given  list of students for English, German and French, collect the students into individual groups
        such that
            - all students are specific language, then each of those
            - Each student must have a score greater than 50, then each of those
            - Each students name must start with A or S
    3 groups.
    Print your final list.
 */

    public static void main(String[] args) {
        Students amy = new Students("Amy", 40, "French");
        Students jane = new Students("Jane", 55, "French");
        Students josh = new Students("Josh", 20, "French");
        Students catherine = new Students("Catherine", 55, "German");
        Students peter = new Students("Peter", 55, "German");
        Students sarah = new Students("Sarah", 50, "German");
        Students sebastian = new Students("Sebastian", 55, "English");
        Students tom = new Students("Tom", 30, "English");
        Students ben = new Students("Ben", 50, "English");
        Students stan = new Students("Stan", 55, "English");


        List<Students> student = List.of(amy, jane, josh, catherine, peter, sarah, sebastian, tom, ben, stan);

        /* can do this for each language

        List<Students> english = student.stream()
                .filter(students -> students.getLanguageClass().equalsIgnoreCase("english"))
                .filter(students -> students.getScore() > 50)
                .filter(students -> students.getName().startsWith("A") || students.getName().startsWith("S"))
                .collect(Collectors.toList());
         */
        // System.out.println("english = " + english);

        System.out.println("English = " + extractStudents(student, "English", 55));
        System.out.println("German = " + extractStudents(student, "German", 20));
        System.out.println("French = " + extractStudents(student, "French", 20));

    }

    private static List<Students> extractStudents(List<Students> student, String subject, Integer minScore) {
        return student.stream()
                .filter(students -> students.getLanguageClass().equalsIgnoreCase(subject))
                .filter(students -> students.getScore() > minScore)
                .filter(students -> students.getName().startsWith("A") || students.getName().startsWith("S"))
                .collect(Collectors.toList());

    }

    // one step further. Remember my names are slightly different to Assad. His
    // Student is Students
    // students is student
    // student is students
    // knows what type you are dealing with, knows anything to do with Students is type
    // cntl space to see options
    // below is student filter
    // predicate everything that has to be true to match a student.
    // can make as complicated or as simple as you want
    // refacted the extractStudents.
    // centralised the filter
    // predicate evalute something. Predicate does one at a time
    // swapped around so extractStudentsUsingPredicate on top


    private static List<Students> extractStudentsUsingPredicate (List<Students> student, String subject, Integer minScore) {
        return student.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }

    private static Predicate<Students> studentFilter (String subject, Integer minScore){
        return students -> students.getLanguageClass().equalsIgnoreCase(subject) &&
                students.getScore() > minScore &&
                (students.getName().startsWith("A") || students.getName().startsWith("S"));
    }





}
