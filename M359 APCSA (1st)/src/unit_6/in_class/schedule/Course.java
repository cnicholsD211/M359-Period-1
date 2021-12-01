package unit_6.in_class.schedule;

public class Course {
    // instance variables
    private String teacher;
    private String grade;
    private String subject;
    private int period;

    // full constructor
    public Course(String teacher, String grade, String subject, int period) {
        this.teacher = teacher;
        this.grade = grade;
        this.subject = subject;
        this.period = period;
    }

    // partial constructor
    public Course(String subject, int period){
        this.teacher = "None";
        this.grade = "-";
        this.subject = subject;
        this.period = period;
    }

    /**
     * Description: Supplies a printout for Course object
     * @return the output for a Course object
     */
    public String toString(){
        // 1.   grade   subject     teacher
        String output = "";
        output += period + ".\t" + grade;
        if (grade.length() == 1){
            output += " ";
        }
        output += "\t" + subject;
        while (output.length() < 37){
            output += " ";
        }
        output += teacher;
        return output;
    }

    // getter's and setter's
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
