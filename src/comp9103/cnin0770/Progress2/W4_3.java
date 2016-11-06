//package comp9103.cnin0770;

/** Write a program to read a series of words from the command-line arguments,
 and find the index of the first match of a given word.
 For example,
 $java FirstMatch lady That young lady looks after the old lady.
 would find the index for the first match of “lady” in the sentence
 “That young lady looks after the old lady”,
 and display the index of its first occurrence in the sentence on console,
 e.g., “The index of the first match of ‘lady’ is 2”.
 */
public class W4_3 {
    public static void main(String[] args) {
        int find = 0;
        for (int i = 1; i < args.length; i++) {
            if (args[0].equals(args[i])) {
                find = i;
                break;
            }
        }
        if (find == 0) {
            System.out.println("not found");
        } else {
            System.out.println("The index of the first match of \'" + args[0] + "\' is " + (find - 1));
        }

    }
}