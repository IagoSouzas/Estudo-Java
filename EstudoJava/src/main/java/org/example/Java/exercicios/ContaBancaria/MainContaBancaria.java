package org.example.exercicios.ContaBancaria;

public class MainContaBancaria {

    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.titular = "Iago Souza";
        contaBancaria.saldo = 0.0;
        // Realizar um depósito de 100.0 na conta
        contaBancaria.realizarDeposito(100.0);

        // Realizar um saque de 50.0 na conta
        //contaBancaria.realizarSaque(50.0);

        System.out.println(contaBancaria.getSaldoAtual());


    }

}
