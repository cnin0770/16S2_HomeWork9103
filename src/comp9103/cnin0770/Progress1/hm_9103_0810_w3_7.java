/** Exercise 2. Triangle
Write a program that takes a single command-line argument,
which is a number between 1 and 9,
and prints a triangle such that the base of the triangle has all numbers
from 1 to that number with spaces between numbers.
An example of the system in operation is:
> java Triangle 4
1
1 2
1 2 3
1 2 3 4
*/

public class hm_9103_0810_w3_7 {
  public static void main (String[] args){
    int tri = Integer.parseInt(args[0]);

    if (tri <= 9) {
      for (int i = 1; i <= tri; i++) {
        for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
        }
      System.out.print("\n");
      }
    }
    else {System.out.println("Your input is too large to print.");}
  }
}
