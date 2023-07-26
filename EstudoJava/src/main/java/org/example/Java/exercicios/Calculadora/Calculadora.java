package org.example.exercicios.Calculadora;

import java.util.Scanner;

public class Calculadora {

    Scanner entrada = new Scanner(System.in);
    double n1;
    double n2;
    double soma;
    double sub;
    double mult;
    double divi;
    int escolha;


    void calculadora(){
        System.out.println("Escolha a operação: \n1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Sair");
        escolha = entrada.nextInt();

        switch (escolha){
            case 1:
                imprimir();
                adicao();
                break;
            case 2:
                imprimir();
                subtracao();
                break;
            case 3:
                imprimir();
                multiplicacao();
                break;
            case 4:
                imprimir();
                divisao();
                break;
            case 5:
        }

    }

    void imprimir(){
        System.out.println("Digite o primeiro número");
        n1 = entrada.nextDouble();
        System.out.println("Digite o segundo número");
        n2 = entrada.nextDouble();
    }

    double adicao(){

        soma = n1 + n2;

        System.out.println("O resultado da soma: " + soma);

        return soma;

    }

    double subtracao(){
        sub = n1 - n2;

        System.out.println("O resultado da subtração: " + sub);

        return sub;
    }

    double multiplicacao(){
        mult = n1 * n2;

        System.out.println("O resultado da multiplicação: " + mult);

        return mult;
    }

    double divisao(){
        divi = n1 / n2;

        System.out.println("O resultado da divisão: " + divi);

        return divi;
    }



}
