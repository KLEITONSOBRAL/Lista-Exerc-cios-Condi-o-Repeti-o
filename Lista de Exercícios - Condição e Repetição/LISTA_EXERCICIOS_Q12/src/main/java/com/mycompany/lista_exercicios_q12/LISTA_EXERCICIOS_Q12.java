package com.mycompany.lista_exercicios_q12;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        
        System.out.println("Digite o numero de eleitores:");
        int numeroDeEleitores = scanner.nextInt();

        
        for (int i = 1; i <= numeroDeEleitores; i++) {
            System.out.println("Eleitor " + i + ", vote no candidato (1, 2 ou 3):");
            int voto = scanner.nextInt();

            
            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto invalido.");
                i--;
            }
        }

        
        System.out.println("Resultado da votacao:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

        
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("O vencedor e o Candidato 1!");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("O vencedor e o Candidato 2!");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("O vencedor e o Candidato 3!");
        } else {
            System.out.println("Houve um empate!");
        }

        scanner.close();
    }
}
