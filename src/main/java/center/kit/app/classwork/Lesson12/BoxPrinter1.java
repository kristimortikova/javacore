package center.kit.app.classwork.Lesson12;

public class BoxPrinter1 {
    private Object val;

    public BoxPrinter1(Object arg) {
        val = arg;
    }

    public String toString() {
        return "{" + val + "}";
    }

    public Object getValue() {
        return val;
    }
}
