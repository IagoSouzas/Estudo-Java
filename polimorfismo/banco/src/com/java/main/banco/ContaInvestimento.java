package com.java.main.banco;

public class ContaInvestimento extends Conta{

    public ContaInvestimento(){
    }

    public ContaInvestimento(Titular titular, int agencia, int numero, double valorTotalRendimentos) {
        super(titular, agencia, numero);
        this.valorTotalRendimentos = valorTotalRendimentos;
    }

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros){
            double valorRendimentos = getSaldo() * percentualJuros / 100;
            this.valorTotalRendimentos += valorRendimentos;
            depositar(valorRendimentos);
    }

    @Override
    public String toString() {
        return "Conta investimento: " +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                "valorTotalRendimentos=" + getValorTotalRendimentos();
    }
}
