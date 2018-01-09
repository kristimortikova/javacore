package center.kit.app.classwork.lesson8;

import java.io.*;

public class Dinamyc {
    public static void readTheFile(String path)
            throws IOException {
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "dir\\output.txt";
        File file = new File(currentDir, windowsStyle);
        System.out.println(file.getCanonicalPath());
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("C:\\kit\\javacore\\output.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();
        String palindrome = firstLine;//создать свой метод для проверки палиндромности, только потом записать
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) ==
                    palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println("palind");
        } else {
            System.out.print("not");
        }
    }
}
