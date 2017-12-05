package center.kit.app.homework.lesson6;

import java.util.Random;

public class Array3 {
    public void numb() {
        int count = 0;
        int y = 15;
        int[] Arr = new int[y];
        Random random = new Random();
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = random.nextInt(10);
            System.out.print(Arr[i]);
        }
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print("count: " + count);
    }
}

