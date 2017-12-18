package center.kit.runners.classwork.lesson8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
    public static void main(String[] args) {

        try {
            BufferedReader reader1 = new BufferedReader(
                    new FileReader("D:\\file.txt"));
            try (reader1) {
                System.out.println(reader1.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
