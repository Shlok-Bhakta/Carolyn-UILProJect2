import java.util.Scanner;
import java.io.File;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("carolynJUD.dat"));
        int loop = s.nextInt();
        String[] Alphabet = { "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };
        String letters;
        for (int i = 1; loop >= i; ++i) {
            letters = s.next();
            // debug
            // System.out.println(letters);
            char[] letr = letters.toCharArray();
            int char1 = letr[0];
            int char2 = letr[1];

            //first bigger
            if (char1 > char2) {
                int difference = Math.abs(char1 - char2) + 2;
                int cursor = char1 - 65;
                int PrintTimes = 1;
                while (PrintTimes < difference) {

                    incrementPrint(PrintTimes, cursor, Alphabet);
                    System.out.println();
                    PrintTimes++;
                    cursor--;

                }
            }
            //first smaller
            if (char1 < char2) {
                int difference = Math.abs(char1 - char2) + 2;
                int cursor = char1 - 65;
                int PrintTimes = 1;
                while (PrintTimes < difference) {

                    incrementPrint(PrintTimes, cursor, Alphabet);
                    System.out.println();
                    PrintTimes++;
                    cursor++;

                }

            }
            //same num
            if (char1 == char2) {
                System.out.print(letr[0]);
                System.out.println();
            }
        }

    }

    public static void incrementPrint(int printNum, int cursorpos, String[] alph) {
        for (int f = 0; f < printNum; f++) {
            System.out.print(alph[cursorpos]);
        }

    }
}
