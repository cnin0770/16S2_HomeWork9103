//package comp9103.cnin0770;

/** Pascal's triangle, an n-by-n 2D array has the binomial coefficient c ij
 for its element at row i and column j (j<=i).
 Each interior number in the triangle is the sum of the number directly above it
 and the number above and to the left.
 Read the size of the array by command-line input,
 and print the Pascal’s triangle on console display.
 01
 01 01
 01 02 01
 01 03 03 01
 01 04 06 04 01
 01 05 10 10 05 01
 01 06 15 20 15 06 01
 */
public class W4_6 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[][] pascal = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j != 0 & i == 0) {
                    pascal[i][j] = 0;
                } else if (j == 0) {
                    pascal[i][j] = 1;
                } else if (i != 0 & j != 0) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}