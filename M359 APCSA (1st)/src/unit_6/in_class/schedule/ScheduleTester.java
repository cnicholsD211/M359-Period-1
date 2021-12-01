package unit_6.in_class.schedule;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScheduleTester {
    public static void main(String[] args) throws FileNotFoundException {
        // instantiate 8 class objects
        Course per1 = new Course("Mr. Nichols", "A+", "Math", 1);
        Course per2 = new Course("Mrs. Enk", "A", "English", 2);
        Course per3 = new Course("Ms. Zinger", "A-", "Science", 3);
        Course per4 = new Course("Ms. Wrzala", "A-", "Social Studies", 4);
        Course per5 = new Course("Lunch", 5);
        Course per6 = new Course("Mr. Hogrefe", "A+", "Gym", 6);
        Course per7 = new Course("Study Hall", 7);
        Course per8 = new Course("Sra. Clement", "A-", "Foreign Language", 8);

        // Initialize array of Courses
        Course[] myClasses = {per1, per2, per3, per4, per5, per6, per7, per8};

        // Initialize a Student object
        Student oliver = new Student("Oliver", myClasses);

        // print oliver's classes
        System.out.println(oliver);

        // Begin file read
        File studentData = new File("studentScheduleData.txt"); // create File object
        Scanner inF = new Scanner(studentData); // create Scanner for text file
        System.out.println("*** BEGIN FILE READ ***");

        int num = inF.nextInt();
        inF.nextLine();  // dummy read to scan the "\n" that remains
        Student[] stuList = new Student[num];   // create array of Student objects
        int index = 0;

        // loop through the entire textfile and build several Student objects
        while (inF.hasNextLine()){
            String name = inF.nextLine();
            Course[] schedule = new Course[8]; // all value are null!!!
            for (int i = 0; i < 8; i++){
                String teacherName = inF.nextLine();
                String courseName = inF.nextLine();
                String studentGrade = inF.nextLine();
                int periodNum = inF.nextInt();

                // check if there is another character to scan
                if (inF.hasNextLine())
                    inF.nextLine(); // consume the "\n" that remains

                // test if the grade is "None"
                Course tempCourse;
                if (studentGrade.equals("None")){
                    tempCourse = new Course(courseName, periodNum);
                }
                else {
                    tempCourse = new Course(teacherName, studentGrade, courseName, periodNum);
                }
                schedule[i] = tempCourse;
            }
            // instantiate a Student object
            Student tempStu = new Student(name, schedule);

            // add the Student to the stuList
            stuList[index] = tempStu;
            index++;
        }
        // call the printAll method to display all Students
        printAll(stuList);
    }

    // Create the printAll static method that displays every student
    public static void printAll(Student[] studentList){
        // traditional for loop
//        for (int i = 0; i < studentList.length; i++){
//            if (studentList[i] != null){
//                System.out.println(studentList[i]);
//            }
//        }

        // enhanced for loop
        for (Student tempStu: studentList){
            if (tempStu != null){
                System.out.println(tempStu);
            }
        }
    }
}
