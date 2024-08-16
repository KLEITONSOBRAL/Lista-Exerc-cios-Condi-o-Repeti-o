package com.mycompany.lista_exercicios_q8;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        while (true) {
            
            System.out.println("Digite uma senha (minimo 8 caracteres):");
            senha = scanner.nextLine();

            
            if (senha.length() >= 8) {
                System.out.println("Senha valida!");
                break;
            } else {
                System.out.println("Senha invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
