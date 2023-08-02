package org.example.EstudoSobreJava.FundamentosDoJava;

public class ExemploBoolean {
    public static void main(String args[]){
        // boolean é verdadeiro ou falso
    boolean compraAprovada = true;
    boolean clienteBloqueado = false;

    System.out.println(compraAprovada);
    System.out.println(clienteBloqueado);

    // aqui está uma exemplo utilizando boolean
    int quantidadeEstoque = 10;
    int quantidadePedidoCompra = 9;

    boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
    // então esse programa vai dar true.
        System.out.println("Estoque suficiente: " + estoqueSuficiente);
}
}