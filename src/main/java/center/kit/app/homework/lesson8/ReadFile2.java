package center.kit.app.homework.lesson8;

import java.io.*;
import java.util.Scanner;

public class ReadFile2 {
    public static void readTheFile(String path)
            throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("D:\\file.txt"));
        Scanner scanner = new Scanner(reader);
        String line;
        String pal = " - is palindrome. ";
        String notPal = " - not palindrome. ";
        boolean isPalindrome;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("D:\\file2.txt")));
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (checkPal(true, line)) {
                writer.append(line + pal);
                System.out.println(line + pal);
            } else {
                writer.append(line + notPal);
                System.out.println(line + notPal);
            }

            writer.newLine();
        }
        writer.close();
        reader.close();
    }

    public static boolean checkPal(Boolean isPalindrome, String line) {

        for (int i = 0; i < line.length() / 2; i++) {
            isPalindrome = isPalindrome && (line.charAt(i) ==
                    line.charAt(line.length() - i - 1));
        }
        return isPalindrome;

    }
}


