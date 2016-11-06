/** Write a program with switch fragment
to represent this
(the drinks can be served by just printing their names).
a. If button 1 is pressed, cola is served.
b. If button 2 is pressed, lemonade is served.
c. If button 3 is pressed, orange is served.
d. Button 6 serves both cola and lemonade
while all other buttons serve no drinks.
*/

public class hm_9103_0810_w3_1 {
  public static void main (String[] args) {
    int choice = Integer.parseInt(args[0]);
    String sold = "";

    switch (choice) {
      case 1: sold = "cola"; break;
      case 2: sold = "lemonade"; break;
      case 3: sold = "orange"; break;
      case 6: sold = "cola and lemonade"; break;
    }
    if (sold.equals("")) {System.out.println ("you have not chosen any drink");}
    else {System.out.println ("here is your " + sold);}
  }
}
