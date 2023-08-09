package org.example.EstudoSobreJava.FundamentosDoJava;

public class ExemploByteShort {

    public static void main (String args[]){

        byte idade = 127;
       // byte idade2 = 128; não compila por que byte só permite um numero até 127

        short quantidadeEstoque = 32767; // valor maximo de um short

        System.out.println( "o comando byte: " + idade
                + " comando short: " + quantidadeEstoque + " valor maximo dos dois");
    }

}
