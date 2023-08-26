package javaBasic;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int row = sc.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        System.out.println("Введите элементы матрицы: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] * 3 + " ");
            }
        }
    }
}
