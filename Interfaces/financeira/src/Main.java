import com.algaworks.financeira.modelo.Fazenda;
import com.algaworks.financeira.modelo.Funcionario;
import com.algaworks.financeira.modelo.Industria;
import com.algaworks.financeira.modelo.ParceiroFinanceiro;
import com.algaworks.financeira.servico.ServicoFinanciamento;

public class Main {
    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000000,10);
        var industria = new Industria("Alimentos da Vovó", 3_000000);
        var parceiro = new ParceiroFinanceiro( "Capital ABC", 2_000000,10);
        var funcionario = new Funcionario("iago",10_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario,40_000);




    }
}