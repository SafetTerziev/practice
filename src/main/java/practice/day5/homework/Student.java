package practice.day5.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    private int clas;
    private int numberInClass;
    private Map<String, Integer> gradesPerSubject;

    public Student(String name, String gender, int id, int clas, int numberInClass) {
        super(name, gender, id);
        this.clas = clas;
        this.numberInClass = numberInClass;
        this.gradesPerSubject = new HashMap<>();
    }

    public void addGrade(String subject, int grade){
        gradesPerSubject.put(subject, grade);
    }

    public int getGrade(String subject) {
        return gradesPerSubject.getOrDefault(subject, -1);
    }
    public int getClas() {
        return clas;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public Map<String, Integer> getGradesPerSubject() {
        return gradesPerSubject;
    }

    public void setGradesPerSubject(Map<String, Integer> gradesPerSubject) {
        this.gradesPerSubject = gradesPerSubject;
    }

    public List<String> getSubjects() {
        return new ArrayList<>(gradesPerSubject.keySet());
    }


    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }


}
