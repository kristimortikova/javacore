package center.kit.app.homework.lesson4.utils.convertors;

public class PrimitiveConvertor {
    public void floatToChar(float float1) {
        char char1 = (char) float1;
        System.out.println("Input float value: " + float1 + " Output char value: " + char1);
    }

    public void intToChar(int int1) {
        char char1 = (char) int1;
        System.out.println("Input int value: " + int1 + " Output char value: " + char1);
    }

    public void charToInt(char char1) {
        int int1 = (int) char1;
        System.out.println("Input char value: " + char1 + " Output int value: " + int1);
    }
}
