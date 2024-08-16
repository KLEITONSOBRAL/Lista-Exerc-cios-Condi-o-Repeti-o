package com.mycompany.lista_exercicios_q17;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine().toLowerCase(); 

        int contagemVogais = 0;

        
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contagemVogais++;
            }
        }

        
        System.out.println("NUmero de vogais na frase: " + contagemVogais);

        scanner.close();
    }
}
