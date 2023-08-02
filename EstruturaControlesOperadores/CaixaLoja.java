package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class CaixaLoja {

    public static void main (String args []){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço dos produtos: ");
        double precoProdutos = entrada.nextDouble();

        System.out.println("Cobrar frete? ");
        boolean cobrarFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if (cobrarFrete){

            System.out.println("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        }

        double valorTotal = precoProdutos + valorFrete;

        System.out.println("Valor Total: " + valorTotal);

    }

}
