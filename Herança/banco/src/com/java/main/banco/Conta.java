package com.java.main.banco;

public class Conta {

    public Conta(){

    }

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    // getters e setters
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public final double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void validarSaldoParaSaque(double valorSaque){
        if (getSaldo() < valorSaque){
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public final void sacar(double valorSaque){
        if (valorSaque <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public final void depositar(double valorDeposito){
        if (valorDeposito <= 0){
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }
        saldo += valorDeposito;
    }

    public void imprimirDemostrativo(){
        System.out.println();
        System.out.println("Agência: " + getAgencia());
        System.out.println("Conta: "+ getNumero());
        System.out.println("Titular: "+ getTitular().getNome());
        System.out.println("Saldo: "+ getSaldo());
    }

    @Override
    public String toString() {
        return "Conta: " +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero;
    }
}
