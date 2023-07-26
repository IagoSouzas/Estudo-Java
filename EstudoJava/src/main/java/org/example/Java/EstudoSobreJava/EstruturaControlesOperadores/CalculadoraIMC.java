package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Peso: ");
        int peso = entrada.nextInt();

        System.out.println("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * 2);

        if (imc < 18.5){
            System.out.println("Abaixo do peso ideal.");
        }
        if (imc >= 18.5 && imc < 25){
            System.out.println("Peso ideal.");
        }
        if (imc >= 25 && imc < 30){
            System.out.println("Acima do peso. ");
        }
        if (imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I.");
        }
        if (imc >= 35 && imc < 40 ){
            System.out.println("Obesidade grau II");
        }
        if (imc >= 40 ){
            System.out.println("Obesidade grau III");
        }

        System.out.println("Fim do programa.");

    }

}
