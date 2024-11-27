// Classe Professor
public class Professor extends Pessoa {
    private int siape;

    public Professor(String nome, String cpf, String endereco, String telefone, int siape) {
        super(nome, cpf, endereco, telefone);
        this.siape = siape;
        this.siape = siape;
    }

    public int getSiape() {
        return siape;
    }

    @Override
    public void printData() {
        System.out.println("Professor " + nome + " - Cpf: " + cpf + " - End.: " + endereco +
                " - Tel.: " + telefone + " - SIAPE: " + siape);
    }
}