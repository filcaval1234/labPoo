/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author ifpb
 */
public class Teste {
    
    public static void main(String[] args) {
        int valorDepositado = 1000;
        double taxa = 0.10;
        Conta conta = new Conta(212);
        ContaCorrente contaCorrente = new ContaCorrente(343);
        ContaPoupanca contaPoupanca= new ContaPoupanca(7879);
        
        conta.deposita(valorDepositado);
        contaCorrente.deposita(valorDepositado);
        contaPoupanca.deposita(valorDepositado);
        
        System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
        
        conta.atualiza(taxa);
        contaCorrente.atualiza(taxa);
        contaPoupanca.atualiza(taxa);
        conta.atualiza(taxa);
        
        System.out.println(conta.getSaldo());
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
    }
    
}
