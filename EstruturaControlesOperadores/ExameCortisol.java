package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class ExameCortisol {

    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu Cortisol: ");
        double cortisol = entrada.nextDouble();

        // cortisol ideal é de 6 a 18,4

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;

        System.out.println("Cortisol normal: " + resultadoNormal);

        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;
        System.out.println("Coritsol anormal: " + resultadoAnormal);
    }

}
