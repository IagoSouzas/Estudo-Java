import static com.algaworks.matematica.CalculadoraArea.*;

public class Main {
    public static void main(String[] args) {

        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.println("PI: " + PI);
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do circulo: " + areaCirculo);

    }
}
