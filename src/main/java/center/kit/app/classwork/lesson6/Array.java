package center.kit.app.classwork.lesson6;

import java.util.Arrays;

public class Array {
    public void Arr() {
        double[] doubleA = {3, 6, 9};
        doubleA[0] = 3;
        doubleA[1] = 6;
        doubleA[2] = 9;
        for (double arrElement : doubleA) {
            System.out.println(arrElement);
        }

    }

    public void Arrays() {
        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) ;
        {
            System.out.println("intArray length: " + intArray.length);
        }
        for (int i = 1; i < 6; i++) {
            System.out.println("i=" + i);
        }
    }
}
