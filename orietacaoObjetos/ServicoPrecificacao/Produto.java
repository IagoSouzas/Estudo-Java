package org.example.EstudoSobreJava.OrietacaoObjetos.ServicoPrecificacao;

public class Produto {

    static double custoEmbalagem;

    double precoCusto;
    double precoVenda;

    static  double calcularCustosTotais(Produto produto){

        return produto.precoCusto + Produto.custoEmbalagem;

    }

    void alterarPrecoCusto(double precoCusto){

        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;

    }

    static void imprimirCustoEmbalagem(){
        System.out.println("Custo com embalagem:" + Produto.custoEmbalagem);

    }

}
