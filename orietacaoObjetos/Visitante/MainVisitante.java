package org.example.EstudoSobreJava.OrietacaoObjetos.Visitante;

public class MainVisitante {

    public static void main(String[] args) {

        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        if (novoVisitante.possuiAcessoRestritoPorIdade()){
            System.out.println("Acesso não permitido para menores de "+ Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO+" " +
                    "anos.");
        } else {
            System.out.println("Acesso liberado.");
        }

    }

}
