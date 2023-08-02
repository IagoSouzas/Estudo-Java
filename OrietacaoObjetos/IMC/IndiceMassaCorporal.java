package org.example.EstudoSobreJava.OrietacaoObjetos.IMC;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;


    boolean estarComObesidade(){
        return resultado >=30;
    }

    boolean estaAbaixoPesoIdeal(){
        return resultado <=18;
    }


}
