package org.example.exercicios;

import java.util.Scanner;

public class ContagemRegressivaComSinal {

    public static void main (String args[]){

        /*Seu objetivo é escrever um programa que solicita ao
        usuário um número inteiro positivo e, em seguida,
        exibe uma contagem regressiva até zero.
        A particularidade deste desafio é que,
        para números pares, a contagem regressiva
        deve ser precedida pelo sinal "-" (negativo),
        e para números ímpares, a contagem regressiva
        deve ser precedida pelo sinal "+" (positivo).*/

        Scanner entrada = new Scanner(System.in);

        int numeroPositivo = 0;

        do {
            System.out.println("Digite um número inteiro positivo: ");
            numeroPositivo = entrada.nextInt();

        } while (numeroPositivo <= 0);

            for (int i = numeroPositivo; i >= 0 ; i--){
                if (i % 2 == 0 ){

                    System.out.println("-" + i + " ");
                } else{
                    System.out.println("+" + i + " ");
                }

            }



    }

}
