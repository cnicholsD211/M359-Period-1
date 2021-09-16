package unit_2.examples;

public class Student
{
    // Instance variables
    private String fName, lName;
    private int gradeLevel;
    private double gpa;

    // Default constructor - no parameters
    public Student()
    {
        fName = "John";
        lName = "Doe";
        gradeLevel = 9;
        gpa = 0.0;
    }

    // Full constructor - accept every instance variable as a parameter
    public Student(String firstName, String lastName, int grade, double gradeAvg)
    {
        fName = firstName;
        lName = lastName;
        gradeLevel = grade;
        gpa = gradeAvg;
    }

    // Full constructor - accept every instance variable as a parameter
    public Student(double gradeAvg, String lastName, String firstName, int grade)
    {
        fName = firstName;
        lName = lastName;
        gradeLevel = grade;
        gpa = gradeAvg;
    }

    // Partial constructor = accepts SOME instance variables as parameters
    public Student(String firstName, String lastName)
    {
        fName = firstName;
        lName = lastName;
        gpa = 0.0;   // default
        gradeLevel = 9; // default
    }

    // METHODS BELOW CONSTRUCTORS

    // Print out the information for the Student object
    public void printInfo()
    {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
    }

    // SETTER METHODS BELOW

    // Setter method for gpa
    public void setGPA(double newGPA)
    {
        gpa = newGPA;
    }

    // Setter method for gradeLevel
    public void setGradeLevel(int newGradeLevel)
    {
        gradeLevel = newGradeLevel;
    }

    // GETTER METHODS BELOW

    // Getter method for fName
    public String getFName()
    {
        return fName;
    }

    // Getter method for lName
    public String getLName()
    {
        return lName;
    }

    // Getter method for gpa
    public double getGPA()
    {
        return gpa;
    }

    // Getter method for gradeLevel
    public int getGradeLevel()
    {
        return gradeLevel;
    }
}
