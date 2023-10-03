package com.algaworks.contaspagar.servico;

import com.algaworks.pagamentos.Beneficiario;
import com.algaworks.pagamentos.DocumentoPagavel;


public class ServicoContaPagar {

    public void pagar (DocumentoPagavel documento){

        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Beneficiário não possui chave pix.");
        }
        System.out.println("DEBUG: Efetuando PIX para "+beneficiario.getNome()+
                " no valor de " + documento.getValorTotal() +" com a chave: "
                + beneficiario.getChavePix());

    }

}
