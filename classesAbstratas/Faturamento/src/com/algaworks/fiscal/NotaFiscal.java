package com.algaworks.fiscal;

public abstract class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImpostos();

    public void emitir(){

        System.out.println("Emitindo nota fiscal para:"+ getDescricao());
        System.out.println("Valor total: "+ getValorTotal());
        System.out.println("Impostos: "+calcularImpostos());
    }
}
