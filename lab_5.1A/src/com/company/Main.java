package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
//Реалізувати клас Goods. Поле first – дробове додатне число, ціна товару; поле second
//– ціле додатне число, кількість одиниць товару. Реалізувати метод cost( ) – обчислення
//вартості товару.

   /* У всіх завданнях необхідно реалізувати:
 конструктор ініціалізації (один або декілька),
 конструктор без аргументів і
 конструктор копіювання.*/

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;

        do {
            System.out.println("Уведіть значення ціни.");
            price = sc.nextDouble();

            if (price < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    CommonErrors.printBasicError();
                }
            }
        } while (price < 0);

        do {
            System.out.println("Уведіть кількість товару.");
            quantity = sc.nextInt();

            if (quantity < 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    CommonErrors.printBasicError();
                }
            }
        } while (quantity < 0);
        Goods goods = new Goods(price, quantity);

        /*goods.setPrice(2);
        goods.setQuantity(12);*/

        System.out.println(goods);
        goods.cost(goods);

    }
}
