package com.lessons.nix;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.put(1);
        stack.put(2);
        stack.put(3);
        stack.put(4);
        stack.put(5);
        System.out.println(stack.isFull());
        System.out.println(stack.showTopElement());
        stack.put(6);
        stack.put(7);
        stack.put(8);
        stack.put(9);
        stack.put(10);
        System.out.println(stack.isFull());
        System.out.println(stack.showTopElement());
        stack.get();
        System.out.println(stack.isFull());
        System.out.println(stack.showTopElement());
    }
}
