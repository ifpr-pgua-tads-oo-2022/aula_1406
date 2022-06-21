package ifpr.pgua.eic.tads.modelos;

public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String documento;
    private String senha;
    private boolean ativa;
    private double saldo;

<<<<<<< HEAD
<<<<<<< HEAD
    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa,
                         String documento, String senha,
=======
    public ContaCorrente(int numeroDaConta, int agencia,Pessoa pessoa, String senha,
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
=======
    public ContaCorrente(int numeroDaConta, int agencia,
                         String documento, String senha,
>>>>>>> parent of 993c008 (código metade aula)
                         boolean ativa, double saldo){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.documento = documento;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;
<<<<<<< HEAD
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
=======
>>>>>>> parent of 993c008 (código metade aula)

    }

    public ContaCorrente(int numeroDaConta, int agencia,
                         String documento, String senha,
                         boolean ativa){
<<<<<<< HEAD
        this(numeroDaConta, agencia, pessoa, senha, ativa, 0.0);
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
=======
        this(numeroDaConta, agencia, 
             documento, senha, ativa, 0.0);
>>>>>>> parent of 993c008 (código metade aula)
    }

    public ContaCorrente(int numeroDaConta, int agencia){
        
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
<<<<<<< HEAD
<<<<<<< HEAD
        this.Pessoa = pessoa;
=======
        this.pessoa = pessoa;
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
=======
>>>>>>> parent of 993c008 (código metade aula)
        
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

    public void setDocumento(String val){
        documento = val;
    }

    public String getDocumento(){
        return documento;
    }

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
        str = str + ",Documento: "+documento;
        str = str + ",Ativa: "+ativa;
        str = str + ",Saldo: "+saldo;
        str = str + "]";

        return str;

    }

}