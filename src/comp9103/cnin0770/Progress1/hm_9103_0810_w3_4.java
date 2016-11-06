/** Exercise 2. Factorial (n!=1*2*3*…*n)
Write a program that takes a single command-line argument,
and calculates the factorial of that number.
*/

public class hm_9103_0810_w3_4 {
  public static void main (String[] args){
    int n = Integer.parseInt(args[0]), res = 1;
    for (int i = 1; i <= n; i++) {
      res = res * i;
    }
    System.out.println(n + "'s factorial is " + res);
  }
}
