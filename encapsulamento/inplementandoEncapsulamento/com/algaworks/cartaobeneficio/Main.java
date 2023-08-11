package com.algaworks.cartaobeneficio;

import com.algaworks.cartaobeneficio.servico.ServicoDeDepositoPix;
import com.algaworks.cartaobeneficio.servico.ServicoDePagamentoOnline;

public class Main {

    public static void main(String[] args) {

        /* Adicionamos o encapsulamento e deixou o código ficou mais consistente
        * deixando o códigos com menos probabilidade de erros de terceiros.*/



        var supermercado = new Estabelecimento("Supermercado do zé");
        var cartao = new Cartao("joão souza silva");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao,500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento =  servicoDePagamento.efetuarPagamento(supermercado,cartao,100);
        reciboPagamento.imprimir();

        System.out.println("Titular: "+ cartao.obterSaldo());
        System.out.println("Saldo: "+ cartao.obterSaldo());

    }

}
