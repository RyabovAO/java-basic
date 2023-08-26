package javaBasic;

import java.util.Locale;

public class Task12 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        System.out.println(s.contains("Java"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("!!!"));
        if(s.contains("Java") && s.startsWith("I like") && s.endsWith("!!!")) {
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
        System.out.println(s.replaceAll("a", "o").substring(s.indexOf('J'), s.indexOf('!')));
    }
}
