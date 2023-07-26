package org.example.EstudoSobreJava.OrietacaoObjetos.IMC;

public class MainImc {

    public static void main(String[] args) {

        CalculadoraImc calculadoraImc = new CalculadoraImc();

        double peso = 66;
        double altura = 1.67;

        IndiceMassaCorporal imc = calculadoraImc.calcularIMC(peso, altura);

        if(imc.estarComObesidade()){

            System.out.println("Paciente com altura de "+imc.altura+" e peso "+ imc.peso+" está com " +
                    "obesidade");

        }
        if (imc.estaAbaixoPesoIdeal()){

            System.out.println("Paciente com altura de "+imc.altura+" e peso "+ imc.peso+" está abaixo do " +
                    "peso ideal.");

        }

        System.out.println("IMC: " + imc.resultado);

    }

}
