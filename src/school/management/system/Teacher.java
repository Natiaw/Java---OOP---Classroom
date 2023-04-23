package school.management.system;

/**
 * This is the teacher class, where it will contain their personal info
 */
public class Teacher {
    private int id;
    private String teacherName;
    private double salary;
    private double salaryEarned;

    public Teacher(int id, String name, double salary) {
        this.id = id;
        this.teacherName = name;
        this.salary = salary;
        this.salaryEarned = 0; //cause it starts with no salary
    }

    /**
     * a function to return the id of the teacher, using get 'cause it's private
     */
    public int getId(){
        return id;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public double getSalary(){
        return salary;
    }

    /**
     * now we need to set the salary into the new one 'cause they keep getting it
     * maybe last month they were getting 100 dollars, but now it's 200
     */

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * a funcion to tell that the teacher earned more salary
     * which also means that the school spent money
     */

    public void receiveSalary(double salary) {
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary); //updates the money the school spent
    }

    public String toString() {
        return "Name of the Teacher: " + teacherName + "\nTotal salary earned so far $" + salaryEarned;
    }
}


