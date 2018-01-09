package center.kit.app.homework.lesson7;

import java.util.Arrays;

public class Strin {
    public static void strArr() {
        int j;
        boolean swapFlag = true;
        int tempInt;
        String stringToDisplay = "";
        int[] intArray = {3, 8, 11, 7, 10, 2};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
            System.out.println();
        }
        while (swapFlag) {
            swapFlag = false;
            for (j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] < intArray[j + 1]) {
                    tempInt = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = tempInt;
                    swapFlag = true;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
            System.out.println();
        }
        char[] charArrayToString = {'a', 'b', 'c', 'd', '#', '3', '.', ' '};
        System.out.println("char array:" + Arrays.toString(charArrayToString));
        System.out.println("cHAR array:\n" + Arrays.toString(charArrayToString));
        for (int k = 0; k < charArrayToString.length; k++) {
            stringToDisplay += charArrayToString[k];
        }
        stringToDisplay = Arrays.toString(charArrayToString);
        stringToDisplay.replace(",", "");
        stringToDisplay.replace("[", "");
        stringToDisplay.replace(".", "");
        stringToDisplay.trim();
        System.out.println(stringToDisplay.replace("[", ""));
        char[] charArray = new char[255];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) i;
        }
        System.out.println("Char array: " + Arrays.toString(charArray));
        int[] someArray = {1, 5, 7, 2, 0};
        Arrays.sort(someArray);
        System.out.println("Sorted array: " + Arrays.toString(someArray));
        char[] array = {'4', '5', 't', 'v'};
        System.out.println("t,char:\t" + Arrays.toString(array));
        System.out.println("b,char:\b" + Arrays.toString(array));
        System.out.println("r,char:\r" + Arrays.toString(array));
        System.out.println("n,char:\n" + Arrays.toString(array));
        System.out.println("char:\'" + Arrays.toString(array));
        System.out.println("char:\"" + Arrays.toString(array));
        System.out.println("char:\\" + Arrays.toString(array));


    }
}
