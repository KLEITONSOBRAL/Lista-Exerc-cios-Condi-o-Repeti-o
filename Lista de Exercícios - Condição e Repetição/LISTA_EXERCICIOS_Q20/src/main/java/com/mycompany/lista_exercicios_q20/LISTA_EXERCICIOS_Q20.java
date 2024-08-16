package com.mycompany.lista_exercicios_q20;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o valor da compra:");
        double valorCompra = scanner.nextDouble();

        
        System.out.println("Digite o percentual de desconto:");
        double percentualDesconto = scanner.nextDouble();

       
        if (percentualDesconto >= 0 && percentualDesconto <= 100) {
            
            double valorDesconto = (valorCompra * percentualDesconto) / 100;

            
            double valorFinal = valorCompra - valorDesconto;

            
            System.out.println("O valor final da compra com " + percentualDesconto + "% de desconto e: R$ " + valorFinal);
        } else {
            
            System.out.println("Percentual de desconto invalido. Deve estar entre 0 e 100.");
        }

        scanner.close();
    }
}
