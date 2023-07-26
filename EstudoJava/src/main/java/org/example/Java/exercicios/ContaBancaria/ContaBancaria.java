package org.example.exercicios.ContaBancaria;

public class ContaBancaria {

    String titular;
    double saldo;

    public void realizarDeposito(double valorDeposito) {
        saldo += valorDeposito;
    }

    public void realizarSaque(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente para saque. Saque inválido.");
        }
    }

    public String getSaldoAtual() {
        return "O saldo atual é: " + saldo;
    }


}
