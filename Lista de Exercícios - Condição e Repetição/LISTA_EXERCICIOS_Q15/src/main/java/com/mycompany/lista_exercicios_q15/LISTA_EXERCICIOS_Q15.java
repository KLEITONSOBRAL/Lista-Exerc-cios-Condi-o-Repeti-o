package com.mycompany.lista_exercicios_q15;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um numero para calcular o fatorial:");
        int numero = scanner.nextInt();

        
        long fatorial = 1;

        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        
        System.out.println("O fatorial de " + numero + " e: " + fatorial);

        scanner.close();
    }
}
