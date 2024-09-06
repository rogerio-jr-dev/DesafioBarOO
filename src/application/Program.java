package application;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        while (bill.gender != 'M' && bill.gender != 'F') {
            System.out.print("O gênero deve ser 'M' ou 'F': ");
            bill.gender = sc.next().charAt(0);
        }
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        System.out.println("\nRELATÓRIO:");

        System.out.print("Consumo = R$ " + String.format("%.2f", bill.feeding()));
        System.out.println();
        if (bill.cover() == 0.00) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.println("Couvert = R$ 4.00");
        }
        System.out.printf("Ingresso = R$ " + String.format("%.2f", bill.ticket()));
        System.out.println();
        System.out.printf("\nValor a pagar = R$ " + String.format("%.2f", bill.total()));
        sc.close();
    }
}
