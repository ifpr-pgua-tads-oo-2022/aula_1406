package ifpr.pgua.eic.tads;
import java.util.Scanner;

import ifpr.pgua.eic.tads.modelos.ContaCorrente;
import ifpr.pgua.eic.tads.modelos.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente conta;

        System.out.println("Construindo...");
        conta = new ContaCorrente(200989,567,"123-008","****",false,1000);
        System.out.println("Construiu...");         
        System.out.println(conta.toString());

        ContaCorrente conta2 = new ContaCorrente(200178, 567, "345-000", "*********", true);
        System.out.println("Conta 2");
        System.out.println(conta2);

        double valor = 100;
        conta.depositar();
        
        System.out.println("Saldo após deposito R$:"+conta.getSaldo());
        
        conta.sacar(500);
        System.out.println("Saldo após saque R$:"+conta.getSaldo());
        
        System.out.println("Isso é um teste...");

    }
}
