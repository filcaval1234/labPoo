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
public class ContaCorrente extends Conta{
    static private final double TAXABANCARIA = 0.10;

    public ContaCorrente(int numeroDeConta) {
        super(numeroDeConta);
    }
    public void atualiza(double taxa){
        super.atualiza(taxa*2);
    }
    public void deposita(double valorDepositado){
        super.deposita(valorDepositado-TAXABANCARIA);
    }
}
