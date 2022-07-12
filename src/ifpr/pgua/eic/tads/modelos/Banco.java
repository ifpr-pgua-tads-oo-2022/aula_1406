package ifpr.pgua.eic.tads.modelos;

import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private String telefone;
    private String cnpj;
    private ArrayList<PessoaFisica> pessoasFisica;
    private ArrayList<PessoaJuridica> pessoasJuridica;  
    private ArrayList<ContaSimples> contasSimples;
    private ArrayList<ContaEspecial> contasEspeciais;
    private ArrayList<ContaPoupanca> contasPoupancas;
    private int qtdePessoas;
    private int qtdeContas;
  

    public Banco(String nome, String telefone, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
        pessoasFisica = new ArrayList<PessoaFisica>();
        pessoasJuridica = new ArrayList<PessoaJuridica>();
        
        qtdePessoas = 0;
        contasSimples = new ArrayList<>();
        contasPoupancas = new ArrayList<>();
        contasEspeciais = new ArrayList<>();
        qtdeContas = 0;

    }


    public PessoaFisica buscarPessoaFisica(String documento){
        for(int i=0;i<pessoasFisica.size();i++){
            if(pessoasFisica.get(i).getCpf().equals(documento)){
                return pessoasFisica.get(i);
            }
        }
        return null;
    }

    public PessoaJuridica buscarPessoaJuridica(String documento){
        for(int i=0;i<pessoasJuridica.size();i++){
            if(pessoasJuridica.get(i).getCnpj().equals(documento)){
                return pessoasJuridica.get(i);
            }
        }
        return null;
    }

    public ContaSimples buscarContaSimples(int numero, int agencia){

        for(ContaSimples conta:contasSimples){
            if(conta.getNumeroDaConta()==numero && conta.getAgencia()==agencia){
                return conta;
            }
        }

        return null;
    }

    public ContaEspecial buscarContaEspecial(int numero, int agencia){

        for(ContaEspecial conta:contasEspeciais){
            if(conta.getNumeroDaConta()==numero && conta.getAgencia()==agencia){
                return conta;
            }
        }

        return null;
    }

    public ContaPoupanca buscarContaPoupanca(int numero, int agencia){

        for(ContaPoupanca conta:contasPoupancas){
            if(conta.getNumeroDaConta()==numero && conta.getAgencia()==agencia){
                return conta;
            }
        }

        return null;
    }


    public boolean cadastrarPessoaFisica(PessoaFisica pessoa){
        if(buscarPessoaFisica(pessoa.getCpf())== null){
            this.pessoasFisica.add(pessoa);
            qtdePessoas += 1;
            return true;
        }
        return false;
    }

    public boolean cadastrarPessoaJuridica(PessoaJuridica pessoa){
        if(buscarPessoaJuridica(pessoa.getCnpj())== null){
            this.pessoasJuridica.add(pessoa);
            qtdePessoas += 1;
            return true;
        }
        return false;
    }



    public ArrayList<PessoaFisica> getPessoasFisica(){
        return pessoasFisica;
    }

    public ArrayList<PessoaJuridica> getPessoasJuridica(){
        return pessoasJuridica;
    }


    public boolean cadastarContaSimples(ContaSimples conta){
        if(buscarContaSimples(conta.getNumeroDaConta(), conta.getAgencia())==null){
            this.contasSimples.add(conta);
            qtdeContas += 1;
            return true;
        }

        return false;
        
    }

    public boolean cadastarContaEspecial(ContaEspecial conta){
        if(buscarContaEspecial(conta.getNumeroDaConta(), conta.getAgencia())==null){
            this.contasEspeciais.add(conta);
            qtdeContas += 1;
            return true;
        }

        return false;
        
    }

    public boolean cadastarContaPoupanca(ContaPoupanca conta){
        if(buscarContaPoupanca(conta.getNumeroDaConta(), conta.getAgencia())==null){
            this.contasPoupancas.add(conta);
            qtdeContas += 1;
            return true;
        }

        return false;
        
    }

    public ArrayList<ContaSimples> getContasSimples(){
        return contasSimples;
    }

    public ArrayList<ContaEspecial> getContasEspeciais(){
        return contasEspeciais;
    }

    public ArrayList<ContaPoupanca> getContasPoupancas(){
        return contasPoupancas;
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
