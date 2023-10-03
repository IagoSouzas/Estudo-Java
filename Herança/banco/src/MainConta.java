import com.java.main.banco.Conta;
import com.java.main.banco.Titular;

public class MainConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("Iago","12341312300"));
        conta1.setAgencia(5050);
        conta1.setNumero(44444);

        conta1.imprimirDemostrativo();

        System.out.println(conta1);

    }
}