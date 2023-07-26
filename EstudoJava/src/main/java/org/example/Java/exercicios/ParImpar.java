package org.example.exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main (String args []){

        System.out.println("Olá, esse é um programa para saber se o número é Par ou Ímpar");

        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um valor positivo: ");

        int numero = digite.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
