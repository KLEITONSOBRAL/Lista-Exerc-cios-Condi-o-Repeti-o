package com.mycompany.lista_exercicios_q11;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite a temperatura que deseja converter:");
        double temperatura = scanner.nextDouble();

        
        System.out.println("Digite a unidade de origem (C para Celsius, F para Fahrenheit):");
        char unidadeOrigem = scanner.next().toUpperCase().charAt(0);

        double temperaturaConvertida;

        
        if (unidadeOrigem == 'C') {
            
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.println(temperatura + " C e igual a " + temperaturaConvertida + " F");
        } else if (unidadeOrigem == 'F') {
            
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "F e igual a " + temperaturaConvertida + "C");
        } else {
            
            System.out.println("Unidade de origem invalida. Use 'C' para Celsius ou 'F' para Fahrenheit.");
        }

        scanner.close();
    }
}
