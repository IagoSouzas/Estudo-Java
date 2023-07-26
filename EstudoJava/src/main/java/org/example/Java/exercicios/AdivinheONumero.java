package org.example.exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

    public static void main(String args[]) {

        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100 + 1);

        int tentativas = 1;

        String bemVindo = "Bem vindo ao jogo de advinhação, você\nprecisa acertar um número aleatorio entre (1 a 100)\n";

        System.out.println(bemVindo);

        for (int i = tentativas; i <= 10; i++) {

            System.out.println("tentativa:" + i + "° \nDigite seu palpite: ");
            int numeroPalpite = entrada.nextInt();

            if (numeroPalpite == numeroAleatorio) {
                System.out.println("Parábens! você acertou");
                break;

            }

            if (numeroPalpite > numeroAleatorio) {
                System.out.println("palpite muito alto\n");
            } else {
                System.out.println("Palpite muito baixo\n");

            }
            if (i >= 10) {
                System.out.println("O número correto é:" + numeroAleatorio);
                break;
            }
        }


    }

}
