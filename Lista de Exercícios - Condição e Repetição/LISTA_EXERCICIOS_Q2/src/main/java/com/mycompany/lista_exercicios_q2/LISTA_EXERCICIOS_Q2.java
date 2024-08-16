package com.mycompany.lista_exercicios_q2;

import java.util.Random;
import java.util.Scanner;

public class LISTA_EXERCICIOS_Q2 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numero = random.nextInt(100);
        int tentativas = 100;
        int numeroAdiv = new Random().nextInt(100);
        
        while(tentativas != 0){
            System.out.println("**BEM VINDO AO JOGO DE ADIVINHACAO**");
            System.out.println("**DIGITE UM NUMERO ENTRE 0 E 100**");
            numero = scanner.nextInt();
            
            if (numero == numeroAdiv){
                System.out.println("VOCE ACERTOU!");
            }
            else if (numero < numeroAdiv){
                System.out.println("O NUMERO E MAIOR DO QUE " + numero);
            }
            else {
                System.out.println("O NUMERO E MENOR DO QUE " + numero);
            }
            
        }
            
        
        
    }
}
