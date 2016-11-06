//package comp9103.cnin0770;

/** Write a program to read a string from the command-line arguments,
 count the number of occurrence for each uppercase or lowercase letter contained in it.
 (Hint: define two arrays of size 26 to save the number of upper letter occurrence
 and lower letter occurrence in the string respectively)

 Note: String methods may be used:
 char charAt(int index): Returns the character at the specified index
 int length(): Returns the length of the string
 */
public class W4_5 {
    public static void main (String[] args) {
        char [] Up = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'G', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char [] Low = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int upCount = 0, lowCount = 0;
        String words = "";
        for (int i = 0; i < args.length; i++) {
            words += args[i];
        }
        for (int i = 0; i < words.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (words.charAt(i) == Up[j]) {
                    upCount++;
                }
                if (words.charAt(i) == Low[j]) {
                    lowCount++;
                }
            }
        }
        System.out.println("Uppercase in total number: " + upCount);
        System.out.println("Lowercase in total number: " + lowCount);
    }
}
