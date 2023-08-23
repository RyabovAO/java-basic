package javaBasic;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x, y, z;
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        double avg = (x + y + z)/2d;
        System.out.println(avg);
        avg = Math.floor(avg/2);
        System.out.println(avg);
        if(avg > 3) System.out.println("Программа выполнена корректно");
    }
}
