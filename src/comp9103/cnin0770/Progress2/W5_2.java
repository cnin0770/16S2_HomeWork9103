//package comp9103.cnin0770;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/** Exercise 2. Formatting Output
 You are to write a piece of code that asks a person for surname, first name,
 and date of the birth (dd-mm-year), in order, and stores the user inputs into variables of the correct types.
 Then display the information in the following format by using format output:
 FIRSTNAME SURNAME was born on DAY MONTH YEAR.
 */
public class W5_2 {
    public static void main (String[] args) {

        System.out.println("Please give your surname, first name, and data of birth (dd-mm-year): ");

        Scanner Input = new Scanner(System.in);

        String surName = Input.next().toUpperCase();
        String fstName = Input.next().toUpperCase();
        String dobStr = Input.next();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat outPutDate = new SimpleDateFormat("dd MMM yyyy");

        try{
            Date dob = format.parse(dobStr);
            dobStr = outPutDate.format(dob);
            System.out.printf("%s %s was born on %s\n", fstName, surName, dobStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
