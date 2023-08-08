package CriandoArraysDeObjeto;

public class Principal2 {
    public static void main(String[] args) {
        Turma turmaA = new Turma();
        turmaA.identificacao = "Maternal A";
        turmaA.nomeProfessora = "Tia Rosana";

        Aluno aluno = new Aluno();
        aluno.nome="Douglas";
        aluno.idade=15;

        Aluno aluno12 = new Aluno();
        aluno12.nome="João";
        aluno12.idade=13;

        turmaA.adicionarAluno(aluno);
        turmaA.adicionarAluno(aluno12);

        turmaA.imprimirListaDeAlunos();

    }

}
