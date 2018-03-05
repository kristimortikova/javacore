package center.kit.app.classwork.Lesson12;

public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg) {
        val = arg;
    }

    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + val.getClass().getName());
        System.out.println("U: " + getClass().getName());
    }

    public String toString() {
        return "{" + val + "}";
    }

    public T getValue() {
        return val;
    }
}
