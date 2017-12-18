package center.kit.app.homework.lesson6;

import java.util.Random;

public class Array5 {
    public void Arr() {
        int a = 8;
        int b = 5;
        int[][] Arr = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b; k++) {
                Arr[i][k] = random.nextInt((90) + 10);
                System.out.print(Arr[i][k] + ".  ");
            }
        }

    }
}
