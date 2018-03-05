package center.kit.runners.classwork.lesson13;

import center.kit.app.classwork.lesson13.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setT(new Integer(10));
        integerBox.inspect(21.0d);
    }
}
