package center.kit.app.classwork.lesson6;

import java.util.Scanner;

public class UserNumber {
    public static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a > b) {
            a = a - 1;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
        if (a <= b) {
            System.out.println(" a = " + a + ", b = " + b + " , good buy!");

        }

    }
}
