import java.util.Scanner;

import ifpr.pgua.eic.tads.modelos.Conta;
import ifpr.pgua.eic.tads.modelos.ContaCorrente;
import ifpr.pgua.eic.tads.modelos.ContaEspecial;
import ifpr.pgua.eic.tads.modelos.ContaPoupanca;
import ifpr.pgua.eic.tads.modelos.ContaSimples;

public class AppHeranca {
    
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        ContaSimples contaSimples = new ContaSimples(0, 0, "", true, 0, null, 1);

        contaSimples.setNumeroDaConta(1001);
        contaSimples.depositar(100);

        System.out.println(contaSimples);

        System.out.println("ContaSimples é uma Conta?"+(contaSimples instanceof Conta));
        System.out.println("ContaSimples é uma ContaCorrente?"+(contaSimples instanceof ContaCorrente));
        System.out.println("ContaSimples é um Object?"+(contaSimples instanceof Object));
        ContaEspecial contaEspecial = new ContaEspecial(0, 0, "", true, 0, null, 1,1);

        contaEspecial.depositar(500);
        contaEspecial.setLimite(200);

        if(contaEspecial.sacar(700)){
            System.out.println("Sacou!!");
        }else{
            System.out.println("Deu ruim!!!");
        }
    }
}
