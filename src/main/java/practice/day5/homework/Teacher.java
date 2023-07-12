package practice.day5.homework;

import java.util.List;

public class Teacher extends Person {

    private String school;
    private List<String> subjects;
    private double salary;
    public Teacher(String name, String gender, int id, String school, List<String> subjects, double salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " " + school + " " + subjects + " " + salary;
    }

}
