package com.mycompany.lista_exercicios_q13;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite um ano para verificar se e bissexto:");
        int ano = scanner.nextInt();

        
        boolean Bissexto;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    Bissexto = true;
                } else {
                    Bissexto = false;
                }
            } else {
                Bissexto = true; 
            }
        } else {
            Bissexto = false; 
        }

        
        if (Bissexto) {
            System.out.println(ano + " e um ano bissexto.");
        } else {
            System.out.println(ano + " nao e um ano bissexto.");
        }

        scanner.close();
    }
}
