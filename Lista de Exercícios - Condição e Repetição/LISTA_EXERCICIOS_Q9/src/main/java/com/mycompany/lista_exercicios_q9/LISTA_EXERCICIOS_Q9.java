package com.mycompany.lista_exercicios_q9;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um numero para verificar se e primo:");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        
        if (ehPrimo) {
            System.out.println(numero + " e um numero primo.");
        } else {
            System.out.println(numero + " nao e um numero primo.");
        }

        scanner.close();
    }
}
