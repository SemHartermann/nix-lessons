package com.lessons.nix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println("-------");
        for (int i : arr) {
            if (i % 2 == 0 ){
                System.out.println(i);
            }
        }
        System.out.println("-------");
        System.out.println("Enter the number of day (1-7):");
        Scanner scanner = new Scanner(System.in);
        String result;
        result = scanner.nextLine();
        switch (result){
            case "1":
                result = "Monday";
                break;
            case "2":
                result = "Tuesday";
                break;
            case "3":
                result = "Wednesday";
                break;
            case "4":
                result = "Thursday";
                break;
            case "5":
                result = "Friday";
                break;
            case "6":
                result = "Saturday";
                break;
            case "7":
                result = "Sunday";
                break;
            default:
                result = "Nothingday";
        }
        System.out.println("-------");
        System.out.println(result);
        System.out.println("-------");
    }
}
