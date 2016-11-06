//package comp9103.cnin0770;

/** Given a two-dimensional square array of integers, with size N * N, write code to:
 a. Initialize the array by command-line inputs
 b. Calculate the statistics of
 the average, the minimum, and the maximum of the array
 c. Calculates the sum of every column, and then the sum of every row
 d. Calculate the sum on both diagonals.
 */
public class W4_2 {
    public static void main (String[] args){
        final int N = 3;
        int [][] data = new int [N][N];
        int [] sumCol = new int [N];
        int [] sumRow = new int [N];
        int [] max = new int [2];
        int [] min = new int [2];
        int sum = 0, sumD1 = 0, sumD2 = 0;
        double ave;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int tag = j + N * (i);
                data[i][j] = Integer.parseInt(args[tag]);
                sumRow[i] += data[i][j];
                sumCol[j] += data[i][j];
                sum += data[i][j];

                if (i == j) {
                    sumD1 += data[i][j];
                }

                if (i+j+1 == N) {
                    sumD2 += data[i][j];
                }

                if (data[i][j] > data[max[0]][max[1]]) {
                    max[0] = i;
                    max[1] = j;
                }
                if (data[i][j] < data[min[0]][min[1]]) {
                    min[0] = i;
                    min[1] = j;
                }

            }
        }

        ave = sum / (N*N);

        System.out.println("average: " + ave + "\nmax: " + data[max[0]][max[1]] +
                "\nmin: " + data[min[0]][min[1]] + "\nsums of diagonals: " + sumD1 + " " + sumD2);

        System.out.print("sum for each ROW: ");
        for (int i = 0; i < N; i++) {
            System.out.print( sumRow[i] + " ");
        }

        System.out.print("\nsum for each COLUMN: ");
        for (int i = 0; i < N; i++) {
            System.out.print( sumCol[i] + " ");
        }
        System.out.println();
    }

}
