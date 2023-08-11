package com.algaworks.cartaobeneficio;

public class Recibo {

    String titular;
    public String descricao;
    public double valor;

    public Recibo(String titular, String descricao, double valor){
        this.titular = titular;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir(){
        System.out.println("---------------");
        System.out.println("RECIBO PARA "+ titular);
        System.out.println(descricao+ " -> " + valor);
        System.out.println("---------------");
    }

}
