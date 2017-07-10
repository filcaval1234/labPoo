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
public class Quadrado {
    private double lado;
    private double area;
    private double perimetro;

    Quadrado(int lado) {
        this.lado = lado;
        this.calcularArea();
        this.calcularPerimetro();
    }
    public void calcularArea(){
        this.area = lado*lado;
    }
    public void calcularPerimetro(){
        this.perimetro = lado*4;
    }
    public String toString(){
        String quadrado = "lado: "+ lado+"\n";
        quadrado += "área do quadrado: "+area+"\n";
        quadrado += "perimetro do periodo: "+perimetro+"\n";
        return quadrado;
    }
}
