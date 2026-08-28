import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca(){
        livros = new ArrayList<>();
        usuarios= new ArrayList<>();
        emprestimos= new ArrayList<>();
    }

    public void cadastrarLivro (Livro livro){
        livros.add(livro);
        System.out.println("Livro Cadastrado");
    }

    public void cadastrarUsuario (Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuário Cadastrado");
    }

    public void realizarEmprestimo(Emprestimo emprestimo){
        if (emprestimo.getLivro().estaDisponivel()){
            emprestimo.getLivro().emprestar();
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado com sucesso");
        } else{
            System.out.println("Empréstimo não realizado");
        }
    }

    public void listarLivros(){
        for (Livro livro : livros){
            // percorre todos os itens da lista livros
            livro.exibirDados();
        }
    }

    public void consultarEmprestimos(){
        for (Emprestimo emprestimo : emprestimos){
            emprestimo.exibirDados();
        }
    }

    public void registrarDevolucao (Emprestimo emprestimo, String dataDevolucao){
        emprestimo.registrarDevolucao(dataDevolucao);
    }

}
