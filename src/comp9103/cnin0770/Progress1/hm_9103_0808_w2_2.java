/** Remainder is very useful in programming.
For instance, suppose today is Wednesday,
you have a submission due in 10 days,
what is the day of the due day? Write a program to calculate the day for you.
*/

/** NOTICE: inputs for the arguments should be in the format of "today due_priod"
*/

public class hm_9103_0808_w2_2 {
    public static void main (String[] args){
//      String dued;
      int toDay, dueDay, dueWeek, duePeriod;
      final int weekDays = 7;
      toDay = Integer.parseInt(args[0]);
      duePeriod = Integer. parseInt(args[1]);
      dueDay = (toDay + duePeriod) % weekDays;
      dueWeek = (toDay + duePeriod) / weekDays;
      // dued = dig2st(duedd);
      System.out.println(
      "The due day will be the "
      + dueDay + "th day of the next "
      + dueWeek + "th week"
      );
    }
    // public String dig2st (int dig){
    //   String result = "";
    //   switch(dig){
    //     case 1: result = "Monday";
    //     case 2: result = "Tuesday";
    //     case 3: result = "Wednesday";
    //     case 4: result = "Thursday";
    //     case 5: result = "Friday";
    //     case 6: result = "Saturday";
    //     case 0: result = "Sunday";
    //   }
    //   return result;
    // }

}
