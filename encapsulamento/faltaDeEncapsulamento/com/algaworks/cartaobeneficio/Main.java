package com.algaworks.cartaobeneficio;

import com.algaworks.cartaobeneficio.servico.ServicoDeDepositoPix;
import com.algaworks.cartaobeneficio.servico.ServicoDePagamentoOnline;

public class Main {

    public static void main(String[] args) {

        /* A falta do encapsulamento deixou o projeto incossistente e com possíveis bugs no futuro
        * Para termos esse controle de acesso vamos utilizar o encapsulamento, para que deixe nosso projeto
        * mais seguro e também com uma boa prática*/



        var supermercado = new Estabelecimento("Supermercado do zé");
        var cartao = new Cartao("joão souza silva");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao,500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento =  servicoDePagamento.efetuarPagamento(supermercado,cartao,100);
        reciboPagamento.imprimir();

        System.out.println("Titular: "+ cartao.titular);
        System.out.println("Saldo: "+ cartao.saldo);

    }

}
