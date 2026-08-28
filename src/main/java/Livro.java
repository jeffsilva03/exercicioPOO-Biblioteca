public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;
    private int quantidadeDisponivel;


    public Livro(
            String titulo,
            String autor,
            String isbn,
            int anoPublicacao,
            int quantidadeDisponivel
    ) {

        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao (int anoPublicacao){
        this.anoPublicacao=anoPublicacao;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel){
        this.quantidadeDisponivel=quantidadeDisponivel;
    }

    public void emprestar(){
        if (quantidadeDisponivel>0){
            quantidadeDisponivel-=1;
            System.out.println("Empréstimo Realizado");
        } else {
            System.out.println("Livro Indisponível");
        }
    }

    public void devolver(){
        quantidadeDisponivel+= 1;
        System.out.println("Livro devolvido");
    }

    public boolean estaDisponivel(){
        return quantidadeDisponivel>0;
        //mesmo que if (quantidadeDisponivel>0){ return true;}
    }

    public void exibirDados(){
        System.out.printf("Título do Livro: %s%n", titulo);
        System.out.printf("Autor: %s%n", autor);
        System.out.printf("ISBN: %s%n", isbn);
        System.out.printf("Ano de Publicação: %d%n", autor);
        System.out.printf("Quantidade Disponível: %d%n", quantidadeDisponivel);
    }
}

