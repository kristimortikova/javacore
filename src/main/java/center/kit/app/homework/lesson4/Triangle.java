package center.kit.app.homework.lesson4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Triangle {
    public static double SideTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosine theorem.");
        System.out.println("enter side 1:");
        double a = scanner.nextDouble();
        System.out.println("enter side 2");
        double b = scanner.nextDouble();
        System.out.println("enter side 3");
        double c = scanner.nextDouble();
        double g = pow(a, 2) + pow(b, 2);
        if (pow(c, 2) == g) {
            System.out.println("This sides of right-angled triangle");
        } else {
            System.out.println("It's not a right-angled triangle");
        }
        return g;
    }
}


