package center.kit.app.classwork.lesson5;

import java.util.Scanner;

public class CircleArea {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Define circle Area");
        System.out.println("Enter radius1:");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area1 is " + circleArea);
        System.out.println("Enter radius2:");
        double radius2 = scanner.nextDouble();
        double circleArea2 = Math.PI * radius2 * radius2;
        System.out.println("Area2 is " + circleArea2);
        if ((radius > radius2) || (circleArea > circleArea2)) {
            System.out.println("Area1 is bigger " + circleArea);
            System.out.println("Area2 is smaller " + circleArea2);
        } else {
            System.out.println("Area2 is bigger " + circleArea2);
            System.out.println("Area1 is smaller " + circleArea);


        }
    }

}
