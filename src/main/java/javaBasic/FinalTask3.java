package javaBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = sc.nextInt();
        String res = "";
        Set<Character> set = new HashSet<>();
        int currentMax = 0;
        System.out.print("Введите строки: ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            String s = sc.nextLine();
            list.add(s);
        }
        int prevMax = 0;
        for (int i = 0; i < list.size(); i++) {
            char[] ch = (list.get(i).toCharArray());
            for (int j = 0; j < ch.length; j++) {
                set.add(ch[j]);
            }
            currentMax = set.size();
            if (currentMax > prevMax) {
                res = list.get(i);
                prevMax = currentMax;
            }
            set.clear();
        }
        System.out.println(res);
    }
}
