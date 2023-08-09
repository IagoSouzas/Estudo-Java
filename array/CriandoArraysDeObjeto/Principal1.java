package CriandoArraysDeObjeto;

import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {

        //Copiando e expandindo arrays.

       /* 1. int[] numerosJogo1 = {25, 11, 8, 49, 37, 14};

        int[] numerosJogo2 = Arrays.copyOf(numerosJogo1, 6 + 1);

        System.out.println(Arrays.toString(numerosJogo1));
        System.out.println(Arrays.toString(numerosJogo2));*/

        //2. Copiando e removendo elementos do array.


        int[] numerosJogoAtual = {25, 11, 8, 49, 37, 14};
        int[] numerosNovoJogo = new int[numerosJogoAtual.length - 1];

        int indiceEsclusao = 2;

//        [25, 11, 8, 49, 37, 14]
//        [0, 0, 0, 0, 0]

        System.arraycopy(numerosJogoAtual, 0, numerosNovoJogo, 0, 2);

        System.arraycopy(numerosJogoAtual,indiceEsclusao + 1, numerosNovoJogo, indiceEsclusao,
                numerosNovoJogo.length - indiceEsclusao);

        System.out.println(Arrays.toString(numerosJogoAtual));
        System.out.println(Arrays.toString(numerosNovoJogo));
    }

}
