package center.kit.app.homework.lesson6;

import java.util.Random;

public class Array4 {
    public void Arr() {
        int min;
        int max;
        int y = 15;
        int[] Arr = new int[y];
        Random random = new Random();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = random.nextInt(1000);
            System.out.print(Arr[i] + " ");
        }
        min = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (min > Arr[i]) {
                min = Arr[i];
            }
        }
        max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        System.out.print("  min value: " + min + "  max value: " + max);

    }
}
