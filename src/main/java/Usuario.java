public class Usuario {
    private String nome;
    private String cpf;
    private String matricula;
    private String email;

    public Usuario(
            String nome,
            String cpf,
            String matricula,
            String email
    ){
        this.nome=nome;
        this.cpf=cpf;
        this.matricula=matricula;
        this.email=email;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("CPF: %s%n", cpf);
        System.out.printf("Matrícula: %s%n", matricula);
        System.out.printf("Email: %s%n", email);
    }
}
