package com.mycompany.lista_exercicios_q3;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operacao: +, -, *, /");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        double resultado = 0;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Operacao invalida.");
            scanner.close();
            return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
