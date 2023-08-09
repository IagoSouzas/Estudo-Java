package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class ControlePesoAeronave {

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Peso máximo da aeronave: ");
        int pesoMaximo = entrada.nextInt();

        System.out.println("Quantidade de passageiros: ");
        int totalPassgeiros = entrada.nextInt();

        int pesoTotal = 0;

        for (int passageiroAtual = 1 ; passageiroAtual <= totalPassgeiros; passageiroAtual++) {
            System.out.println("Peso do passageiro:" + passageiroAtual);
            int pesoPassageiro = entrada.nextInt();

            pesoTotal += pesoPassageiro;
        }
        String resul = pesoTotal > pesoMaximo ? "Peso excedido" : "liberado";

        System.out.println("Peso máximo da aeronave: " + pesoMaximo);
        System.out.println("Peso total dos passgeiros: " + pesoTotal);
        System.out.println("Situação da aeronave: " + resul );



    }

}
