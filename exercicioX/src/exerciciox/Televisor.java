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
public class Televisor extends Eletrodomestico{
    private int canal;
    private int numeroCanais;
    private int volume;
    private int volumeMaximo;
    
    Televisor(boolean ligado, char eficienciaEnergetica, int canal, int volume, int volumeMaximo, int numeroCanais){
        super(ligado, eficienciaEnergetica);
        this.canal = canal;
        this.volume = volume;
        this.volumeMaximo = volumeMaximo;
        this.numeroCanais = numeroCanais;
    }
    public void canalAcuma(){
        if(canal < numeroCanais){
            this.canal++;  
        }
        else canal = 1;
    }
    public void canalAbaixo(){
        if(canal > 1){
            this.canal--;
        }
        else canal = numeroCanais;
    }
    public String toString(){
        String televisor = super.toString();
        televisor += "Canal: "+canal+"\n";
        televisor += "numero maximo de canis que podem ser sintonizados: "+numeroCanais+"\n";
        televisor += "volume: "+volume+"\n";
        televisor += "volume Maximo: "+volumeMaximo+"\n";
        return televisor;
    }
}
