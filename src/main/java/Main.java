public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "ISBN122323", 1899, 1 );
        biblioteca.cadastrarLivro(livro1);

        Usuario user1 = new Usuario("Jeff", "123.212.422-21", "001", "jeff@gmail.com");
        biblioteca.cadastrarUsuario(user1);

        Emprestimo emprestimo1 = new Emprestimo("28/08/2026", "", livro1, user1);
        biblioteca.realizarEmprestimo(emprestimo1);

        biblioteca.listarLivros();

        biblioteca.registrarDevolucao(emprestimo1, "31/08/2026");
        biblioteca.listarLivros();
        biblioteca.consultarEmprestimos();
    }
}