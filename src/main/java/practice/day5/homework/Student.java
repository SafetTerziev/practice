package practice.day5.homework;

public class Student extends Person {
    private int clas;
    private int numberInClass;
    private double[] subjectGrade;

    public Student(String name, String gender, int id, int clas, int numberInClass, double[] subjectGrade) {
        super(name, gender, id);
        this.clas = clas;
        this.numberInClass = numberInClass;
        this.subjectGrade = subjectGrade;
    }

    public int getClas() {
        return clas;
    }

    public int getNumberInClass() {
        return numberInClass;
    }

    public double[] getSubjectGrade() {
        return subjectGrade;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public void setNumberInClass(int numberInClass) {
        this.numberInClass = numberInClass;
    }

    public void setSubjectGrade(double[] subjectGrade) {
        this.subjectGrade = subjectGrade;
    }
}
