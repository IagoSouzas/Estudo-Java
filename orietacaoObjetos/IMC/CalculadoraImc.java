package org.example.EstudoSobreJava.OrietacaoObjetos.IMC;

public class CalculadoraImc {

    IndiceMassaCorporal calcularIMC(Paciente paciente){

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;

    }




}
