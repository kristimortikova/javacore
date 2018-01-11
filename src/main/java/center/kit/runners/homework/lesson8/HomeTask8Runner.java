package center.kit.runners.homework.lesson8;

import center.kit.app.homework.lesson8.Lesson8Enum;
import center.kit.app.homework.lesson8.ReadFile2;
import center.kit.app.homework.lesson8.ReadFile3;
import center.kit.app.homework.lesson8.ReaderFile1;

import java.util.Scanner;

import static center.kit.app.homework.lesson8.Lesson8Enum.EXIT;

public class HomeTask8Runner {
    public static void main(String[] args) {
        boolean check;
        while (check = true) {
            System.out.println("Available items: ");
            for (Lesson8Enum menu : Lesson8Enum.values()) {
                System.out.println(menu.getFullName());
            }
            System.out.println("Enter any number: one, two, three or exit ");
            Scanner scanner = new Scanner(System.in);
            try {
                String input = scanner.next();
                if (Lesson8Enum.printType(input)) {
                    Lesson8Enum task = Lesson8Enum.valueOf(input.toUpperCase());
                    switch (task) {
                        case ONE:
                            ReaderFile1.readTheFile("C:\\kit\\javacore\\output2.txt");
                            break;
                        case TWO:
                            ReadFile2.readTheFile("D:\\file.txt");
                            break;
                        case THREE:
                            ReadFile3.readFile("C:\\kit\\javacore\\output.txt");
                        case EXIT:
                            System.out.println("Good Buy!");
                            break;
                    }
                    if (task == EXIT) {
                        break;
                    }
                } else {
                    System.out.println("There isn't such number in menu.\nEnter any number: one, two, three or exit ");
                }

            } catch (Exception e) {
                System.out.println("Incorrect value..");
            }
        }
    }
}

