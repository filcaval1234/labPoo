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
public class Residencia {
    private float metragem;
    private boolean esquina;
    private String posicao;
    private boolean estadoDeAluguel;
    private int numeroDaCasa;
    
    public Residencia(){}
    public Residencia(float metragem, boolean esquina, String posicao, int numeroDaCasa){
        this.metragem = metragem;
        this.esquina = esquina;
        this.posicao = posicao;
        this.numeroDaCasa = numeroDaCasa;
    }
    public void setEstadoDeAluguel(boolean estadoAluguel){
        this.estadoDeAluguel = estadoAluguel;
    }
    public void setNumeroDaCasa(int numero){
        this.numeroDaCasa = numero;
    }
    public int getNumeroDasa(){
        return this.numeroDaCasa;
    }
    
}
