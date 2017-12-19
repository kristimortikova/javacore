package center.kit.app.homework.lesson8;


import java.io.*;
import java.util.Arrays;

public class ReaderFile1 {
    public static String readTheFile(String path)
            throws IOException {
        String currentDir = System.getProperty("user.dir");
        String windowsStyle = "dir\\output2.txt";
        File file = new File(currentDir, windowsStyle);
        System.out.println(file.getCanonicalPath());
        BufferedReader reader = new BufferedReader(
                new FileReader("C:\\kit\\javacore\\output2.txt"));
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                double b = line.length();
                double d = Math.ceil(b / 2);
                int x = (int) d;
                char[] charArray = new char[x];
                for (int i = 0; i < line.length(); i++) {
                    if (i == 0) {
                        charArray[i] = line.charAt(i);
                    }
                    if (i != 0 && i % 2 == 0) {
                        charArray[i / 2] = line.charAt(i);
                    }
                }
                Arrays.sort(charArray);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
                        (new FileOutputStream("C:\\kit\\javacore\\input2.txt")));
                writer.append(Arrays.toString(charArray));
                writer.close();


                System.out.println(Arrays.toString(charArray));

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" ");
        }
        return currentDir;
    }
}







