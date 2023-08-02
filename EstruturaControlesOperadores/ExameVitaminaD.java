package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class ExameVitaminaD {

    public static void main (String args []){

        //Desejável: acima de 20 ng/ML

        // Grupos de risco: 30 a 60 ng/60ML

        Scanner entrada = new Scanner(System.in);

        System.out.println("Grupo de risco: ");
        boolean grupoDeRisco = entrada.nextBoolean();

        System.out.println("Vitamina D: ");
        double vitaminaD = entrada.nextDouble(); //nanograma por mililitro

        boolean vitaminaDNormal = grupoDeRisco == false && vitaminaD > 20 || grupoDeRisco == true
                && vitaminaD >= 30 && vitaminaD <= 60;

        System.out.println("Vitamina D normal: " + vitaminaDNormal);

    }




}
