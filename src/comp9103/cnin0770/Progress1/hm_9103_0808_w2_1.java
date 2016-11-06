/** Write a program that asks the length and width of a rectangle
from the argument input, and then prints:
• The area and perimeter of the rectangle
• The length of the diagonal
*/

/** NOTICE: arguments input should be in the form of "length width"
*/

public class hm_9103_0808_w2_1 {
    public static void main (String[] args){
        float lengTh, widTh, aRea, periMeter, diaGonal;
	      lengTh = Integer.parseInt(args[0]);
	      widTh = Integer.parseInt(args[1]);
        aRea = lengTh * widTh;
        periMeter = 2 * (lengTh + widTh);
        diaGonal = (float) Math.sqrt(lengTh * lengTh + widTh * widTh);
        System.out.println(
          "the area is " + aRea +
          "\nthe perimeter is " + periMeter +
          "\nand the length of diagonal is " + diaGonal
          );
    }
}
