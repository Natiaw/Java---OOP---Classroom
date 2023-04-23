package school.management.system;
import java.util.List;

/**
 * a school can have many students and teachers
 * that's why we use a List
 */
public class School {

        private List<Teacher> teachers;
        private List<Student> students;
        private static double totalMoneyEarned;
        private static double totalMoneySpent;

    /**
     * Create a constructor where a new object is created
     * @param teachers list of teachers in the school
     * @param students liste of students in the school
     */


    public School(List<Teacher> teachers, List<Student> students) {
            this.teachers = teachers;
            this.students = students;
            totalMoneyEarned = 0;
            totalMoneySpent = 0;
        }

    /**
     * returns the list of teachers in the school
     */

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(double MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public double getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(double moneySpent) {
        totalMoneyEarned -= moneySpent;
    }







}
