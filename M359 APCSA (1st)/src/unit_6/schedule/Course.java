package unit_6.schedule;

public class Course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    // Constructor for a Course object where all fields are passed in
    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    // Constructor for a Course object without a teacher or grade representing
    // StudyHall, Lunch, Late Arrival, or Early Dismissal


    public Course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        teacherName = "None";
        currentGrade = "None";
    }

    /**
     * Need to update this so that it adds extra tabs when needed
     * Also adjust it so that it doesn't print None and None when those
     * fields equal none
     * @return
     */

    public String toString() {
        String str = "";
        str += "Per: " + period + "\t";
        if (!currentGrade.equals("None")) {
            str += currentGrade + "\t";
        }
        else {
            str += "-  \t";
        }

        str += subject;

        int diff = 35 - subject.length();

        // add trailing spaces
        for (int i = 0; i < diff; i++) {
            str += " ";
        }

        str += "\t";

        if (!currentGrade.equals("None")) {
            str += teacherName;
        }

        return str;
    }

    // Getters and Setters
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
