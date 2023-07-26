package org.example.EstudoSobreJava.EstruturaControlesOperadores;

public class CalculadoraImpostos {

    public static void main (String args[]){

        char tipoNotaFiscal = 'P';
        double totalFaturado = 1200.30;

        /*double valorImposto;F

        if (tipoNotaFiscal == 'P'){
            valorImposto = totalFaturado * 0.16;
        } else {
            valorImposto = totalFaturado * 0.35;
        }
*/
        // Aprendendo o uso do ternario "se isso for verdade : ? retorne isso : caso contrario esse"
        double valorImposto = tipoNotaFiscal == 'P' ? totalFaturado * 0.16 : totalFaturado * 0.35;

        System.out.println("Total faturado: R$" + totalFaturado);
        System.out.println("Valor dos impostos: R$" + valorImposto);

    }

}
