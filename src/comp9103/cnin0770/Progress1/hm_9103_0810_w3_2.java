/** Write the following for loops:
a. prints on a separate line every number from 15 to 2 (both inclusive)
b. prints on a separate line every number from 15 to 2 (both exclusive)
c. prints on a separate line every even number between 2 to 20 (both inclusive)
*/

public class hm_9103_0810_w3_2 {
  public static void main (String[] args){
    for (int i = 15; i >= 2; i--) {System.out.println(i);}
    for (int i = 14; i > 2; --i) {System.out.println(i);}
    for (int i = 20; i >= 2; i--) {
      if (i % 2 == 0) {System.out.println(i);}
    }
  }
}
