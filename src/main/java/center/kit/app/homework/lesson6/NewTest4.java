package center.kit.app.homework.lesson6;

public class NewTest4 {
    public int event(int a, int b) {
        while (a < 99) {
            a = a + 1;
            if (a % 2 == 0) {
                b++;
                System.out.println(b);
            }

        }
        return b;
    }
}
