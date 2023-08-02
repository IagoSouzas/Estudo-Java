package org.example.EstudoSobreJava.OrietacaoObjetos.ServicoPrecificacao;

public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro){
        //Poderia ter muitos calculos mais complexos

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto,
                percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }

}
