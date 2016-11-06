//package comp9103.cnin0770;

/** Write a program to create an array
 that is comprised of elements of double type.
 The size of the array will be defined by the user input via command-line argument
 and the array elements are to be read from command-line arguments.
 Your program will calculate and print statistics of the array including
 the sum, the average, the minimum and the maximum value,
 and count how many elements are smaller or larger than the average.
 */
public class W4_1 {
    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);
        double[] data = new double[size];
        double sum = 0;
        int max = 0, min = 0;

        for (int i = 0; i < size; i++) {
            data[i] = Double.parseDouble(args[i + 1]);
            sum += data[i];

            if (data[i] > data[max]) {
                max = i;
            }

            if (data[i] < data[min]) {
                min = i;
            }
        }

        double ave = sum / size;

        System.out.println("sum: " + sum + "\naverage: " + ave + "\nmax element: " + data[max] + "\nminium: " + data[min]);

    }
}
