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
public class Conta {
    private double saldo;
    private int numeroDeConta;
    
    Conta(int numeroDeconta){
        this.numeroDeConta = numeroDeconta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void deposita(double valorDepositado){
        saldo += valorDepositado;
    }
    public void sacar(float valorSacadao){
        saldo -= valorSacadao;
    }
    public void atualiza(double taxaDeAtualizacao){
        saldo += saldo*taxaDeAtualizacao;
    }    
}
