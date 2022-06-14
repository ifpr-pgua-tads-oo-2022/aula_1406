package ifpr.pgua.eic.tads.modelos;

public class ContaCorrente{

    private int numeroDaConta;
    private int agencia;
    private String documento;
    private String senha;
    private boolean ativa;
    private double saldo;

    public ContaCorrente(int numeroDaConta, int agencia,
                         String documento, String senha,
                         boolean ativa, double saldo){
        
        this.agencia = agencia;
        this.documento = documento;
        this.senha = senha;
        this.ativa = ativa;
        this.saldo = saldo;

    }

    public ContaCorrente(int numeroDaConta, int agencia,
                         String documento, String senha,
                         boolean ativa){
        this(numeroDaConta, agencia, 
             documento, senha, ativa, 0.0);
    }

    //escrita
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    //leitura
    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setDocumento(String val){
        documento = val;
    }

    public String getDocumento(){
        return documento;
    }

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
    
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    
    public double getSaldo(){
        return saldo;
    }
    

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void depositar(){
        saldo = saldo + 100;
    }

    public void sacar(double valor){
        saldo = saldo - valor;
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