package javaBasic;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double a, b;
        System.out.print("Введите 2 числа: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Введите арифметическую операцию( ‘+’, ‘-’, ‘*’ или ‘/’): ");
        switch (sc.next()){
            case("+"):
                System.out.println(a + b);
                break;
            case("-"):
                System.out.println(a - b);
                break;
            case("*"):
                System.out.println(a * b);
                break;
            case("/"):
                System.out.println(a / b);
                break;
            default:
                System.out.println("Неправильный символ");
        }
    }
}
