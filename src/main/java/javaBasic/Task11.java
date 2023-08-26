package javaBasic;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        String str = sc.nextLine();
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        if(num > Integer.parseInt(str)){
            System.out.println("Большее число: " + num);
            System.out.println(Double.parseDouble(str));
        } else if((num < Integer.parseInt(str))) {
            System.out.println("Большее число: " + str);
            System.out.println((double) num);
        } else System.out.println("Числа равны");
    }
}
