/** Exercise 3: Pyramid
Write a program that takes in an odd positive integer n from the command line
and draw a pyramid on the screen, with the highest level having 1 block,
the 2nd 3 blocks, …, and the last n blocks.
An example in operation:
> java Pyramid 7
   *
  ***
 *****
*******
*/

public class hm_9103_0810_w3_8 {
  public static void main (String[] args){
    int py = Integer.parseInt(args[0]), d, c;
    if ((py > 0) & (py % 2 == 1) & (py <= 31)) {
      for (int i = 1; i <= ((py - 1) / 2); i++) {
        // d = blank(i, py);
        // c = asTerisk(i);
        for (int j = 1; j <= (((py - i * 2) + 1) / 2); j++) {System.out.print(" ");} // print blank
        for (int k = 1; k <= (i * 2 - 1); k++) {System.out.print("*");} // print asterisks
        System.out.print("\n"); // neXt lIne
      }
    }
    else {System.out.println("Your input is not workable.");}

  }

  // public int blank (int blk, int mt) {
  //   for (int blki = 1; blki <= (((mt - blk * 2) + 1) / 2); blki++) {
  //     System.out.print(" ");
  //     return ((((mt - blk * 2) + 1) / 2));
  //   }
  // }
  //
  // public int asTerisk (int asT) {
  //   for (int asTi = 1; asTi <= (asT * 2 - 1); asTi++) {
  //     System.out.print("*");
  //     return (asT * 2 - 1);
  //   }
  // }
}
