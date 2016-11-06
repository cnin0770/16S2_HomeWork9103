//package comp9103.cnin0770;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/** HOMEWORK Exercise 2: Pattern/Format matching!
 (1) Date format: Write a program to check whether an input date matches the format of
 “(d)d- (m)m-(yy)yy”. If an input date matches the format, display “true” on the console;
 otherwise display “false”. For example:
 an input date 11-07-2014 or 2-2-14 matches the format,
 and “true” will be displayed on the console as the output.
 */
public class W5_5 {
    public static void main (String[] args) {
        Scanner Input = new Scanner(System.in);
        String dateStr = Input.next();

        String fmt1 = "dd-MM-yy";
        String fmt2 = "dd-MM-yyyy";

        System.out.println( isDateValid(fmt1, dateStr) || isDateValid(fmt2, dateStr));
    }

    public static Boolean isDateValid (String format, String dateStr) {
        Date date = null;
        try {
            SimpleDateFormat fmt = new SimpleDateFormat(format);
            date = fmt.parse(dateStr);
            if (!dateStr.equals(fmt.format(date))) {
                date = null;
            }
        } catch (ParseException e) {}
        return (date != null);
    }
}
