package org.example.EstudoSobreJava.FundamentosDoJava;

public class ConversãoIntParaLong {

    public static void main (String args []){
        int y = 1023;

        long x = y;

        // quando vai fazer uma conversão de int para long não precisa informar o casting, pq n corre risco de perder
        //informações

        System.out.println(y);
    }
}
