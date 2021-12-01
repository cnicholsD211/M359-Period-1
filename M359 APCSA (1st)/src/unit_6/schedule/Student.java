package unit_6.schedule;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name) {
        this.name = name;
        myClasses = new Course[8];      // 8 period day
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public String toString() {
        String str = "";

        str += "Student Name: " + name + "\n";
        for (Course c: myClasses) {
            if (c != null) {    // ensures there is a valid class
                str += c.toString() + "\n";
            }
            else {
                str += "No class listed" + "\n";
            }
        }

        return str;
    }

    /**
     * This method returns a single Course based on period num 1-8
     *
     * @param num period number 1-8
     * @return The Course associated with that period
     */
    public Course getClassPeriod(int num) {
        return myClasses[num - 1];
    }

    /**
     * Updates a students schedule for the Course at that period
     *
     * @param num the period in the day 1-8
     * @param course the Course object to assign to that period
     */
    public void setClassPeriod(int num, Course course) {
        myClasses[num - 1] = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getAllClasses() {
        return myClasses;
    }

}
