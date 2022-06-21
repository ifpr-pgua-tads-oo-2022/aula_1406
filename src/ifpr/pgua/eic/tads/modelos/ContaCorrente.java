package ifpr.pgua.eic.tads.modelos;

public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String senha;
    private boolean ativa;
    private double saldo;
    private Pessoa pessoa;

<<<<<<< HEAD
    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa,
                         String documento, String senha,
=======
    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
                         boolean ativa, double saldo){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;
<<<<<<< HEAD
        this.setPessoa(pessoa);

    }

    

    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa, 
                         String documento, String senha,
                         boolean ativa){
        this(numeroDaConta, agencia,pessoa, 
             documento, senha, ativa, 0.0);
=======
        this.pessoa = pessoa;

    }

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa pessoa,String senha,
                         boolean ativa){
        this(numeroDaConta, agencia, pessoa, senha, ativa, 0.0);
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
    }

    public ContaCorrente(int numeroDaConta, int agencia, Pessoa pessoa){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
<<<<<<< HEAD
        this.Pessoa = pessoa;
=======
        this.pessoa = pessoa;
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
        
        //this(numeroDaConta, agencia, "","",false,0.0);
    }

    //escrita
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    //leitura
    public int getNumeroDaConta(){
        return numeroDaConta;
    }
<<<<<<< HEAD
=======


>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    public double getSaldo(){
        return saldo;
    }
    

    public boolean depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
        
    }

    //sobrescrita de método
    public boolean depositar(){
        return depositar(100);
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            return true;
        }else{
            return false;
        }
        
    }


    public String toString(){
        String str = "";

        str = "ContaCorrente[";
        str = str + "Numero da Conta:"+numeroDaConta;
        str = str + ",Agencia: "+agencia;
        str = str + ",Ativa: "+ativa;
        str = str + ",Saldo: "+saldo;
        str = str + ", Pessoa:"+pessoa;
        str = str + "]";

        return str;

    }

}