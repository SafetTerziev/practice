package practice.day5.homework;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    public School(ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
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
    public Student studentsWithHighestGrades(String subject) {
        Student studentWithHighestGrade = null;
        double highestGrade = 0;

        for (Student student : students) {
          ArrayList<GradesForSubjects> studentGrades =  student.getGradesForSubjects();
          for (int i = 0; i < studentGrades.size(); i++) {
              if (highestGrade < studentGrades.get(i).getGrades()) {
                  highestGrade = studentGrades.get(i).getGrades();
                  studentWithHighestGrade = student;
              }
          }
        }
        return studentWithHighestGrade;
    }


}
