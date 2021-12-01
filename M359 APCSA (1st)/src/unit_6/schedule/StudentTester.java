package unit_6.schedule;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This tester file is for after they have gotten the code to work for one Student
 * and their 8 courses.  Then they will advance to this file where they will use
 * a while loop and read in a text file of student data for many students.
 */

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {

        // Create an array of Students
        Student[] myStudents;

        // In the future, this section will open a text file containing
        // data for 5-10 students.

        File myFile = new File("studentScheduleData.txt");
        Scanner file = new Scanner(myFile);

        // The first line of the text file will say how many students are
        // in the file so we know how  big to make the Student array.

        int numStudentsInFile = file.nextInt();
        file.nextLine();        // dummy read
        myStudents = new Student[numStudentsInFile];

        /*
        There will be a while loop that will read the data and create
        the objects.
         */

        int studentCount = 0;
        while(file.hasNextLine()) { // can also do while studentCount < numStudentsInFile

            // reads in name of current student
            String studentName = file.nextLine();

            // Create an array to represent data for ALL 8 classes
            Course[] allClasses = new Course[8];

            for (int per = 0; per < 8; per++) {
                // Read in data for ONE course
                String teacher = file.nextLine();
                String className = file.nextLine();
                String grade = file.nextLine();
                int period = file.nextInt();
                if (file.hasNextLine()) {       // if there is more data...
                    file.nextLine();            // dummy read needed after nextInt()
                }

                // create Course object
                Course c = new Course(teacher, className, grade, period);
                allClasses[per] = c;            // assign course to correct spot in array
            }

            myStudents[studentCount] = new Student(studentName, allClasses);
            studentCount++;
        }
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
