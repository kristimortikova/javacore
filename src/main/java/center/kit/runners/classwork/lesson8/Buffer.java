package center.kit.runners.classwork.lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("D:\\file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you will see this text");
        }
    }
}
