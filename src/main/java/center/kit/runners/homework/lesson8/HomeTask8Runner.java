package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.ReadFile2;
import center.kit.app.homework.lesson8.ReadFile3;
import center.kit.app.homework.lesson8.ReaderFile1;

import java.io.IOException;
import java.util.Scanner;

public class HomeTask8Runner {
    public static void main(String[] args) throws IOException {
        boolean check;
        while (check = true) {
            System.out.println("Enter number 1 for to runner the class ReadFile1.");
            System.out.println("Enter number 2 for to runner the class ReadFile2.");
            System.out.println("Enter number 3 for to runner the class ReadFile3.");
            System.out.println("Enter 0 for exit.");
            System.out.println("Enter number:");
            Scanner scanner = new Scanner(System.in);
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        ReaderFile1.readTheFile("C:\\kit\\javacore\\output2.txt");
                        break;
                    case 2:
                        ReadFile2.readTheFile("D:\\file.txt");
                        break;
                    case 3:
                        ReadFile3.readFile("C:\\kit\\javacore\\output.txt");
                    case 0:
                        System.out.println("Good Buy!");
                        break;
                    default:
                        System.out.println("There isn't such number in menu.");
                        break;
                }
                if (number == 0) {
                    break;
                } else {
                    System.out.println("Continue..");
                }
            } catch (Exception e) {
                System.out.println("Incorrect value..");
            }
        }
    }
}

