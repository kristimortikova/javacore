package center.kit.app.homework.lesson4;

import java.util.Scanner;

public class DefineBigger {
    public static int Define() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define bigger number.");
        System.out.println("Enter number one: ");
        int a = scanner.nextInt();
        System.out.println("Enter number two: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("number one is bigger.");
        } else if (a < b) {
            System.out.println("number two is bigger.");
        } else if (a == b) {
            System.out.println("number one equal number two.");
        }
        int result = a - b;
        return result;
    }
}






