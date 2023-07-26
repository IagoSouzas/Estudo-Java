package org.example.EstudoSobreJava.FundamentosDoJava;

public class ConversãoLongParaInt {

    public static void main (String args []){
        long x = 10_5015239847l;
        // int y = x; não compila

        int y = (int) x;

        //Não é uma boa pratica fazer essa conversão por que você pode perder valores fazendo casting.

        System.out.println(y);
    }
}
