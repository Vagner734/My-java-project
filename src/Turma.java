import java.util.ArrayList;
import java.util.List;

// Classe Turma
public class Turma {
    private String identificacao;
    private Curso curso;
    private int semestre;
    private Professor professor;
    private List<Estudante> estudantes;

    // Construtor padrão
    public Turma() {
        this.estudantes = new ArrayList<>();
    }

    // Construtor com identificação
    public Turma(String identificacao) {
        this.identificacao = identificacao;
        this.estudantes = new ArrayList<>();
    }

    // Getters e Setters
    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
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
        estudantes.add(estudante);
    }

    public void printTurmaDetails() {
        System.out.println("Turma: " + identificacao + " - Curso: " + (curso != null ? curso.getNome() : "Não definido") + " - Semestre: " + semestre);
        if (professor != null) {
            professor.printData();
        }
        for (Estudante estudante : estudantes) {
            estudante.printData();
        }
    }
}
