package com.mycompany.lista_exercicios_q1;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        
        System.out.println("Digite sua nota em MATEMATICA:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Digite sua nota em PORTUGUES:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Digite sua nota em BIOLOGIA");
        nota3 = scanner.nextDouble();
        
        
        media = (nota1 + nota2 + nota3)/ 3;
        
        if(media >=7){
            System.out.println("APROVADO");
        }
        else if(media >=5 && media <7){
            System.out.println("RECUPERACAO");
        }
        else{
            System.out.println("REPROVADO");
        }
        
        System.out.println("Sua media vai ser de " + media);
        
        scanner.close();
             
    }
}
