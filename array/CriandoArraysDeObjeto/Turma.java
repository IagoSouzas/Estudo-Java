package CriandoArraysDeObjeto;

import java.util.Arrays;

public class Turma {

    String identificacao;
    String nomeProfessora;

    Aluno[] alunos = new Aluno[0];


    //Aqui não é um sistema dinâmico que atualiza o array, ele apenas cópia, apaga e cria um novo com a copia
    void adicionarAluno(Aluno aluno){

        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[alunos.length - 1] = aluno;

    }

    void imprimirListaDeAlunos(){

        for (Aluno aluno : alunos) {
            if (aluno != null){
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("Vago");
            }
        }

    }

}
