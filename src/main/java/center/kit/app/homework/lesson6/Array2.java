package center.kit.app.homework.lesson6;

public class Array2 {
    public void arr(int a, int b) {
        int x = ((b - a) / 2) + 1;
        int[] Array = new int[x];
        for (int i = a, y = 0; i <= b; i++) {
            if (i % 2 == 1) {
                Array[y] = i;
                System.out.print(Array[y] + " ");
                y++;
            }
        }
        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(" " + Array[i] + " ");
        }

    }
}

