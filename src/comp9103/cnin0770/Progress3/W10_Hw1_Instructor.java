package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Hw1_Instructor extends W10_Hw1_Person{
    private double salary;

    public W10_Hw1_Instructor() {}

    public W10_Hw1_Instructor(String name, String dob, double salary) {
        super (name, dob);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\tinstructor paid by $" + salary;
    }
}
