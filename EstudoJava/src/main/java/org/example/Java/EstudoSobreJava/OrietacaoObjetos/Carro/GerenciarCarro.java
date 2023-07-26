package org.example.EstudoSobreJava.OrietacaoObjetos.Carro;

public class GerenciarCarro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;
    Pessoa propietario = new Pessoa(); //fazendo essa instancia possibilita que mostramos o nome em outra clase


    void imprimirResumoDepreciacao(){

        double valorRevendaCarro = calcularValorRevenda();
        int tempoDeUsoCarro = calcularTempoDeUsoEmAnos();
        double Ipva = calcularIpva();

        System.out.println("\nTempo de uso (anos): " + tempoDeUsoCarro);
        System.out.println("Valor de revenda: " + valorRevendaCarro);
        System.out.println("O Ipva é: " + Ipva);

    }

    double calcularIpva(){
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

        if (tempoDeUsoEmAnos >= 10 ){
            return 0;
        }


        return calcularValorRevenda() * 0.04;
    }

    int calcularTempoDeUsoEmAnos(){

        return 2023 - anoFabricacao;

    }

    double calcularValorRevenda(){
        int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoDeUsoEmAnos);

        if (valorRevenda < 0) {
            valorRevenda = 0;
        }


        return valorRevenda;

    }

}
