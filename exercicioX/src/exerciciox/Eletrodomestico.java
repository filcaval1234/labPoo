/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciox;

/**
 *
 * @author ifpb
 */
public class Eletrodomestico {
    private boolean ligado;
    private char eficienciaEnergetica;

    public Eletrodomestico(boolean ligado, char eficienciaEnergetica) {
        this.ligado = ligado;
        this.eficienciaEnergetica = eficienciaEnergetica;
    }
    /**
     * 
     * @param lig_desl ligado == true desligado == false
     */
    public void ligarDesligar(boolean lig_desl){
        this.ligado = lig_desl;
    }
    /**
     * 
     * @param e eficiencia energetica
     */
    public void setEficienciaEnergetica(char e){
        eficienciaEnergetica = e;
    }
    public boolean getLigado(){
        return ligado;
    }
    public char getEficienciaEnergetica(){
        return eficienciaEnergetica;
    }
    public String toString(){
        String eletro ="ligado: "+ligado+"\n";
        eletro += "classificação energetica: "+eficienciaEnergetica+"\n";
        return eletro;
    }
}
