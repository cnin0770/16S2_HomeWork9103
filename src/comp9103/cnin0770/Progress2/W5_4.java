//package comp9103.cnin0770;

import java.util.ArrayList;
import java.util.Scanner;

/** HOMEWORK Exercise 1: Simple Text Processing
 (2) Validate names: Write a program to read and validate names that are in form of given name(s) and surname,
 all along a line. The names are composed of letters and cannot include numbers and punctuation characters.
 If the input string is not a valid name, display the string and then comment that this is not a valid name;
 otherwise, add the valid name into the array of strings and then print the whole list of names in the array.
 */
public class W5_4 {
    public static void main (String[] args) {
        System.out.println("Please enter the names, each one on a separate line. " +
                "Type in \'end\' to finish: ");

        Scanner Input = new Scanner(System.in);

        ArrayList<String> nameList= new ArrayList<>();
        String nameInDoubt = "";

        while (true) {
            nameInDoubt = Input.nextLine();

            if (nameInDoubt.equals("end") || nameInDoubt == null) {
                break;
            }
            else if (!nameInDoubt.matches("^[a-zA-Z\\s]+$")) {
                System.out.println(nameInDoubt + " is invalid as being a name.");
            } else {
                nameList.add(nameInDoubt);
            }
        }

        System.out.println("Names are: ");
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
