package practice.day5.homework;

public class Teacher extends Person {

    private String school;
    private String[] subjects;
    private double salary;
    public Teacher(String name, String gender, int id, String school, String[] subjects, double salary) {
        super(name, gender, id);
        this.school = school;
        this.subjects = subjects;
        this.salary = salary;
    }
}
