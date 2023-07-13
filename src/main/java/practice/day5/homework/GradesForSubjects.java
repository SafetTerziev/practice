package practice.day5.homework;

public class GradesForSubjects {

    private String subject;
    private double grades;

    public GradesForSubjects(String subject, double grades) {
        this.subject = subject;
        this.grades = grades;
    }

    public String getSubject() {
        return subject;
    }

    public double getGrades() {
        return grades;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}
