//package comp9103.cnin0770;

/** Write a program to read a series of integer values from the command-line arguments,
 calculate the average of non-zero values in the array.
 For example, java NonzeroAverage 1 3 0 2 4 0 6
 will calculate the average of 5 non-zero array elements
 that are 1,3,2,4,6 and display their average value (i.e., 3.2) on the console.
 */
public class W4_4 {
    public static void main(String[] args) {
        int nonZeroCount = 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            int data = Integer.parseInt(args[i]);
            if (data != 0) {
                nonZeroCount++;
                sum += data;
            }
        }
        double ave = (double) sum / nonZeroCount;

        System.out.println("the average of non zero digits is: " + ave);

    }
}