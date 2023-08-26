package javaBasic;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = sc.nextLine();
        String[] strArr = s.split(" ");
        for (String i : strArr) {
            if(i.matches("[A-Za-z]+")) System.out.println(i);
        }
        System.out.println(strArr.length);
    }
}
