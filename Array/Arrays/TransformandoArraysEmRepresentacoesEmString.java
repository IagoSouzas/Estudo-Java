import java.util.Arrays;

public class TransformandoArraysEmRepresentacoesEmString {

    public static void main(String[] args) {
        int[] notas = new int[]{8,0,4,5,6};

        //Com a classe "Arrays" existe uma camada de formas de exibir na tela, listar e dentre diversas outras coias.

        String notasEmString = Arrays.toString(notas);

        System.out.println(notasEmString);

    }

}
