package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito){
        // TODO faz cobrança do valor no Pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que "+ Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFCA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);
    }

}
