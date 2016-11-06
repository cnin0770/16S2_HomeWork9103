//package comp9103.cnin0770;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;///////////////////

/** HOMEWORK Exercise 2: Pattern/Format matching!
 (2) Salary: read a list of salary amounts that start with a dollar sign “$”
 and followed by a non- negative number, save the valid salary inputs into an array
 and sort the salary in ascending order, calculate the average of the salary inputs,
 and count the number of inputs less than /greater than the average.
 */
public class W5_6 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> salarys = new ArrayList<Float>();
        Float sum = .0f;
        int lowAve = 0;

        if (input.hasNext()) {
            Float sya = Float.parseFloat(input.next().replace("$",""));

            if (sya >= 0) {
                salarys.add(sya);
                sum += sya;
            }
        } else { input.close(); }

        Collections.sort(salarys);

        double ave = sum / salarys.size();

        for (int i = 0; i < salarys.size(); i++) {
            if (salarys.get(i) < ave) {
                lowAve++;
            }
        }
    }
}
