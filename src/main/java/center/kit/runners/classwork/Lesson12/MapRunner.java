package center.kit.runners.classwork.Lesson12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MapRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of words");
        String type = scanner.next();
        System.out.println(type);
        String words = scanner.nextLine();
        System.out.println(words);
        String[] allWords = words.split(",");
        HashSet<String> wordsDistinct = new HashSet<>();
        wordsDistinct.addAll(Arrays.asList(allWords));
        HashMap<String, HashSet<String>> typeAndWords = new HashMap<>();
        typeAndWords.put(type, wordsDistinct);
        System.out.println(("User please specify a type of words to display"));
        String choose = scanner.next();
        HashSet<String> result = typeAndWords.get(choose);
        System.out.println(result);

    }
}
