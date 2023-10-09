package com.algaworks.contaspagar.servico;

import com.algaworks.pagamentos.Beneficiario;
import com.algaworks.pagamentos.DocumentoPagavel;
import com.algaworks.pagamentos.MetodoPagamento;
import com.algaworks.pagamentos.Pix;


public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar (DocumentoPagavel documento){

        // Poderia ter outras regras de negócio aqui
        // como por exemplo registrar o pagamento no bancod de dados,
        // enviar uma notificação por e-mail, etc.

        metodoPagamento.pagar(documento);
    }

}
