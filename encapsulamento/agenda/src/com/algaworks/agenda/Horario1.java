package com.algaworks.agenda;
    // Com records
public record Horario1(int hora, int minuto){

    public Horario1(int hora, int minuto){
        if(hora < 0 || hora > 23){
            throw new IllegalArgumentException("Hora Inválida: " + hora);
        }
        if (minuto < 0 || minuto > 59){
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;

    }

    public String formatar(){
        return String.format("%dh%dh", hora,minuto);
    }

}
