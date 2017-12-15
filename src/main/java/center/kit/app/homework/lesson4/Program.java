package center.kit.app.homework.lesson4;

import center.kit.app.classwork.lesson5.CircleArea;

import java.util.Scanner;

public class Program {
    public static void ProgramMenu() {
        boolean check;
        while (check = true) {
            System.out.println("Enter number 1 for right-angled triangle program.");
            System.out.println("Enter number 2 for calculate circle area program.");
            System.out.println("Enter number 3 to determine which number is bigger or smaller.");
            System.out.println("Enter number 4 to define an even or odd number.");
            System.out.println("Enter 0 for exit.");
            System.out.println("Enter number:");
            Scanner scanner = new Scanner(System.in);
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        Triangle.SideTriangle();
                        break;
                    case 2:
                        CircleArea.calculate();
                        break;
                    case 3:
                        DefineBigger.Define();
                        break;
                    case 4:
                        OddEven.OddOrEven();
                        break;
                    case 0:
                        System.out.println("Good Buy!");
                        break;
                    default:
                        System.out.println("There isn't such number in menu.");
                        break;
                }

                System.out.println(" ");
                if (number == 0) {
                    break;
                } else {
                    System.out.println("Continue..");
                }
            } catch (Exception e) {
                System.out.println("incorrect value");
            }

        }
    }
}