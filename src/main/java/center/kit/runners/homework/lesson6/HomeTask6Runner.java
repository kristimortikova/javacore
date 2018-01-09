package center.kit.runners.homework.lesson6;

import center.kit.app.homework.lesson6.*;

import java.util.Scanner;

public class HomeTask6Runner {
    public static void main() {
        boolean check;

        System.out.println("Enter number 1 for to runner the class Array1.");
        System.out.println("Enter number 2 for to runner the class Array2.");
        System.out.println("Enter number 3 for to runner the class Array3.");
        System.out.println("Enter number 4 for to runner the class Array4.");
        System.out.println("Enter number 5 for to runner the class Array5.");
        while (check = true) {
            System.out.println("Enter number:");
            System.out.println("Enter 0 for exit.");
            Scanner scanner = new Scanner(System.in);
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        Array1 array1 = new Array1();
                        array1.arr(2, 20, true);
                        array1.arr(2, 20, false);
                        break;
                    case 2:
                        Array2 array2 = new Array2();
                        array2.arr(1, 99);
                        break;
                    case 3:
                        Array3 array3 = new Array3();
                        array3.numb();
                        break;
                    case 4:
                        Array4 array4 = new Array4();
                        array4.Arr();
                        break;
                    case 5:
                        Array5 array5 = new Array5();
                        array5.Arr();
                        break;
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


