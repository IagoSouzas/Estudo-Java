package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class DoWhile {
//mega sena
    public static void main (String args[]){
    Scanner entrada = new Scanner(System.in);

    int quantidadeNumeros = 0;

    do {
        System.out.println("Quantidade de números: ");
        quantidadeNumeros = entrada.nextInt();

        if (quantidadeNumeros < 6 || quantidadeNumeros > 15){
            System.out.println("Quantidade de números deve ser entre 6 e 15.");
        }

    } while (quantidadeNumeros < 6 || quantidadeNumeros > 15);

        int numeroAtual = 1;
        String numerosEscolhidos = "";

        do {

            System.out.println("Número: " + numeroAtual+ "/" + quantidadeNumeros);
                int numeroEscolhido = entrada.nextInt();

                numerosEscolhidos += numeroEscolhido + " ";
                numeroAtual ++;
        } while (numeroAtual <= quantidadeNumeros);

        System.out.println("Número escolhidos: " + numerosEscolhidos);
    }
}
