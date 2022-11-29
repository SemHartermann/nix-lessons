package com.lessons.nix;

public interface Stackable {
    boolean isEmpty();
    boolean isFull();
    void put(Object o);
    Object get();
    Object showTopElement();
}
