package javaBasic;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        System.out.print("Отгадайте загадку: \n");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ваш ответ: ");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else if (answer.equalsIgnoreCase("Подсказка") && i == 0) {
                System.out.println("Ответ: Заархивированный вирус");
                i = 1;
                continue;
            } else {
                if (i < 2) {
                    System.out.println("Подумай еще!");
                } else System.out.println("Обидно, приходи в другой раз");
            }
        }
    }
}
