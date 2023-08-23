package com.algaworks.locacao;

import com.algaworks.locacao.GrupoVeiculo;

public class Veiculo {

    private String placa;
    private boolean disponivel = true;
    private GrupoVeiculo grupoVeiculo;

    public Veiculo(){

    }

    public Veiculo(String placa, GrupoVeiculo grupo){
        this.placa = placa;
        this.grupoVeiculo = grupo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public GrupoVeiculo getGrupoVeiculo() {
        return grupoVeiculo;
    }

    public void setGrupoVeiculo(GrupoVeiculo grupoVeiculo) {
        this.grupoVeiculo = grupoVeiculo;
    }

    public double getValorDiaria() {
        return grupoVeiculo.getValorDiaria();
    }
}
