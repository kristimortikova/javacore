package center.kit.runners.homework.lesson4.utils.convertors;

import center.kit.app.homework.lesson4.utils.convertors.PrimitiveConvertor;

public class Lesson4Runner {
    public static void main(String[] args) {
        float float1 = 5.328f;
        int int1 = 7;
        char char1 = 39;
        PrimitiveConvertor primitive = new PrimitiveConvertor();
        primitive.floatToChar(float1);
        primitive.intToChar(int1);
        primitive.charToInt(char1);
    }
}
