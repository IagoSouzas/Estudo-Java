package org.example.EstudoSobreJava.OrietacaoObjetos.ServicoPrecificacao;

public class MainPrecificacao3 {

    public static void main(String[] args) {

        Produto.alterarCustoEmbalagem(10);

        Produto produto = new Produto();
        produto.alterarPrecoCusto(100);

        System.out.println("Total de custos: " + Produto.calcularCustosTotais(produto));

    }

}
