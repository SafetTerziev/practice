package practice.day5.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class homework {
    public static void main(String[] args) {

        School school = new School();

        Student student1 = new Student("Zlatka", "Female", 140, 10, 24);
        student1.addGrade("Math",5);
        student1.addGrade("Science",4);
        student1.addGrade("English",6);
        school.addStudent(student1);
        school.printStudentsInfo();

        Student student2 = new Student("Blagoy", "Male", 213, 8, 2);
        student2.addGrade("Math",3);
        student2.addGrade("Science",4);
        student2.addGrade("English",4);
        school.addStudent(student2);
        school.printStudentsInfo();

        Teacher teacher1 = new Teacher("Mr. Penev", "Male", 1, "School X", new ArrayList<>(Arrays.asList("Math", "Science")), 3000);
        school.addTeacher(teacher1);
        Teacher teacher2 = new Teacher("Mrs. Georgieva", "Female", 2, "School Y", new ArrayList<>(Arrays.asList("IT", "Programming")), 2000);
        school.addTeacher(teacher2);

        school.printTeachersInfo();

        String subject = "English";
        Student studentWithHighestGrade = school.findStudentsHighestGrade(subject);
        System.out.println("Student with the highest grade in "+subject +": "+studentWithHighestGrade.getName());

        Student studentWithLowestGrade = school.findStudentsLowestGrade(subject);
        System.out.println("Student with the lowest grade in "+subject +": "+studentWithLowestGrade.getName());

        double averageSalary = school.calculateAverageSalary();
        System.out.println("Average salary: "+averageSalary);

        Student student = student1;
        double averageGradeOfStudent = school.calculateAverageGradeOfStudent(student);
        System.out.println("Average grade of "+student.getName()+": "+averageGradeOfStudent);

        double classAverageGrade = school.findClassAverageGrade();
        System.out.println("Class average grade: "+classAverageGrade);

        String subjectWithHighestGrade = school.findSubjectWithHighestGrade(student);
        System.out.println("Subject with the highest grade for "+student.getName()+": "+subjectWithHighestGrade);

        Teacher teacherWithHighestGrades = school.findTeacherWithHighestGrades();
        System.out.println("Teacher signing the highest grades: "+teacherWithHighestGrades.getName());
    }
}
