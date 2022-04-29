package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Доп.Задание 4");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ":ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ":pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ":ping");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Доп.задание 5");
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < 8; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
