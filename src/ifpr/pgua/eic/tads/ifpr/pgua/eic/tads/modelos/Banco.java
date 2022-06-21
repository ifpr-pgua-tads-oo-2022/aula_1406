package ifpr.pgua.eic.tads.modelos;

public class Banco {
    
    private String nome;
    private String telefone;
    private String cnpj;
    private Pessoa[] pessoas;
    private ContaCorrente[] contaCorrentes;
    private int qtdePessoas;
  

    public Banco(String nome, String telefone, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        pessoas = new Pessoa[5];
        qtdePessoas = 0;
        contaCorrentes = new ContaCorrente[5];

    }


    public void cadastrarPessoa(Pessoa pessoa){
        this.pessoas[qtdePessoas] = pessoa;
        qtdePessoas += 1;
    }

    public Pessoa[] getPessoas(){
        return pessoas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



}