package center.kit.app.homework.lesson7;

import java.util.Scanner;

public class Palindrome2and3 {
    public static void palind() {
        String str;
        int leftBorder;
        int rightBorder;
        boolean isPalindrome = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter palindrome");
        str = scanner.next();
        str = str.toLowerCase();
        if (str.length() % 2 == 1) {//алгоритм для нечетного числа символов в строке
            int middle = str.length() / 2;
            leftBorder = middle - 1;
            rightBorder = middle + 1;
            for (int i = 0; i < str.length() / 2; i++) {
                if (isPalindrome = isPalindrome && str.charAt(leftBorder) == str.charAt(rightBorder)) {
                    leftBorder--;
                    rightBorder++;
                }
            }
            if (isPalindrome) {
                System.out.println("is palindrome");
            } else {
                System.out.println("not palindrome");
            }
        } else {//алгоритм для четного числа символов в строке.
            int right = str.length() / 2;
            int left = right - 1;
            for (int i = 0; i < str.length() / 2; i++) {
                if (isPalindrome = isPalindrome && str.charAt(right) == str.charAt(left)) {
                    right = right + 1;
                    left = left - 1;
                }
            }
            if (isPalindrome) {
                System.out.println("is palindrome");
            } else {
                System.out.println("not palindrome");
            }
        }
    }
}
