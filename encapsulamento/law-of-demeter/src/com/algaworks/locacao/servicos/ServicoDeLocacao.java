package com.algaworks.locacao.servicos;

import com.algaworks.locacao.Locacao;

public class ServicoDeLocacao {

    public void confirmarLocacao(Locacao locacao){
        double totalDiarias = locacao.calcularTotalDiaria();

        // TODO ralizar lógica para registrar locação pelo valor das diárias

        locacao.reservarVeiculo();
    }

}
