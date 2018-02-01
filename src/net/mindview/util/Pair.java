package net.mindview.util;

/**
 * Created on 2018/2/1.
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K k, V v) {
        this.key = k;
        this.value = v;
    }
}
