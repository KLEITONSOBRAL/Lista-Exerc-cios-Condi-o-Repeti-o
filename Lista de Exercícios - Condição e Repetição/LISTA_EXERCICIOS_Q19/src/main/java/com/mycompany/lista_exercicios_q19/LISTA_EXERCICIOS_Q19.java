package com.mycompany.lista_exercicios_q19;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite a base:");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente:");
        int expoente = scanner.nextInt();

        
        int resultado = 1;

        
        for (int i = 1; i <= expoente; i++) {
            resultado *= base; 
        }

        
        System.out.println(base + "^" + expoente + " = " + resultado);

        scanner.close();
    }
}
