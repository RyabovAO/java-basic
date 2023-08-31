package javaBasic;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rub, usd, r;
        System.out.print("Введите текущий курс доллара: ");
        usd = sc.nextDouble();
        System.out.print("Введите количество рублей: ");
        rub = sc.nextDouble();
        System.out.printf("Итого: %.2f", rub/usd);
    }
}
