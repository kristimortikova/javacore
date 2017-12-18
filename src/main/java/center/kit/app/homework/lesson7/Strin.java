package center.kit.app.homework.lesson7;

public class Strin {
    public static void main(String[] args) {
        int j;
        boolean swapFlag = true;
        int tempInt;
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

    }
}
