package netckracker.course.popkov;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 15.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        double sum = 0;

        Student student1 = new Student(7);
        Student student2 = new Student(10);
        Student student3 = new Student(8);
        Student student4 = new Student(5);
        Student student5 = new Student(5);
        ArrayList<Student> studentsList= new ArrayList<Student>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);
        studentsList.add(student5);

        Student student6 = new Student(7);
        Student student7 = new Student(7);
        Student student8 = new Student(8);
        Student student9 = new Student(5);
        Student student10 = new Student(20);
        ArrayList<Student> studentsList2= new ArrayList<Student>();
        studentsList2.add(student6);
        studentsList2.add(student7);
        studentsList2.add(student8);
        studentsList2.add(student9);
        studentsList2.add(student10);

        Group group1 = new Group();
        group1.setGroup(studentsList);
        Group group2 = new Group();
        group2.setGroup(studentsList2);

        System.out.println(group1.getAverageAge());
        System.out.println(group2.getAverageAge());
    }
}
