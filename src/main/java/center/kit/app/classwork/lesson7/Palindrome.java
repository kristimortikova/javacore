package center.kit.app.classwork.lesson7;

public class Palindrome {
    public void Palind() {
        String palindrome = "1234564321";
        boolean isPalindrome = true;
        for (int i = 0; i < palindrome.length() / 2; i++) {
            isPalindrome = isPalindrome && (palindrome.charAt(i) ==
                    palindrome.charAt(palindrome.length() - i - 1));
        }
        if (isPalindrome) {
            System.out.println("palind");
        } else {
            System.out.print("not");
        }
    }
}