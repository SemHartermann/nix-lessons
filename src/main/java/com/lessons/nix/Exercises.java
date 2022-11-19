package com.lessons.nix;

import java.util.Arrays;

public class Exercises {
    static public int lengthOfLastWord(String str) {

        int len = 0;

        String x = str.trim();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ')
                len = 0;
            else
                len++;
        }

        return len;
    }

    static boolean phraseIsPalindrome(String str)
    {
        int l = 0;
        int h = str.length()-1;

        str = str.toLowerCase();

        while(l <= h)
        {

            char getAtl = str.charAt(l);
            char getAth = str.charAt(h);

            if (!(getAtl >= 'a' && getAtl <= 'z'))
                l++;

            else if(!(getAth >= 'a' && getAth <= 'z'))
                h--;

            else if( getAtl == getAth)
            {
                l++;
                h--;
            }

            else
                return false;
        }

        return true;
    }

    public static String longestCommonPrefix(String[] a)
    {
        int size = a.length;

        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        Arrays.sort(a);

        int end = Math.min(a[0].length(), a[size-1].length());

        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }

    public static void main(String[] args) {
        String s = "I love java so much     ";
        System.out.println("Length of last word is: "+lengthOfLastWord(s));

        System.out.println("-----------------------------------------------");

        System.out.println(s + "is palindrome: " + phraseIsPalindrome(s));
        String str = "moom a moom     ";
        System.out.println(str + " is palindrome: " + phraseIsPalindrome(str));

        System.out.println("-----------------------------------------------");

        String[] arrOfStr = {"nix", "niiiiix", "niyx?", "nixxx!"};
        System.out.println( "The longest common prefix is : " + longestCommonPrefix(arrOfStr));

    }
}
