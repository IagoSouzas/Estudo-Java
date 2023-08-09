package org.example.EstudoSobreJava.OrietacaoObjetos.ServicoPrecificacao;

public class MainPrecificao {

    public static void main(String[] args) {
        Produto.custoEmbalagem = 10;

        Produto novoProduto = new Produto();
        // novoProduto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(100);

        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.println("Preço de custo: "+ novoProduto.precoCusto);
        System.out.println("Preço de venda: "+ novoProduto.precoVenda);

    }

}
