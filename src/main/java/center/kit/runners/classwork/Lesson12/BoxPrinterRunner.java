package center.kit.runners.classwork.Lesson12;

import center.kit.app.classwork.Lesson12.BoxPrinter;

public class BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(value1);
        value1.inspect(10);
        Integer intValue1 = value1.getValue();
        BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
        System.out.println(value2);
        //value2.inspect("hi");
        String intValue2 = value2.getValue();
    }
}
