/** Exercise 1.
Write code that reads in a single number
from the command-line argument
and prints whether the number is even or odd.
*/

public class hm_9103_0810_w3_3 {
  public static void main (String[] args){
    int num = Integer.parseInt(args[0]);
    if (num % 2 == 0) {
      System.out.println("Number " + num + "is an EVEN number.");
    }
    else {System.out.println("Number " + num + "is an ODD number.");}

  }
}
