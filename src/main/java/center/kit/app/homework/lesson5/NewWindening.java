package center.kit.app.homework.lesson5;

public class NewWindening {
    byte byte2 = 10;
    int int2 = 156;
    long long2 = 456;
    double double2 = 789.456;
    double result;

    public double Windening() {
        int2 = byte2;
        long2 = int2;
        double2 = long2;
        result = double2;
        System.out.println("Widening result: " + result);
        return result;
    }
}
