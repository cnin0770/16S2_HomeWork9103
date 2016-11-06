package comp9103.cnin0770.Progress3;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W10_Hw1_Person {
    protected String name;
    protected String dob;

    public W10_Hw1_Person() {}

    public W10_Hw1_Person(String name, String dobStr) {
        this.name = name;
        this.dob = dobStr;
    }

    public static void main(String[] args) {
        W10_Hw1_Student tom = new W10_Hw1_Student("Tom", "19900122", "music");
        W10_Hw1_Instructor jerry = new W10_Hw1_Instructor("Jerry", "18731010", 18.2);

        System.out.println(tom.toString() + "\n" + jerry.toString());
    }

    public String toString() {
        return name + "\t" + dob;
    }
}
