package com.lessons.nix;

import java.util.Scanner;

public class Main {

    static int i = 2;
    public static boolean isSimple(int a){
        if (a%i==0){
            i=2;
            return false;
        }
        else if(i>Math.ceil(Math.sqrt(a))){
            i=2;
            return true;
        }
        i++;
        return isSimple(a);
    }
    public static void main(String[] args) {

        System.out.println(isSimple(100));

    }
}
