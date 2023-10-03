import com.java.main.banco.*;

public class Principal2 {
    public static void main(String[] args) {
        Titular titular = new Titular("Jõao da silva", "12312312311");
        Conta conta = new ContaSalario(titular, 3333, 1123, 10000);
    }
}
