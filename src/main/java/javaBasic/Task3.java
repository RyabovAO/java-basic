package javaBasic;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1,7,13,5,6};
        System.out.println(Arrays.toString(arr));
        int foo = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = foo;
        System.out.println(Arrays.toString(arr));
        int sum = arr[0] + arr[arr.length/2];
        System.out.println(sum);
    }
}
