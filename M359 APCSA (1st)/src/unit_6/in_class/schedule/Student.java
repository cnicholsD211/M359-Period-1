package unit_6.in_class.schedule;

public class Student {
    // instance variables
    private Course[] classes;
    private String name;

    // full constructor
    public Student(String name, Course[] classes){
        this.name = name;
        this.classes = classes;
    }

    // partial constructor
    public Student(String name){
        this.name = name;
        this.classes = new Course[8];  // all indices are null
    }

    /**
     * Description: prints out a Student's schedule and name
     * @return a formatted output for a Student object
     */
    public String toString(){
        String output = "";
        output += "Student Name:\t" + name + "\n";
        for (Course tempCourse: classes){
            if (tempCourse == null){
                output += "No class listed\n";
            }
            else{
                output += tempCourse + "\n";
            }
        }
//        for (int i = 0; i < this.classes.length; i++){
//            if (classes[i] == null){
//                output += "No class listed\n";
//            }
//            else{
//                output += classes[i] + "\n";    // adding classes[i] automaticall calls the toString()
//            }
//        }
        return output;
    }

    // getter's and setter's
    public Course[] getClasses() {
        return classes;
    }

    public void setClasses(Course[] classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
