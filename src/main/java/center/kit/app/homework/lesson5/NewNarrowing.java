package center.kit.app.homework.lesson5;

public class NewNarrowing {
    double double1 = 4.123456;
    int int1 = 9;

    public int narrowing() {
        int int1 = (int) double1;
        System.out.println(int1);
        return int1;
    }
}
