package org.example.EstudoSobreJava.OrietacaoObjetos.IMC;

public class CalculadoraImc {

    IndiceMassaCorporal calcularIMC(double peso, double altura){

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;

    }




}
