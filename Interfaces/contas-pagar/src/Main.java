import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.servico.ServicoContaPagar;
import com.algaworks.pagamentos.Beneficiario;
import com.algaworks.pagamentos.DocumentoPagavel;

public class Main {
    public static void main(String[] args) {
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario funcionario = new Beneficiario("jão da silva", "11996353020", "123584");
        DocumentoPagavel documento = new Holerite(funcionario, 100,168);

        servicoContaPagar.pagar(documento);

    }
}
