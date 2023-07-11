package practice.day5.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void printStudentsInfo() {
        System.out.println("Students: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("ID: " + student.getId());
            System.out.println("Class: " + student.getClas());
            System.out.println("Number in class: " + student.getNumberInClass());
        }
    }
    public void printTeachersInfo() {
        System.out.println("Teachers: ");
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Gender: " + teacher.getGender());
            System.out.println("ID: " + teacher.getId());
            System.out.println("School: " + teacher.getSchool());
            System.out.println("Subject: " + teacher.getSubjects());
            System.out.println("Salary: " + teacher.getSalary());
        }
    }
    public Student studentsHighestGrade(String subject) {
        Student studentsHighestGrade = null;
        double highestGrade = 0;

        for (Student student : students) {
            int grade = student.getGrade(subject);
            if (grade != -1 && (studentsHighestGrade == null || grade > highestGrade)) {
                highestGrade = grade;
                studentsHighestGrade = student;
            }
        }
        return studentsHighestGrade;
    }

    public Student studentsLowestGrade(String subject) {
        Student studentWithLowestGrade = null;
        int lowestGrade = 6;

        for (Student student : students) {
            int grade = student.getGrade(subject);
            if (grade != -1 && grade < lowestGrade) {
                lowestGrade = grade;
                studentWithLowestGrade = student;
            }
        }

        return studentWithLowestGrade;
    }

    public double averageSalary() {
        double totalSalary = 0;
        for (Teacher teacher : teachers) {
            totalSalary += teacher.getSalary();
        }
        return totalSalary / teachers.size();
    }
    public double averageGradeOfStudent(Student student) {
        int totalGrades = 0;
        int numSubjects = student.getSubjects().size();

        for (String subject : student.getSubjects()) {
            int grade = student.getGrade(subject);
            if (grade != -1) {
                totalGrades += grade;
            } else {
                numSubjects--;
            }
        }

        return numSubjects != 0 ? (double) totalGrades / numSubjects : 0;
    }
    public double classAverageGrade() {
        double totalGrades = 0;
        int numStudents = students.size();

        for (Student student : students) {
            totalGrades += averageGradeOfStudent(student);
        }

        return numStudents != 0 ? totalGrades / numStudents : 0;
    }

    public String subjectWithHighestGrade(Student student) {
        String subjectWithHighestGrade = null;
        int highestGrade = 2;

        for (String subject : student.getSubjects()) {
            int grade = student.getGrade(subject);
            if (grade > highestGrade) {
                highestGrade = grade;
                subjectWithHighestGrade = subject;
            }
        }

        return subjectWithHighestGrade;
    }

    public Teacher teacherWithHighestGrades() {
        Teacher teacherWithHighestGrades = null;
        int highestGradesCount = -1;

        for (Teacher teacher : teachers) {
            int gradesCount = 0;
            for (Student student : students) {
                if (student.getSubjects().containsAll(Arrays.asList(teacher.getSubjects()))) {
                    gradesCount += teacher.getSubjects().size();
                }
            }

            if (gradesCount > highestGradesCount) {
                highestGradesCount = gradesCount;
                teacherWithHighestGrades = teacher;
            }
        }

        return teacherWithHighestGrades;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
