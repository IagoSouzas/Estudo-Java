package IterandoEmArrays;

public class Principal {

    // Vamos percorrer pelos valores das arrays.

    public static void main(String[] args) {
        int[] notas = new int[]{10,10,10,10,10};

       double media = Calculadora.calcularMedia(notas);

        System.out.println(media);

    }

}
