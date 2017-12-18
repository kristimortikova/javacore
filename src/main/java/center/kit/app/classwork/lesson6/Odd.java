package center.kit.app.classwork.lesson6;

public class Odd {
    public void EvenOdd() {
        int x = 1;
        int count = 0;
        while (x <= 20) {
            if (x % 2 == 0) {
                count++;
                System.out.println(" event:  " + x + " , count: " + count);
            }

            if (x % 2 == 1) {
                System.out.println("odd: " + x);
            }
            x = x + 1;
        }
    }
}

