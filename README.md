## Funcionalidades do sistema

| Funcionalidade | Descrição |
| --- | --- |
| Cadastro de livros | Adiciona objetos `Livro` ao acervo da biblioteca |
| Cadastro de usuários | Registra objetos `Usuario` na biblioteca |
| Empréstimo de livro | Verifica a disponibilidade e reduz a quantidade disponível |
| Devolução de livro | Registra a data de devolução e incrementa o estoque disponível |
| Listagem de livros | Exibe no console os dados dos livros cadastrados |
| Consulta de empréstimos | Exibe no console os empréstimos registrados |

## Classes do projeto

| Classe | Responsabilidade |
| --- | --- |
| `Livro` | Representa os dados de um livro e controla sua disponibilidade |
| `Usuario` | Representa o usuário da biblioteca, com nome, CPF, matrícula e e-mail |
| `Emprestimo` | Relaciona um livro a um usuário e armazena as datas do empréstimo e da devolução |
| `Biblioteca` | Centraliza as listas de livros, usuários e empréstimos, além das operações do sistema |
| `Main` | Demonstra o fluxo de cadastro, empréstimo, devolução e consulta |

## Modelagem do sistema

```txt
Biblioteca
 ├── possui vários Livros
 ├── possui vários Usuários
 └── possui vários Empréstimos

Empréstimo
 ├── possui 1 Livro
 └── possui 1 Usuário
```

## Conceitos aplicados

```txt
1. Classes e objetos       - representação de elementos do domínio
2. Encapsulamento          - atributos privados com getters e setters
3. Construtores            - inicialização dos objetos
4. Métodos                 - ações como emprestar, devolver e exibir dados
5. Associação entre classes - empréstimo vinculado a livro e usuário
6. ArrayList               - armazenamento de livros, usuários e empréstimos
7. Estruturas condicionais - validação da disponibilidade do livro
8. Saída no console        - apresentação de mensagens e dados do sistema
9. Maven                   - estruturação e compilação do projeto Java
```

## Tecnologias

- **Java 25** — linguagem principal do projeto
- **Maven** — ferramenta de gerenciamento e compilação

Aplicação de console, executada pela classe `Main`.

## Estrutura do projeto

```txt
exercicioPOO-Biblioteca/
├── src/
│   └── main/
│       └── java/
│           ├── Biblioteca.java
│           ├── Emprestimo.java
│           ├── Livro.java
│           ├── Main.java
│           ├── Usuario.java
│           └── modelagem.txt
├── pom.xml
└── README.md
```

## Como usar

### Pré-requisitos

- Java JDK 25 instalado
- Maven instalado
- IntelliJ IDEA, Eclipse, VS Code ou outro editor de sua preferência

### Execução

```bash
# Clone o repositório
git clone https://github.com/jeffsilva03/exercicioPOO-Biblioteca.git

# Acesse a pasta do projeto
cd exercicioPOO-Biblioteca

# Compile o projeto
mvn compile

# Execute a classe principal
java -cp target/classes Main
```

## Exemplo de fluxo

```txt
1. Um livro é cadastrado na biblioteca.
2. Um usuário é cadastrado na biblioteca.
3. Um empréstimo é criado para o livro e o usuário.
4. O sistema verifica a disponibilidade do livro e registra o empréstimo.
5. A devolução é registrada e a quantidade disponível é atualizada.
6. Os livros e empréstimos são exibidos no console.
```

## Limitações conhecidas

| Limitação | Descrição |
| --- | --- |
| Sem interface gráfica | A interação ocorre apenas pela saída do console |
| Sem entrada interativa | Os dados de exemplo são criados diretamente na classe `Main` |
| Sem persistência | As informações são mantidas somente enquanto o programa está em execução |
| Sem validação completa | Não há validações para dados como CPF, e-mail, ISBN ou datas |
| Escopo educacional | Projeto focado na prática de conceitos iniciais de POO |

> Como evolução, o projeto pode receber um menu interativo com `Scanner`, tratamento de erros, persistência de dados e funcionalidades de busca ou remoção de registros.

---

<div align="center">

Desenvolvido como exercício de estudos em Java e Programação Orientada a Objetos.

</div>
