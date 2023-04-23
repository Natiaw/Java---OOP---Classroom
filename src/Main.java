import school.management.system.Teacher;
import school.management.system.School;
import school.management.system.Student;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Teacher DarthVader = new Teacher(1, "Darth Vader", 500);
            Teacher Yoda = new Teacher(2, "Master Yoda", 800);
            Teacher DinDjarin = new Teacher(3, "The Mandalorian", 750);

            List<Teacher> teacherList = new ArrayList<>();
            teacherList.add(DarthVader);
            teacherList.add(Yoda);
            teacherList.add(DinDjarin);

            Student Nathalie = new Student(1, "Nathalie Mendonca", 16.5);
            Student Paolo = new Student(2,"Paolo Cagol", 18);
            Student Grogu = new Student(3,"Grogu", 20);

            List<Student> studentList = new ArrayList<>();
            studentList.add(Nathalie);
            studentList.add(Paolo);
            studentList.add(Grogu);


            School npc = new School(teacherList, studentList);

            Teacher Ben = new Teacher(4, "Obi-Wan Kenobi", 1300.75);

            npc.addTeacher(Ben);

            Nathalie.payFees(1380);
            Grogu.payFees(6500);

        System.out.println("The School will be paying salaries now: ");
        Yoda.receiveSalary(Yoda.getSalary());
        System.out.println("NPC has paid " + Yoda.getTeacherName() + " and now has $ " + npc.getTotalMoneyEarned());
        System.out.println();

        Ben.receiveSalary(Ben.getSalary());
        System.out.println("NPC has paid " + Ben.getTeacherName() + " and how has $ " + npc.getTotalMoneyEarned());
        System.out.println();

        System.out.println(Ben);
        System.out.println();
        System.out.println(Nathalie);








    }
}