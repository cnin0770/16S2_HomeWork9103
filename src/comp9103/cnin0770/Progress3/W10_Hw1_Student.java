package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Hw1_Student extends W10_Hw1_Person{
    private String major;

    public W10_Hw1_Student() {}

    public W10_Hw1_Student(String name, String dob, String major) {
        super(name, dob);
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + "\tstudent in " + major;
    }
}
