package practice.day5.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class homework {
    public static void main(String[] args) {

        School school = new School();

        Student student1 = new Student("Zlatka", "Female", 1, 10, 1);
        student1.addGrade("Math",5);
        student1.addGrade("Science",4);
        student1.addGrade("English",6);
        school.addStudent(student1);
        school.printStudentsInfo();

        Student student2 = new Student("Blagoy", "Male", 2, 8, 2);
        student2.addGrade("Math",3);
        student2.addGrade("Science",4);
        student2.addGrade("English",4);
        school.addStudent(student2);

        Teacher teacher1 = new Teacher("Mr. Penev", "Male", 1001, "School X", new ArrayList<>(Arrays.asList("Math", "Science")), 5000);
        school.addTeacher(teacher1);
        Teacher teacher2 = new Teacher("Mrs. Georgieva", "Female", 1002, "School Y", new ArrayList<>(Arrays.asList("Math", "Science")), 4500);
        school.addTeacher(teacher2);

        school.printTeachersInfo();

        String subject = "English";
        Student studentWithHighestGrade = school.findStudentsHighestGrade(subject);
        System.out.println("Student with the highest grade in "+subject +": "+studentWithHighestGrade.getName());

        Student studentWithLowestGrade = school.findStudentsLowestGrade(subject);
        System.out.println("Student with the lowest grade in "+subject +": "+studentWithLowestGrade.getName());

        double averageSalary = school.averageSalary();
        System.out.println("Average salary: "+averageSalary);

        Student student = student1;
        double averageGradeOfStudent = school.averageGradeOfStudent(student);
        System.out.println("Average grade of "+student.getName()+": "+averageGradeOfStudent);

        double classAverageGrade = school.classAverageGrade();
        System.out.println("Class average grade: "+classAverageGrade);

        String subjectWithHighestGrade = school.subjectWithHighestGrade(student);
        System.out.println("Subject with the highest grade for "+student.getName()+": "+subjectWithHighestGrade);

        Teacher teacherWithHighestGrades = school.teacherWithHighestGrades();
        System.out.println("Teacher signing the highest grades: "+teacherWithHighestGrades.getName());
    }
}
