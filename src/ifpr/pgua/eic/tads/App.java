package ifpr.pgua.eic.tads;
import java.util.Scanner;

import ifpr.pgua.eic.tads.modelos.ContaCorrente;
import ifpr.pgua.eic.tads.modelos.Pessoa;


public class App {

    public static String menuConta(){
        String str="";
        
        str+="1 - Criar conta\n";
        str+="2 - Depositar\n";
        str+="3 - Sacar\n";
        str+="4 - Ver dados\n";
        str+="0 - Sair\n";

        return str;
    }



    public static void main(String[] args) throws Exception {
        ContaCorrente conta=null;

        Scanner scan = new Scanner(System.in);
        int opcao;

        int numeroDaConta; 
        int agencia;
        String documento; 
        String senha;
        boolean ativa; 
        double saldo,valor;

        do{
            System.out.println(menuConta());
            opcao = scan.nextInt();
            scan.nextLine();

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> parent of 993c008 (código metade aula)
            switch(opcao){
                case 1:
                    System.out.println("Digite o número da conta:");
                    numeroDaConta = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite a agência:");
                    agencia = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Digite o documento:");
                    documento = scan.nextLine();
                    System.out.println("Digite a senha:");
                    senha = scan.nextLine();
                    System.out.println("Está ativa (1-sim;0-não)");
                    opcao = scan.nextInt();
                    ativa = opcao==1;
                    System.out.println("Quer informa o saldo? (1-sim;0-não)");
                    opcao = scan.nextInt();
                    if(opcao == 1){
                        System.out.println("Digite o saldo:");
                        saldo = scan.nextDouble();
<<<<<<< HEAD
                        conta = new ContaCorrente(numeroDaConta, agencia,pessoa,documento,senha,ativa,saldo);

                    }else{
                        conta = new ContaCorrente(numeroDaConta, agencia,pessoa,documento,senha,ativa);
    
                    }
                    System.out.println("Conta criada!!");
                break;
                case 2:
                    System.out.println("Depositar!");
                    if(conta != null){
                        System.out.println("Digite um valor:");
                        valor = scan.nextDouble();
                        if(conta.depositar(valor)){
                            System.out.println("Realizado!");
                        }else{
                            System.out.println("Não Realizado! Valor insuficiente!");
=======
                        pessoa = new Pessoa(nome, cpf, idade, salario);
                        banco.cadastrarPessoa(pessoa);
                        System.out.println("Cadastrada!");
                        break;
                    case 2:
                        System.out.println("Detalhes da pessoa");
                        if (pessoa != null) {
                            System.out.println(pessoa);
                        } else {
                            System.out.println("Pessoa não criada!");
>>>>>>> c77657cc23e8fa41f6872f082bfe3204c40be225
                        }
                        break;
                }
            } else if(opcao == 1){
=======
                        conta = new ContaCorrente(numeroDaConta, agencia,documento,senha,ativa,saldo);
>>>>>>> parent of 993c008 (código metade aula)

                    }else{
                        conta = new ContaCorrente(numeroDaConta, agencia,documento,senha,ativa);
    
                    }
                    System.out.println("Conta criada!!");
                break;
                case 2:
                    System.out.println("Depositar!");
                    if(conta != null){
                        System.out.println("Digite um valor:");
                        valor = scan.nextDouble();
                        if(conta.depositar(valor)){
                            System.out.println("Realizado!");
                        }else{
                            System.out.println("Não Realizado! Valor insuficiente!");
                        }
                        
                    }else{
                        System.out.println("Não permitido! Crie uma conta!");
                    }
                break;

                case 3:
                    System.out.println("Sacar!");
                    if(conta != null){
                        System.out.println("Digite um valor:");
                        valor = scan.nextDouble();
                        if(conta.sacar(valor)){
                            System.out.println("Realizado!");
                        }else{
                            System.out.println("Não realizado! Valor inválido ou insuficiente!");
                        }
                        
                    }else{
                        System.out.println("Não permitido! Crie uma conta!");
                    }
                break;
                case 4:
                    System.out.println("Extrato!");
                    if(conta != null){
                        System.out.println(conta);
                    }else{
                        System.out.println("Não existe conta criada!");
                    }
                    
                break;
            }


        }while(opcao != 0);



    }
}
