package com.mycompany.lista_exercicios_q16;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite uma palavra para verificar se e um palindromo:");
        String palavra = scanner.nextLine();

        boolean Palindromo = true;

        
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                Palindromo = false;
                break;
            }
        }

        
        if (Palindromo) {
            System.out.println(palavra + " e um palíndromo.");
        } else {
            System.out.println(palavra + " nao e um palindromo.");
        }

        scanner.close();
    }
}
