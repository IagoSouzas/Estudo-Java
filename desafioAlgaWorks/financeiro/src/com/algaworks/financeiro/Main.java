package com.algaworks.financeiro;

public class Main {
    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor("Souzas");
        ContaPagar contaAluguel = new ContaPagar();

        contaAluguel.setDescricao("Aluguel do apartamento");
        contaAluguel.setValor(4500);
        contaAluguel.setDataVencimento("10/07/2022");

        contaAluguel.setFornecedor(imobiliaria);

        imprimirConta(contaAluguel);

        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        // Pagar a mesma conta novamente deve ser impedido
        // contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);

        // Cancelar o pagamento de uma conta pendenter deve ser impedido
        // contaAluguel.cancelarPagamento();

    }
    public static void imprimirConta(ContaPagar conta){
        System.out.println("Fornecedor: " + conta.getFornecedor().getNome());
        System.out.println("Descrição: " + conta.getDescricao());
        System.out.println("Data de Vencimento: " + conta.getDataVencimento());
        System.out.println("Valor: " + conta.getValor());
        System.out.printf("Pago: %s%n \n", conta.isPago() ? "sim" : "não");



    }
}