package ru.petrov;

public class Pair<K, V> {

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private K key;
    private V value;

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("(%s : %s)", key.toString(), value.toString());
    }
}
