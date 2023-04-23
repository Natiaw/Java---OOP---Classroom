package school.management.system;

//Class is responsible for keeping track od students' fees, names, id, etc
public class Student {
    private int id; //the id is protected from external access hence private
    private String studentName;
    private double grade;
    private double feesPaid;
    private double feesTotal; //will be 30000 p/year the school

    //the constructor will create a new Student object by initializing values
    public Student (int id, String name, double grade) {
        this.id = id; //the id from the object will be the id of the argument
        this.studentName = name;
        this.grade = grade;
        feesPaid = 0; //no need to use this because it's not an argument
        feesTotal = 30000; //yearly fee
    }

    //if we don't alter the student's name we don't need a set

    //but we're going to alter student's grade, so we use them both

    /**
     * Used to update the student's grade. It's needed 'cause it's private.
     * @param grade new grade of the student
     */

    public void setGrade(double grade) {

        this.grade = grade;
    }

    /**
     * Fees can be paid all at once or in parcels
     * in case it's in parcels we're always adding the new paid fees
     * @param fees
     */
    public void payFees (double fees) {

        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * now we'll be getting all the students' info
     */

    public int getId(){
        return id;
    }

    public String getStudentName(){
        return studentName;
    }

    public double getGrade(){
        return grade;
    }

    public double getFeesPaid(){
        return feesPaid;
    }

    public double getFeesTotal(){
        return feesTotal;
    }

    /**
     * A function to tell how much the student still owes
     * @return total - paid
     */
    public double getRemainingFees(){
        return feesTotal-feesPaid;
    }

    public String toString(){
        return "Student's name : " + studentName + "\nTotal fees paid so far: $" + feesPaid;
    }



}
