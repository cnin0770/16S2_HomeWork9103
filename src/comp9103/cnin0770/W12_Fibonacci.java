package comp9103.cnin0770;

import java.util.Scanner;

/**
 * Created by cnin0770 on 19/10/16.
 */
public class W12_Fibonacci {
    public static void main(String[] args) {
        int x = 15;

        System.out.println("fib(" + x + ") = " + F(x));
    }

    public static long F(int x){
        long fib = 1;
        if (x <= 2) {
            fib = 1;
        } else {
            long f1 = 1;
            long f2 = 1;
            for (int i = 3; i <= x; i++) {
                fib = f1 + f2;
                f2 = f1;
                f1 = fib;
            }
        }
        return fib;
    }
}
