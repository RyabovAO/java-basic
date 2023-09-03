package javaBasic;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int x = 0;
        System.out.print("Введите уравнение: ");
        String equation = sc.nextLine();
        char[] arr = equation.toCharArray();
        if (arr[0] == 'x') {
            a = arr[2];
            b = arr[4];
        } else if (arr[2] == 'x') {
            a = arr[0];
            b = arr[4];
        } else {
            a = arr[0];
            b = arr[2];
        }
        switch (arr[1]) {
            case ('-'):
                x = -b + a;
                break;
            case ('+'):
                x = b - a;
                break;
            default:
                System.out.println("Неверное значение");
        }
        System.out.println(x);
    }
}
