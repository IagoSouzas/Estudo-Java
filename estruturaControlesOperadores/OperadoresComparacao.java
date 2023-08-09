package org.example.EstudoSobreJava.EstruturaControlesOperadores;

public class OperadoresComparacao {

    public static void main (String args[]){
        int pesoProdutos = 1000;
        int limitePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos > limitePesoCaminhao;

        System.out.println("Carga excedida: " + cargaExcedida);

        boolean cargaLiberada = pesoProdutos <= limitePesoCaminhao;

        System.out.println("Carga liberada: " + cargaLiberada);
    }

}
