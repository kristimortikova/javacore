package center.kit.app.classwork.lesson5;

public class MathFunc {
    public int multiply(int a, int b) {
        int result;
        result = a * b;
        System.out.println("MathFunc result: " + result);
        return result;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double slash() {
        int c = 8;
        int d = 3;
        double result = (double) c / d;
        System.out.print("Slash result: " + result);
        return result;

    }
}



