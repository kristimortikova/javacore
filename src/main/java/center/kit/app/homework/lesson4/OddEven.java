package center.kit.app.homework.lesson4;

import java.util.Scanner;

public class OddEven {
    public static void OddOrEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define odd or even number,");
        System.out.println("Enter number:");
        double a = scanner.nextDouble();
        if (OddorEvenVerif(a)) {
            System.out.println("Is number even.");
        } else {
            System.out.println("is number odd.");
        }

    }

    public static boolean OddorEvenVerif(double a) {
        return (a % 2) == 0;
    }
}
