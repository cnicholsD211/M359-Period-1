package unit_2.examples;

public class StudentDriver
{
    public static void main(String[] args)
    {
        // Instantiate an object
        Student mrNichols = new Student();
        // Instantiate a second object
        Student mrsDenna = new Student("Mrs.", "Denna", 12, 4.33);
        // Instantiate a third object
        Student jackson = new Student("Jackson", "Smith");

        // Print object information
        mrNichols.printInfo();
        System.out.println();
        mrsDenna.printInfo();
        System.out.println();
        jackson.printInfo();

        // Change grade level and gpa
        mrNichols.setGPA(1.5);
        jackson.setGradeLevel(10);

        // Reprint Student information
        mrNichols.printInfo();
        System.out.println();
        mrsDenna.printInfo();
        System.out.println();
        jackson.printInfo();

        // Create an output sentence to print
        String firstName = mrNichols.getFName();
        System.out.println("Hello " + firstName + " " + mrNichols.getLName());
        System.out.println("Welcome to " + mrNichols.getGradeLevel() + "th grade!");
    }
}
