package center.kit.app.homework.lesson7;

import java.util.Scanner;

public class Palindrome1 {
    public static void palind() {
        String str;
        int leftBorder;
        int rightBorder;
        boolean isPalindrome = true;
        System.out.println("enter palindrome");
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        str = str.toLowerCase();
        leftBorder = 0;
        rightBorder = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            if (isPalindrome = isPalindrome && str.charAt(leftBorder) == str.charAt(rightBorder)) {
                leftBorder += 1;
                rightBorder = rightBorder - leftBorder;
            }
        }
        if (isPalindrome) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}

