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
public class Data {
    int dia;
    int mes;
    int ano;
    
    Data(int dia, int mes, int ano){
        if(verificaData(dia, mes, ano) == true){
    }
    
    private boolean verificaData(int d, int m, int a){
        boolean estado = false;
        if(d>=1 && d<=31 && m>=1 && m<=12 && a>=0){
            estado = true;
        }
    return estado;
    }
    
}
