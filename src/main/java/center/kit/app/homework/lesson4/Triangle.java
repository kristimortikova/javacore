package center.kit.app.homework.lesson4;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Triangle {
    public static void SideTriangle() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cosine theorem. Side A, B, C; ");
        System.out.println("where side C is the hypotenuse.");
        System.out.println("enter side A:");
        double a = scanner.nextDouble();
        System.out.println("enter side B");
        double b = scanner.nextDouble();
        System.out.println("enter side C");
        double c = scanner.nextDouble();
        double g = pow(a, 2) + pow(b, 2);
        if (SideVerif(c, g)) {
            System.out.println("This sides of right-angled triangle");
        } else {
            System.out.println("It's not a right-angled triangle");
        }
    }

    public static boolean SideVerif(double c, double g) {
        return pow(c, 2) == g;
    }
}


