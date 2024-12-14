import java.util.ArrayList;
import java.util.List;

public class Estudante extends Pessoa {
        private String matricula;
        private Curso curso;
        private List<Double> notas; //Armazena as notas obtidas pelo estudante em diferentes avaliações.
        private List<Double> pesos; //Armazena o peso correspondente a cada nota. Cada peso indica a importância relativa da nota na média final.
        public  List<Double> getPesos() {
            return pesos;
        }

        public void setPesos(List<Double> pesos) {
            this.pesos = pesos;
        }

        private Double notaRecuperacao;
    
        public Estudante(String nome, String cpf, String endereco, String telefone, String matricula, Curso curso) {
            super(nome, cpf, endereco, telefone);
            this.matricula = matricula;
            this.notas = new ArrayList<>();
            this.pesos = new ArrayList<>();
            this.notaRecuperacao = null;
        }
    
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
            return notaRecuperacao; // "Recuperacao"
        }

        public void setNotaRecuperacao(Double notaRecuperacao) {
            this.notaRecuperacao = notaRecuperacao;
        }
    
        @Override
        public void printData() {
            System.out.println("Estudante " + nome + " - Cpf: " + cpf + " - End.: " + endereco +
                    " - Tel.: " + telefone + " - Matrícula: " + matricula);
        }
}
