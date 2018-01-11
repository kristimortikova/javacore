package center.kit.runners.homework.lesson7;

import center.kit.app.homework.lesson7.Lesson7Enum;
import center.kit.app.homework.lesson7.Palindrome1;
import center.kit.app.homework.lesson7.Palindrome2and3;
import center.kit.app.homework.lesson7.Strin;

import java.util.Scanner;

public class HomeTask7Runner {
    public static void main(String[] args) {
        System.out.println("Available items: ");
        for (Lesson7Enum menu : Lesson7Enum.values()) {
            System.out.println(menu.getFullName());
        }
        System.out.println("Enter any number: one, two, three or exit ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (Lesson7Enum.printType(input)) {
            Lesson7Enum task = Lesson7Enum.valueOf(input.toUpperCase());
            switch (task) {
                case ONE:
                    Strin.strArr();
                    break;
                case TWO:
                    Palindrome1.palind();
                    break;
                case THREE:
                    Palindrome2and3.palind();
                    break;
                case EXIT:
                    System.out.println("Good Buy!");
                    break;
            }
        } else {
            System.out.println("There isn't such number in menu.\nEnter any number: one, two, three, four or exit ");
        }
    }
}
