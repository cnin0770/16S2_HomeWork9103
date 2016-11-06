package comp9103.cnin0770;

import java.io.File;
import java.util.Scanner;

/**
 * Created by cnin0770 on 2/11/16.
 */
public class SampleQ2 {
    public static void main(String[] args) {
        File file = new File(args[0] + ".txt");
        try {
            Scanner scan = new Scanner(file);
            int counts = 0;

            while (scan.hasNext()) {
                if (scan.next().equalsIgnoreCase(args[1])) {
                    counts++;
                }
            }

            System.out.println(counts);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
