package javaBasic;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double avg = 0.0;
        System.out.print("Введите размер массива: ");
        double[] arr = new double[sc.nextInt()];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg/ arr.length;
        for (double num : arr) {
            System.out.println(num * avg);
        }
    }
}
