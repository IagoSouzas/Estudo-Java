import com.algaworks.fiscal.GestorFiscal;
import com.algaworks.fiscal.NotaFiscalProduto;
import com.algaworks.fiscal.NotaFiscalServico;

public class Main {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();

        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da Roda", 300,true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

    }
}