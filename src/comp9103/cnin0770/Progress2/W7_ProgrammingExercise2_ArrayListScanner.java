//package comp9103.cnin0770;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Exercise 2 ArrayList and Scanner
 Create a class that includes methods to read words from the console
 and to search the text for a given value.
 Your class should have:
 a. An ArrayList to store the input
 b. A method that reads text input using the Scanner class
    and appends each word/token as a new entry to the ArrayList
 c. A method to search the Arrayist for a particular word (specified by a parameter)
    that prints the location of all of the occurrences of the word.
 d. A method that returns a new ArrayList with the words at the positions specified by an int[] (a parameter).
 e. A main() method to invoke the methods.
 */
public class W7_ProgrammingExercise2_ArrayListScanner {

    public static void main (String[] args) {

        ArrayList<String> text = new ArrayList<>();

        text = getText();
        String word = getSearchWord();

        ArrayList<Integer> result = new ArrayList<Integer>();

        result = searchWord(text, word);

        System.out.println("-the word is found in following positions: ");
        for (int c = 0; c < result.size(); c++) {
            System.out.print(result.get(c) + " ");
        }

        int[] keys = {1, 3, 5, 7, 9};

        ArrayList found = new ArrayList<String>();
        found = getWords(text, keys);

        System.out.println("\n-the following words appear at the positions read from the int array: ");
        for (int d = 0; d < found.size(); d++) {
            System.out.print(found.get(d) + " ");
        }
        System.out.print("\n");

    }

    public static ArrayList<String> getText() {
        System.out.println("input the text, stop by typing in \"EoI\": ");
        ArrayList textConsole = new ArrayList<String>();
        Scanner input = new Scanner (System.in);
        String line;

        while ((line = input.next()) != null && !line.equals("EoI")) {
            textConsole.add(line);
        }

        return textConsole;
    }

    public static String getSearchWord() {
        System.out.println("input the word to search: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public static ArrayList<Integer> searchWord(ArrayList<String> text, String word) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0;
        for (String k : text) {
            if (k.toLowerCase().equals(word.toLowerCase()) && k != null) {
                result.add(i);
                System.out.println("-match found at " + i);
            }
            i++;
        }

        return result;
    }

    public static ArrayList<String> getWords(ArrayList<String> text, int[] keys) {
        ArrayList found = new ArrayList<String>();

        for (int j : keys) {
            found.add(text.get(j));
        }

        return found;
    }
}
