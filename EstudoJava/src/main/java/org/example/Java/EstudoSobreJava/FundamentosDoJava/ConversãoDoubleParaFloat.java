package org.example.EstudoSobreJava.FundamentosDoJava;

public class ConversãoDoubleParaFloat {

    public static void main (String args []){

        double peso1 = 20.5;

        float peso2 = (float) peso1; // casting, porém pode perder dados.


        System.out.println(peso2);

        float taxa1 = 934.5f;

        double taxa2 = taxa1;

        System.out.println(taxa2);


    }
}
