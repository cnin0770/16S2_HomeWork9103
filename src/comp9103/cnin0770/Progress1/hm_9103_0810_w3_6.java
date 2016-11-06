/** Exercise 1. Converting student’s grade to mark range by switch
Input the student’s grade: H, D, C, P, or F (case insensitive),
output the corresponding mark range for the grade.
(Use charAt(int index) method in String class, which returns the character at the specified index.)
*/

public class hm_9103_0810_w3_6 {
  public static void main (String[] args){
    int min = 0, max = 100;
    Boolean key = true;
    String str = args[0].toLowerCase();

    switch (str.charAt(0)) {
      case ('h'): min = 85; break;
      // case ('H'): min = 85; max = 100; break;
      // case ('D'): min = 75; max = 85; break;
      case ('d'): min = 75; max = 85; break;
      // case ('C'): min = 65; max = 75; break;
      case ('c'): min = 65; max = 75; break;
      case ('p'): min = 50; max = 65; break;
      // case ('P'): min = 50; max = 65; break;
      // case ('F'): min = 0; max = 50; break;
      case ('f'): max = 50; break;
      default: key = false;
    }

    if (key) {
      System.out.println ("The grade ranges from " + min + " to " + max + ".");
    }
    else System.out.println ("Your input is not workable.");

  }
}
