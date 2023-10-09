package com.algaworks.pagamentos;

public class Transferencia implements MetodoPagamento{
    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiário não possui conta bancária.");
        }
        System.out.println("DEBUG: Efetuando transferência para "+beneficiario.getNome()+
                " no valor de " + documento.getValorTotal() +" para conta bancária: "
                + beneficiario.getContaBancaria());
    }
}
