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
            System.out.println(student);
        }
    }

    public void printTeachersInfo() {
        System.out.println("Teachers: ");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public Student findStudentsHighestGrade(String subject) {
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

    public Student findStudentsLowestGrade(String subject) {
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

    public double calculateAverageSalary() {
        double totalSalary = 0;
        for (Teacher teacher : teachers) {
            totalSalary += teacher.getSalary();
        }
        return totalSalary / teachers.size();
    }

    public double calculateAverageGradeOfStudent(Student student) {
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

    public double findClassAverageGrade() {
        double totalGrades = 0;
        int numStudents = students.size();

        for (Student student : students) {
            totalGrades += calculateAverageGradeOfStudent(student);
        }

        return numStudents != 0 ? totalGrades / numStudents : 0;
    }

    public String findSubjectWithHighestGrade(Student student) {
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

    public Teacher findTeacherWithHighestGrades() {
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
