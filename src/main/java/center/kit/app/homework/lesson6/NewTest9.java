package center.kit.app.homework.lesson6;

public class NewTest9 {
    public int cycle(int a, int b) {
        while (a < b) {
            int result;
            a++;
            System.out.println("a = " + a + " , b = " + b);
            if (a == b) {
                result = a % b;
                System.out.println(result);
            }

        }
        return a + b;
    }
}
