package javaBasic;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*41) - 20;
        }
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println(Math.max(Math.abs(max), Math.abs(min)));
    }
}
