import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;
    private List<Double> notas; // Armazena as notas obtidas pelo estudante em diferentes avaliações.
    private List<Double> pesos; // Armazena o peso correspondente a cada nota.
    private Double notaRecuperacao; // Usar Double em vez de Object

    // Construtor
    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso; // Inicializando o curso
        this.notas = new ArrayList<>();
        this.pesos = new ArrayList<>();
        this.notaRecuperacao = null; // Inicializando a nota de recuperação
    }

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public Double getNotaRecuperacao() {
        return notaRecuperacao; // Retorna diretamente a nota de recuperação
    }

    public void setNotaRecuperacao(Double notaRecuperacao) {
        this.notaRecuperacao = notaRecuperacao; // Atribui a nota de recuperação
    }

    public List<Double> getPesos() {
        return pesos;
    }

    public void setPesos(List<Double> pesos) {
        this.pesos = pesos; // Atribui os pesos
    }

    @Override
    public void printData() {
        System.out.println("Estudante " + nome + " - Cpf: " + cpf + " - End.: " + endereco +
                " - Tel.: " + telefone + " - Matrícula: " + matricula);
    }

    public void setNotas(double[] ds) {
        // Armazena as notas na lista
        for (double nota : ds) {
            notas.add(nota);
        }
    }

    public String getNome() {
        return nome; // Retorna o nome do estudante
    }
}
