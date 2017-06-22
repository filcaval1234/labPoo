/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadealuguel;

/**
 *
 * @author ifpb
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float salarioMensal;
    private String cpf;
    private Residencia[] residencias = new Residencia[4];
    
    public Pessoa(){}
    public Pessoa(String nome, int idade, float salarioMensal, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.salarioMensal = salarioMensal;
        this.cpf = cpf;
    }
    public void setResisdencias(Residencia[] residencias){
        this.residencias = residencias;
        for(Residencia x: residencias){
            x.setEstadoDeAluguel(true); 
        }
    }
}
