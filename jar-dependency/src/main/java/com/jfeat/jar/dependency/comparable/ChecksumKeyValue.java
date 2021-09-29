package com.jfeat.jar.dependency.comparable;

import java.util.Map;

public class KeyValue<K,V> implements Comparable<K>, Map.Entry<K, V> {

    private Map.Entry<K,V> holder;

    public KeyValue(K k, V v){
        holder = Map.entry(k,v);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public K getKey() {
        return holder.getKey();
    }

    @Override
    public V getValue() {
        return holder.getValue();
    }

    @Override
    public V setValue(V value) {
        return holder.setValue(value);
    }

    @Override
    public boolean equals(Object o) {
        return holder.equals(o);
    }

    @Override
    public int hashCode() {
        return holder.hashCode();
    }
}
