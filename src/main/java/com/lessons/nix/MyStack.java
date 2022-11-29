package com.lessons.nix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStack implements Stackable {

    Object[] stack = new Object[10];

    @Override
    public boolean isEmpty() {
        for (Object i : stack) {
            if (i != null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isFull() {
        for (Object i : stack) {
            if (i == null){
                return false;
            }
        }
        return true;
    }

    @Override
    public void put(Object o) {
        for (int i = 0; i < 10; i++) {
            if (stack[i] == null){
                stack[i] = o;
                break;
            }
        }
    }

    @Override
    public Object get() {
        Object res = null;
        if (!isEmpty()){
            if (stack[stack.length-1]!=null){
                res = stack[stack.length-1];
                stack[stack.length-1] = null;
                return res;
            }
            for (int i = 0; i < 10; i++) {
                if (stack[i]==null){
                    res = stack[i-1];
                    stack[i-1]=null;
                    return res;
                }
            }
        }
        return res;
    }

    @Override
    public Object showTopElement() {
        Object res = null;
        if (!isEmpty()){
            for (int i = 0; i < 10; i++) {
                if (stack[i]==null){
                    res = stack[i-1];
                    break;
                }
            }
        }
        return res;
    }
}
