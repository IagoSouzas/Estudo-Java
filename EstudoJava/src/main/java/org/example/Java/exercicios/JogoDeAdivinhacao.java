package org.example.exercicios;

import java.util.Scanner;

public class JogoDeAdivinhacao {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 10) + 1; // Gera um número aleatório entre 1 e 10
        boolean acertou = false;
        int tentativas = 3;

        String bemVindo = "Bem vindo oa jogo de adivinhação \n \n" +
                "O jogador terá até 3 tentativas para adivinhar o número correto.\n" +
                "A cada tentativa, o programa deve informar se o número é maior ou menor que o número correto.\n" +
                "Se o jogador acertar o número dentro das 3 tentativas, ele ganha o jogo. Caso contrário, ele perde." ;

        System.out.println(bemVindo);

        System.out.println("1. Jogar \n2. Sair");
        int game = entrada.nextInt();

        switch (game){
            case 1:
                for (int tentativa = 1; tentativa <= tentativas; tentativa++) {
                    System.out.print("Tentativa " + tentativa + ": Digite um número entre 1 e 10: ");
                    int numeroDigitado = entrada.nextInt();


                    if (numeroDigitado == numeroAleatorio){
                    acertou = true;
                    break;
                    } else if(numeroDigitado < numeroAleatorio){
                    System.out.println("O número é maior.");
                    } else {
                    System.out.println("O número é menor");
                    }
                }
                    if (acertou){
                    System.out.println("Parabéns! Você acertou o número!");
                    } else{
                    System.out.println("Suas tentativas acabaram. O número correto era: " + numeroAleatorio);
                    }

                break;
            case 2:
                System.out.println("Fim do programa.");
                break;
        }


    }

}



