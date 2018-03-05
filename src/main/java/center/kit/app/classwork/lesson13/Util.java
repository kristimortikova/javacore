package center.kit.app.classwork.lesson13;

public class Util {
    Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
    Pair<Integer, String> p2 = new OrderedPair<>(4, "pear");
    boolean same = Util.compare(p1, p2);

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
