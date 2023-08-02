package org.example.EstudoSobreJava.FundamentosDoJava;

public class ExemploFloatDouble {

    public static void main (String args[]){
        double peso = 84.9d; //"d" é opcional

        // float taxa = 1_294.93; não compila, pela falta do f
        float taxa = 1_294.93f;

        System.out.println("double, peso: " + peso + "float, taxa: "
                + taxa);
    }

}
