import java.util.ArrayList;
import java.util.List;

// Interface Printable
interface Printable {
    void print();
}

// Classe base Pessoa
abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    // Construtor
    public Pessoa(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}

// Classe Professor
class Professor extends Pessoa implements Printable {
    private int siape;

    public Professor(String nome, String cpf, String endereco, String telefone, int siape) {
        super(nome, cpf, endereco, telefone);
        this.siape = siape;
    }

    // Getters e Setters
    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    @Override
    public void print() {
        System.out.println("Professor " + nome + " - Cpf: " + cpf + " - End.: " + endereco + 
                           " - Tel.: " + telefone + " - SIAPE: " + siape);
    }
}

// Classe Estudante
class Estudante extends Pessoa implements Printable {
    private String matricula;
    private Curso curso;

    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public void print() {
        System.out.println("Estudante " + nome + " - Cpf: " + cpf + " - End.: " + endereco + 
                           " - Tel.: " + telefone + " - Matricula: " + matricula);
    }
}

// Classe Curso
class Curso {
    private String nome;
    private int quantidadeSemestres;

    public Curso(String nome, int quantidadeSemestres) {
        this.nome = nome;
        this.quantidadeSemestres = quantidadeSemestres;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeSemestres() {
        return quantidadeSemestres;
    }

    public void setQuantidadeSemestres(int quantidadeSemestres) {
        this.quantidadeSemestres = quantidadeSemestres;
    }
}

// Classe Turma
class Turma {
    private String id;
    private Curso curso;
    private int semestre;
    private Professor professor;
    private List<Estudante> estudantes;

    // Construtor padrão
    public Turma() {
        this.estudantes = new ArrayList<>();
    }

    // Construtor com ID
    public Turma(String id) {
        this.id = id;
        this.estudantes = new ArrayList<>();
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void addEstudante(Estudante estudante) {
        this.estudantes.add(estudante);
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Criação de Cursos
        Curso curso1 = new Curso("Engenharia", 8);
        Curso curso2 = new Curso("Medicina", 10);

        // Criação de Professores
        Professor professor1 = new Professor("Luis Araujo", "000.000.00.0", "Rua X, Bairro U", "(71) 987662577", 12345);
        Professor professor2 = new Professor("Ana Silva", "111.111.11.1", "Avenida Y, Bairro V", "(71) 988888888", 67890);

        // Criação de Estudantes
        Estudante estudante1 = new Estudante("Carlos Mendes", "222.222.22.2", "Rua Z, Bairro W", "(71) 999999999", "2023001", curso1);
        Estudante estudante2 = new Estudante("Maria Oliveira", "333.333.33.3", "Avenida A, Bairro B", "(71) 977777777", "2023002", curso1);
        Estudante estudante3 = new Estudante("João Pereira", "444.444.44.4", "Rua C, Bairro D", "(71) 966666666", "2023003", curso2);
        Estudante estudante4 = new Estudante("Patricia Lima", "555.555.55.5", "Avenida E, Bairro F", "(71) 955555555", "2023004", curso2);
        Estudante estudante5 = new Estudante("Fernanda Costa", "666.666.66.6", "Rua G, Bairro H", "(71) 944444444", "2023005", curso1);

        // Criação de Turmas
        Turma turma1 = new Turma("Turma A");
        turma1.setCurso(curso1);
        turma1.setSemestre(1);
        turma1.setProfessor(professor1);
        turma1.addEstudante(estudante1);
        turma1.addEstudante(estudante2);

        Turma turma2 = new Turma("Turma B");
        turma2.setCurso(curso2);
        turma2.setSemestre(2);
        turma2.setProfessor(professor2);
        turma2.addEstudante(estudante3);
        turma2.addEstudante(estudante4);
        turma2.addEstudante(estudante5);

        // Exibir informações da Turma 1
        System.out.println("Turma: " + turma1.getId());
        turma1.getProfessor().print();
        for (Estudante e : turma1.getEstudantes()) {
            e.print();
        }

        // Exibir informações da Turma 2
        System.out.println("\nTurma: " + turma2.getId());
        turma2.getProfessor().print();
        for (Estudante e : turma2.getEstudantes()) {
            e.print();
        }
    }
}