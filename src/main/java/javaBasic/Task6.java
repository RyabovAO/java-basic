package javaBasic;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int magnitude, unit ;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner scanner = new Scanner(System.in);
        magnitude = scanner.nextInt();
        if(magnitude == 1) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - центнер, 4 - тонна");
            unit = scanner.nextInt();
            float gr, kg, ct, ton;
            System.out.print("Введите число: ");
            switch (unit){
                case 1: gr = scanner.nextFloat();
                    System.out.println("грамм: " + gr);
                    System.out.println("килограмм: " + gr/1000);
                    System.out.println("центнер: " + gr/100000);
                    System.out.println("тонна: " + gr/1000000);
                    break;
                case 2: kg = scanner.nextFloat();
                    System.out.println("килограмм: " + kg);
                    System.out.println("грамм: " + kg*1000);
                    System.out.println("центнер: " + kg/100);
                    System.out.println("тонна: " + kg/1000);
                    break;
                case 3: ct = scanner.nextFloat();
                    System.out.println("центнер: " + ct);
                    System.out.println("грамм: " + ct*100000);
                    System.out.println("килограмм: " + ct*100);
                    System.out.println("тонна: " + ct/10);
                    break;
                case 4: ton = scanner.nextFloat();
                    System.out.println("тонна: " + ton);
                    System.out.println("грамм: " + ton*1000000);
                    System.out.println("килограмм: " + ton*1000);
                    System.out.println("центнер: " + ton*10);
                    break;
                default:
                    System.out.println("Введено неверное значение");
            }
        } else if(magnitude == 2) {
            System.out.println("Выберите единицу измерения: 1 - миллиметр, 2 - сантиметр, 3 - метр, 4 - километр");
            unit = scanner.nextInt();
            float mm, sm, m, km;
            System.out.print("Введите число: ");
            switch (unit) {
                case 1:
                    mm = scanner.nextFloat();
                    System.out.println("миллиметр: " + mm);
                    System.out.println("сантиметр: " + mm / 10);
                    System.out.println("метр: " + mm / 1000);
                    System.out.println("километр: " + mm / 1000000);
                    break;
                case 2:
                    sm = scanner.nextFloat();
                    System.out.println("сантиметр: " + sm);
                    System.out.println("миллиметр: " + sm * 10);
                    System.out.println("метр: " + sm / 100);
                    System.out.println("километр: " + sm / 100000);
                    break;
                case 3:
                    m = scanner.nextFloat();
                    System.out.println("метр: " + m);
                    System.out.println("миллиметр: " + m * 1000);
                    System.out.println("сантиметр: " + m * 100);
                    System.out.println("километр: " + m / 1000);
                    break;
                case 4:
                    km = scanner.nextFloat();
                    System.out.println("километр: " + km);
                    System.out.println("миллиметр: " + km * 1000000);
                    System.out.println("сантиметр: " + km * 100000);
                    System.out.println("метр: " + km * 1000);
                    break;
                default:
                    System.out.println("Введено неверное значение");
            }
        } else System.out.println("Введено неверное значение");
    }
}
