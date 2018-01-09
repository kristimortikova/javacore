package center.kit.runners.classwork.lesson11;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList();
        String oneString = "I";
        myList.add(oneString);
        String twoString = "am";
        myList.add(twoString);
        int length = myList.size();
        System.out.println(length);
        boolean isIn = myList.contains(oneString);
        int index = myList.indexOf(oneString);
        boolean isEmpty = myList.isEmpty();
        myList.remove(twoString);
        boolean isin = myList.contains(twoString);
        Collections.sort(myList);
        Collections.reverse(myList);
    }
}
