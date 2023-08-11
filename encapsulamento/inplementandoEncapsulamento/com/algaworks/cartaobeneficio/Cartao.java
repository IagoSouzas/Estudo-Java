package com.algaworks.cartaobeneficio;

public class Cartao {

    public static final double TARIFCA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;

    public Cartao(String titular){
        this.titular = titular;

    }

    public String obterTitular(){
        return titular;
    }

    public double obterSaldo(){
        return saldo;
    }

    public void alterarSaldo(double saldo){

        this.saldo = saldo;
    }

    public void debitar(double valorDebito){

        if (obterSaldo() < valorDebito){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito){

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que "+ Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo += valorDeposito - TARIFCA_DEPOSITO;
    }

}
