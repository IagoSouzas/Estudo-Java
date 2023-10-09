package com.algaworks.financeiro;

public class ContaPagar {

    Fornecedor fornecedor = new Fornecedor();

    private String descricao;
    private double valor;
    private String dataVencimento;
    private boolean pago;

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    // metodos

    public boolean pagar(){

        if(isPago()){
            throw new RuntimeException("Conta já está paga.");
        }
        setPago(true);
        return true;
    }

    public boolean cancelarPagamento(){

        if(isPago() == false){
            throw new RuntimeException("Conta já está pendente");
        }
        setPago(false);
        return false;
    }

}
