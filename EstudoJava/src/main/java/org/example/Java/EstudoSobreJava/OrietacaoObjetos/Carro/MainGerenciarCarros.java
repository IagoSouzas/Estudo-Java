package org.example.EstudoSobreJava.OrietacaoObjetos.Carro;

public class MainGerenciarCarros {

    public static void main(String[] args) {

        // caso não faça uma instancia sem extends, quando for rodar o codigo vai dar
        // um erro de null extends.

        //Também da para instanciar de uma forma mais facil igual fizemos com o "Gerenciar Carro"
        Pessoa eu = new Pessoa();
        eu.nome ="Iago souza";
        eu.cpf="111.222.333-15";
        eu.anoNascimento = 2005;


        GerenciarCarro carro = new GerenciarCarro();
        carro.modelo = "corsa" ;
        carro.cor = "Vermelho";
        carro.anoFabricacao = 2005;
        carro.fabricante = "Pegout";
        carro.precoCompra = 10000;
        carro.propietario = eu;

        Pessoa voce = new Pessoa();
        voce.nome ="Gabriel Augusto";
        voce.cpf="111.222.333-15";
        voce.anoNascimento = 1970;

        GerenciarCarro seuCarro = new GerenciarCarro();
        seuCarro.modelo = "BMW iX1";
        seuCarro.cor = "Branca";
        carro.fabricante = "BMW";
        seuCarro.anoFabricacao = 2020;
        seuCarro.precoCompra = 98000;
        seuCarro.propietario = voce;

        double ipva = carro.calcularIpva();
        System.out.println(ipva);

        carro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();



        //carro.calcularValorRevenda();
        //seuCarro.calcularValorRevenda();

//        System.out.println("Meu Carro");
//        System.out.println("---------");
//        System.out.println("Modelo: " + carro.modelo);
//        System.out.println("Ano: " + carro.anoFabricacao);
//        System.out.println("Propietário: " + carro.propietario.nome);
//
//        System.out.println("\nSeu Carro");
//        System.out.println("---------");
//        System.out.println("Modelo: " + seuCarro.modelo);
//        System.out.println("Ano: " + seuCarro.anoFabricacao);
//        System.out.println("Propietário: " + seuCarro.propietario.nome);

    }

}
