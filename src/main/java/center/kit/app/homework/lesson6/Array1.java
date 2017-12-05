package center.kit.app.homework.lesson6;

public class Array1 {
    public void arr(int a, int b, boolean horizontal) {
        int x = ((b - a) / 2) + 1;

        int[] Arr = new int[x];//размер массива= кол-ву четных чисел в 20;
        for (int i = a, y = 0; i <= b; i++) {
            if (i % 2 == 0) {
                Arr[y] = i;//четные числа присвоены значениям элементов в массиве;
                if (horizontal) {
                    System.out.print(Arr[y] + " ");
                } else {
                    System.out.println(Arr[y] + " ");
                }
                y++;
            }
        }
    }
}

