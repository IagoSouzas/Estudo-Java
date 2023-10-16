import com.algaworks.financeira.modelo.ClienteFinanciavel;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.PessoaBonificavel;
import com.algaworks.financeira.servico.ServicoPagamentoBonus;

public class Main2 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("joao", 18_000);
        funcionario.calcularBonus(80);

        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();
        servicoPagamentoBonus.pagar(funcionario, 80);

    }
}
