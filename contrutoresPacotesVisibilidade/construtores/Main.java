public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("provolone");
        Produto produto2 = new Produto("queijo", 5);

        System.out.println(produto1.nome);

        System.out.println(produto2.nome);
        System.out.println(produto2.quantidadeEstoque);

    }
}
