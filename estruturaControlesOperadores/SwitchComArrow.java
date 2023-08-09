package org.example.EstudoSobreJava.EstruturaControlesOperadores;

import java.util.Scanner;

public class SwitchComArrow {

    public static void main (String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um dia da semana (ex: dom, seg, ter, qua, qui, sex, sab");
        String diaSemana = entrada.nextLine();
        String horarioDeFuncionamento;

        switch (diaSemana){

            case "sab" , "dom" -> horarioDeFuncionamento = "fechado";
            case "seg", "ter", "qua", "qui" -> horarioDeFuncionamento = "08:00 às 18:00";
            case "sex" -> horarioDeFuncionamento = "08:00 às 12:00";
            default -> horarioDeFuncionamento = "Dia inválido";
        }

        System.out.println("Horário de funcionamento: " + horarioDeFuncionamento);


    }

}
