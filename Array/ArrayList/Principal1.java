import java.sql.SQLOutput;
import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {

        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("João");

//        alunos[0]="João";
//        alunos[1]= "Maria";

        for (int i = 0; i < alunos.size(); i++) {

            String aluno = alunos.get(i);
            System.out.println(aluno);
        }

    }

}
