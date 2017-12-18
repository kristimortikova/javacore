package center.kit.runners.homework.lesson7;

import center.kit.app.homework.lesson7.Palindrome1;
import center.kit.app.homework.lesson7.Palindrome2and3;
import center.kit.app.homework.lesson7.Strin;

import java.util.Scanner;

public class HomeTaskRunner {
    public static void main(String[] args) {
        boolean check;
        while (check = true) {
            System.out.println("Enter number 1 for to runner the class Strin.");
            System.out.println("Enter number 2 for to runner the class Palindrome1.");
            System.out.println("Enter number 3 for to runner the class Palindrome2and3.");
            System.out.println("Enter 0 for exit.");
            System.out.println("Enter number:");
            Scanner scanner = new Scanner(System.in);
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        Strin.strArr();
                        break;
                    case 2:
                        Palindrome1.palind();
                        break;
                    case 3:
                        Palindrome2and3.palind();
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
                System.out.println("Incorrect value..");
            }
        }
    }
}
