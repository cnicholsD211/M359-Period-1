package unit_6.schedule;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OriginalStudentTester {
    public static void main(String[] args) throws FileNotFoundException {

        // Create an array of Students
        Student[] myStudents;

        // In the future, this section will open a text file containing
        // data for 5-10 students.

        // The first line of the text file will say how many students are
        // in the file so we know how  big to make the Student array.

        // For testing of the rest of the code, I have created an array
        // with 5 student objects
        myStudents = new Student[5];

        /*
        There will be a while loop that will read the data and create
        the objects.
         */


        String name = "Samantha King";
        Course per1 = new Course("Denna", "Java", "A+", 1);
        Course per2 = new Course("Lernor", "Spanish 2", "B+", 2);
        Course per3 = new Course("Vlaming", "Adv Ed", "A+", 3);
        Course per4 = new Course("Lunch", 4);
        Course per5 = new Course("Piggott", "Trig Calc A", "A", 5);
        Course per6 = new Course("Graba", "AP Bio", "B", 6);
        Course per7 = new Course("Ganas", "AP Psych", "A", 7);
        Course per8 = new Course("Early Dismissal", 8);

        Course[] schedule = {per1, per2, per3, per4, per5, per6, per7, per8};

        myStudents[0] = new Student("Shannon Denna", schedule);
        myStudents[1] = new Student("Jerry Moon", schedule);

        printAllStudentSchedules(myStudents);

    }

    /**
     * This method nicely prints the schedules for all Students in the Student array
     * @param allStudents
     */
    public static void printAllStudentSchedules(Student[] allStudents) {
        for (Student s: allStudents) {
            if (s != null) {    // ensures only valid Students try to print
                System.out.println(s);
                System.out.println();
            }
        }
    }
}
