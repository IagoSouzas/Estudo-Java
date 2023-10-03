package com.algaworks.fiscal;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... nostasFiscais){
        for (NotaFiscal notaFiscal : nostasFiscais){
            notaFiscal.emitir();
            System.out.println("------------");
        }
    }

}
