import java.util.Objects;

public class Produto {
    //Toda classe em java possui um construtor. O proprio java declara um construtor defult quando n declaramos ele

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    String nome;
    int quantidadeEstoque;

    Produto (String nome){ //isso é o construtor (porém n pode colocar o void) e o construtor tem que ter o nome da classe
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    //sobrecarga de construtores
    Produto(String nome, int estoqueInicial){
        // validação de programa.
        Objects.requireNonNull(nome,"Nome é obrigatório");

        if(estoqueInicial < 0){
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque= estoqueInicial;
    }

    // construtor padrão sem ter que atribuir os metodos
    Produto(){
        this("sem nome"); // dentro do bloco do construtor e na fase de construção você consegue chamar outros construtores
    }

}
