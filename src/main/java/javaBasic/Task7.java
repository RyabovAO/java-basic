package javaBasic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int x = 7;
        final int y = 100;
        final int z = 17;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввести размер массива: ");
        int[] arr = new int[sc.nextInt()];
        System.out.print("\nВвести елементы массива: ");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int a : arr) {
            if(a == x || a == y || a == z) {
                System.out.println("Данное значение имеется в константах: " + a);
            }
        }
    }
}
