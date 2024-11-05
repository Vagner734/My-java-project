package Atividade0001;

/**
 *
 * @author vagne
 */
// Classe Estudante
class Estudante extends Pessoa {
    private String matricula;
    private Curso curso;

    public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
        super(nome, cpf, endereco, telefone);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public void printData() {
        System.out.println("Estudante " + nome + " - Cpf: " + cpf + " - End.: " + endereco +
                " - Tel.: " + telefone + " - Matrícula: " + matricula);
    }
}
