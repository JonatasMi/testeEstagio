package org.example;

import java.util.Scanner;

public class SequenciaDeFibonacci {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("informe um número");
        int valor = sc.nextInt();

        while (valor > num3) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if (valor == num3) {
            System.out.println("O valor esta na sequencia de fibonacci. " + valor);
        }
    }
}
