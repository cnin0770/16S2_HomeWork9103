import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by cnin0770 on 12/10/16.
 */
public class W8_1 {
    static boolean sortValue = true;

    public W8_1 () {}

    public static void aCreateFile (String fileName) {
        ArrayList<Double> doubleList = new ArrayList<>();
        System.out.println("enter your numbers, use any other letters to stop: ");
        Scanner input = new Scanner(System.in);
        File k = new File(fileName);

        while (input.hasNextDouble()) {
            doubleList.add(input.nextDouble());
        }

//        System.out.println(doubleList.toString()); //all good

        try {
            PrintWriter writer = new PrintWriter(k);
            for (double l : doubleList) {
                writer.println(l);
//                writer.println(l); // problem
//                System.out.println(l); //all good
            }
//            writer.println("hello kitty"); //not good

            System.out.println("writing complete. please find file: " + fileName);

            writer.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void bSearch (String fileName) {
        System.out.println("enter the number you'd like to search: ");
        Scanner input = new Scanner(System.in);
        double key = input.nextDouble();
        int res = 0;

        File k = new File(fileName);
        try {
            Scanner searchNumber = new Scanner(k);

            while (searchNumber.hasNextDouble()) {
                if (key == searchNumber.nextDouble()) {
                    res++;
                }
            }

            searchNumber.close();
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println(res + " results match your search of " + key);
    }

    public static void cSort (String fileName, boolean order) {
        File k = new File (fileName);
        try {
            Scanner read = new Scanner(k);

            ArrayList<Double> doubleList = new ArrayList<>();
            double temp;

            while (read.hasNextDouble()) {
                doubleList.add(read.nextDouble());
            }

            for (int i = 0; i < doubleList.size() - 1; i++) {
                if ((doubleList.get(i) > doubleList.get(i + 1) && order) ||
                                (doubleList.get(i) < doubleList.get(i + 1) && !order))
                {
                    temp = doubleList.get(i);
                    doubleList.set(i, doubleList.get(i + 1));
                    doubleList.set(i + 1, temp);
                }
            }

            PrintWriter writer = new PrintWriter(k);
            writer.write("");

            for (double key : doubleList) {
                writer.println(key);
            }

            writer.close();

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void dReadFile () {
        System.out.println("enter the file name you'd like to read without .txt: ");
        Scanner input = new Scanner(System.in);
        String fileName = input.next() + ".txt";

        File file = new File(fileName);
        try{
            Scanner read = new Scanner(file);

            while (read.hasNext()) {
                System.out.println(read.next());
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main (String[] args) {
        String fileName = args[0] + ".txt";
        aCreateFile(fileName);
        bSearch(fileName);
        cSort(fileName, sortValue);
        dReadFile();
    }
}
