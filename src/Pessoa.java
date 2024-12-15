// Interface para exibir dados
interface Printable {
    void printData();
}
// Classe abstrata Pessoa
abstract class Pessoa implements Printable {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
