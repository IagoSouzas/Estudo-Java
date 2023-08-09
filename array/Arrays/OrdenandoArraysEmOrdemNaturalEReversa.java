import java.util.Arrays;
import java.util.Comparator;

public class OrdenandoArraysEmOrdemNaturalEReversa {


    public static void main(String[] args) {
        Integer[] notas = {8,0,4,5,6};

        //Para que compare os dados da arrays de uma forma reversa, precisa utilizar o Integer(classe do int)
        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));

    }

}
