package javaBasic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        if(!sc.hasNextInt()){
            System.out.println("Введено неверное значение");
            System.exit(1);
        } else {
            a = sc.nextInt();
            if(a <= 0) {
                System.out.println("Введено неверное значение");
                System.exit(1);
            }
        }
        for (int i = 1; i <= a; i++) {
            if(i % 2 != 0) sum += i;
        }
        System.out.println(sum);
    }
}
