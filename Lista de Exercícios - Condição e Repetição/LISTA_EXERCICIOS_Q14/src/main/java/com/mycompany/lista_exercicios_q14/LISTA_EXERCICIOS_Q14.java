package com.mycompany.lista_exercicios_q14;

import java.util.Random;
import java.util.Scanner;

public class LISTA_EXERCICIOS_Q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.println("Escolha: Par ou Impar? (Digite 'P' para Par e 'I' para Impar):");
        char escolhaUsuario = scanner.next().toUpperCase().charAt(0);

        
        System.out.println("Escolha um numero:");
        int numeroUsuario = scanner.nextInt();

        
        int numeroComputador = random.nextInt(10); 

        System.out.println("Voce escolheu o numero " + numeroUsuario);
        System.out.println("O computador sorteou o numero " + numeroComputador);

        
        int soma = numeroUsuario + numeroComputador;
        System.out.println("A soma dos numeros e: " + soma);

        
        boolean somaEhPar = soma % 2 == 0;

        
        if (somaEhPar && escolhaUsuario == 'P') {
            System.out.println("A soma e Par. Voce venceu!");
        } else if (!somaEhPar && escolhaUsuario == 'I') {
            System.out.println("A soma e Impar. Voce venceu!");
        } else {
            System.out.println("Voce perdeu. Tente novamente!");
        }

        scanner.close();
    }
}
