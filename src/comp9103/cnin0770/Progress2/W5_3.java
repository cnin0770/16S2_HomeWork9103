//package comp9103.cnin0770;

import java.util.ArrayList;
import java.util.Scanner;

/** HOMEWORK Exercise 1: Simple Text Processing
 (1) Count the words: Write a program to read a paragraph;
 count the number of a given word in the paragraph; display the word and its count.
 */
public class W5_3 {
    public static void main (String[] args) {
        Scanner Input = new Scanner(System.in);
        int cnt = 0;
        ArrayList<String> pyr = new ArrayList<String>();
        String fdWord = "";
        String line = "";

        System.out.println("the word you'd like to count: ");
        fdWord = Input.next();

        System.out.println("Input the paragraph, enter \"EoI\" to stop typing:");

        while ((line = Input.next()) != null && !line.equals("EoI")) {
            pyr.add(line);
        }

        for (int i = 0; i < pyr.size(); i++) {
            if (pyr.get(i).equals(fdWord)) { cnt++; }
        }

        System.out.printf("\'%s\' appears %d times.\n", fdWord, cnt);

    }
}
