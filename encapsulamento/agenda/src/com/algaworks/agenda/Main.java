package com.algaworks.agenda;

public class Main {

    // Boas práticas; Criando cópias defensivas
    public static void main(String[] args) {

        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        agendamentoCabelo.getHorario().setHora(11);

        Agendamento agendamentoBarba = new Agendamento(horario, "Feitio de Barba");

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);

    }

    private static void imprimir(Agendamento agendamento){
        System.out.printf("%s às %s%n",agendamento.getDescricao(), agendamento.getHorario());
    }
}