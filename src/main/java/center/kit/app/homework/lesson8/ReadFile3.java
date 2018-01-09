package center.kit.app.homework.lesson8;

import java.io.*;
import java.util.Scanner;

public class ReadFile3 {
    public static void readFile(String path)
            throws IOException {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name file .txt");

        String nameFile = scanner.next();
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "dir\\" + nameFile;
        File file = new File(currentDir, windowsStyle);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                (new FileOutputStream("C:\\kit\\javacore\\" + nameFile)));
        System.out.println(file.getCanonicalPath());
        String line;
        System.out.println("enter new line: ");
        while (check) {
            line = scanner.next();
            switch (line) {
                case "exit":
                    writer.close();
                    check = false;
                    break;
                default:
                    writer.append(line);
                    writer.newLine();
                    System.out.println("your string input to the file.");
                    break;
            }
        }
        writer.close();
    }

}









