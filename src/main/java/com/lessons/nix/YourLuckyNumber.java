package com.lessons.nix;

import java.util.Random;

public class YourLuckyNumber {
    public static void main(String[] args) {
        int rn = new Random().nextInt(10) + 1;
        System.out.println("Your lucky number " + rn);
    }
}
