package com.mycompany.lista_exercicios_q18;

import java.util.Scanner;

public class LISTA_EXERCICIOS_Q18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Escolha o tipo de veiculo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhao");

        
        int tipoVeiculo = scanner.nextInt();

        double valorPedagio = 0;

        
        if (tipoVeiculo == 1) {
            valorPedagio = 5.00;
            System.out.println("Voce escolheu Carro. O valor do pedagio e R$ " + valorPedagio);
        } else if (tipoVeiculo == 2) {
            valorPedagio = 2.50;
            System.out.println("Voce escolheu Moto. O valor do pedagio e R$ " + valorPedagio);
        } else if (tipoVeiculo == 3) {
            valorPedagio = 7.00;
            System.out.println("Voce escolheu Caminhao. O valor do pedagio e R$ " + valorPedagio);
        } else {
            System.out.println("Tipo de veiculo invalido.");
        }

        scanner.close();
    }
}
