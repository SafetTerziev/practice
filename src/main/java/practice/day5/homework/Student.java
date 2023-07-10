package practice.day5.homework;

import java.util.ArrayList;

public class Student extends Person {
    private int clas;
    private int numberInClass;
    private ArrayList<GradesForSubjects> gradesForSubjects;

    public Student(String name, String gender, int id, int clas, int numberInClass, ArrayList<GradesForSubjects> gradesForSubjects) {
        super(name, gender, id);
        this.clas = clas;
        this.numberInClass = numberInClass;
        this.gradesForSubjects = gradesForSubjects;
    }

    public int getClas() {
        return clas;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public ArrayList<GradesForSubjects> getGradesForSubjects() {
        return gradesForSubjects;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    public void setGradesForSubjects(ArrayList<GradesForSubjects> gradesForSubjects) {
        this.gradesForSubjects = gradesForSubjects;
    }


}
