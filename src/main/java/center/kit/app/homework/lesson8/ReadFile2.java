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
            isPalindrome = true;
            for (int i = 0; i < line.length() / 2; i++) {
                isPalindrome = isPalindrome && (line.charAt(i) ==
                        line.charAt(line.length() - i - 1));
            }
            if (isPalindrome) {
                writer.append(line + pal);
            } else {
                writer.append(line + notPal);
            }
            System.out.println(line);
            writer.newLine();
            line = scanner.nextLine();
            isPalindrome = true;
            for (int k = 0; k < line.length() / 2; k++) {
                isPalindrome = isPalindrome && (line.charAt(k) ==
                        line.charAt(line.length() - k - 1));
            }
            if (isPalindrome) {
                writer.append(line + pal);
            } else {
                writer.append(line + notPal);
            }
            System.out.println(line);
            writer.newLine();
            line = scanner.nextLine();
            isPalindrome = true;
            for (int x = 0; x < line.length() / 2; x++) {
                isPalindrome = isPalindrome && (line.charAt(x) ==
                        line.charAt(line.length() - x - 1));
            }
            if (isPalindrome) {
                writer.append(line + pal);
            } else {
                writer.append(line + notPal);
            }
            System.out.println(line);
        }
        writer.close();
        reader.close();
    }
}


