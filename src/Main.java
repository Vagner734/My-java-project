import java.util.ArrayList;
import java.util.List;

// Classe Coordenador
class Coordenador {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int id;

    public Coordenador(String nome, String cpf, String endereco, String telefone, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = id;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public int getId() { return id; }
}

// Classe Curso
class Curso {
    private String nome;
    private int duracao;
    private Coordenador coordenador;

    public Curso(String nome, int duracao, Coordenador coordenador) {
        this.nome = nome;
        this.duracao = duracao;
        this.coordenador = coordenador;
    }

    // Getters
    public String getNome() { return nome; }
    public int getDuracao() { return duracao; }
    public Coordenador getCoordenador() { return coordenador; }
}

// Classe Professor
class Professor {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int id;

    public Professor(String nome, String cpf, String endereco, String telefone, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = id;
    }

    // Getters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public int getId() { return id; }
}

// Classe Estudante
class Estudante {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String matricula;
    private Curso curso;
    private double[] notas;
    private double notaRecuperacao;

    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getMatricula() { return matricula; }
    public Curso getCurso() { return curso; }
    public double[] getNotas() { return notas; }
    public void setNotas(double[] notas) { this.notas = notas; }
    public double getNotaRecuperacao() { return notaRecuperacao; }
    public void setNotaRecuperacao(double notaRecuperacao) { this.notaRecuperacao = notaRecuperacao; }
}

// Classe Turma
class Turma {
    private String nome;
    private Curso curso;
    private int semestre;
    private Professor professor;
    private List<Estudante> estudantes = new ArrayList<>();

    public Turma(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public int getSemestre() { return semestre; }
    public void setSemestre(int semestre) { this.semestre = semestre; }
    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public void addEstudante(Estudante estudante) {
        estudantes.add(estudante);
    }

    public void printTurmaDetails() {
        System.out.println("Turma: " + nome);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Estudantes: ");
        for (Estudante estudante : estudantes) {
            System.out.println("- " + estudante.getNome());
        }
    }
}

// Classe principal (main)
public class Main {
    public static void main(String[] args) {
        // Criando cursos e coordenadores
        Coordenador coordenador1 = new Coordenador("Dr. Marcos", "777.777.777-77", "Rua A, Bairro X", "(71) 99991111", 10101);
        Curso curso1 = new Curso("Engenharia de Software", 8, coordenador1);

        // Criando professores
        Professor professor1 = new Professor("Luis Araujo", "000.000.000-00", "Rua X, Bairro U", "(71) 987662577", 12345);

        // Criando estudantes
        Estudante estudante1 = new Estudante("Ana", "222.222.222-22", "Rua Z, Bairro W", "(71) 988112233", "2023001", curso1);
        Estudante estudante2 = new Estudante("Bruno", "333.333.333-33", "Rua Z, Bairro W", "(71) 988223344", "2023002", curso1);
        Estudante estudante3 = new Estudante("Carlos", "444.444.444-44", "Rua Z, Bairro W", "(71) 988334455", "2023003", curso1);
        Estudante estudante4 = new Estudante("Daniela", "555.555.555-55", "Rua Z, Bairro W", "(71) 988445566", "2023004", curso1);
        Estudante estudante5 = new Estudante("Eduardo", "666.666.666-66", "Rua Z, Bairro W", "(71) 988556677", "2023005", curso1);

        // Criando turma
        Turma turma1 = new Turma("T1");
        turma1.setCurso(curso1);
        turma1.setSemestre(1);
        turma1.setProfessor(professor1);

        // Adicionando estudantes à turma
        turma1.addEstudante(estudante1);
        turma1.addEstudante(estudante2);
        turma1.addEstudante(estudante3);
        turma1.addEstudante(estudante4);
        turma1.addEstudante(estudante5);

        // Atribuindo notas aos estudantes
        estudante1.setNotas(new double[]{8, 6, 7});
        estudante2.setNotas(new double[]{5, 4, 6});
        estudante3.setNotas(new double[]{3, 2, 1});
        estudante4.setNotas(new double[]{9, 8, 7});
        estudante5.setNotas(new double[]{6, 7, 6});

        // Exibindo informações da turma
        System.out.println("=== Detalhes da Turma 1 ===");
        turma1.printTurmaDetails();

        // Estatísticas
        System.out.println("\n=== Estatísticas da Turma ===");
        gerarEstatisticas(turma1);

        // Atribuindo notas de recuperação
        estudante2.setNotaRecuperacao(6.0); // Estudante 2 vai para recuperação
        logAlteracaoNota(estudante2.getNome());
    }

    public static void gerarEstatisticas(Turma turma) {
        // Implemente o cálculo e exibição das estatísticas aqui
        System.out.println("Estatísticas não implementadas.");
    }

    public static void logAlteracaoNota(String nomeEstudante) {
        // Log para alteração de nota
        System.out.println("Nota de recuperação atribuída ao estudante: " + nomeEstudante);
    }
}