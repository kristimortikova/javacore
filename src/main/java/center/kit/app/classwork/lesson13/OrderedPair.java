package center.kit.app.classwork.lesson13;

public class OrderedPair<K, V> implements Pair {
    private K key;
    private V value;

    public OrderedPair(K key, V Value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
