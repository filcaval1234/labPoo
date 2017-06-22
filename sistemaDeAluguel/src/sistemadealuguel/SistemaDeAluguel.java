/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadealuguel;
import java.util.Scanner;
/**
 *
 * @author ifpb
 */
public class SistemaDeAluguel {
    private Pessoa[] pessoas;
    private Residencia[] residencias;
    
    public SistemaDeAluguel(){}
    
    public void quantidadeDeResidencias(int quantidade){
        this.residencias = new Residencia[quantidade];
        for(int i=0;i<quantidade;i++){
            residencias[i] = new Residencia();
            residencias[i].setEstadoDeAluguel(false);
            residencias[i].setNumeroDaCasa(i);
        }
    }
    public void setPessoas(Pessoa pessoa, int index){
        this.pessoas[index] = pessoa;
    }
    public void alugaResidencias(Pessoa pessoa, Residencia[] residencia, int index){
        this.pessoas[index].setResisdencias(residencia);
    }
    public  void quantidadeDePessoa(int quantidade){
        this.pessoas = new Pessoa[quantidade];
        for(int i=0;i<quantidade;i++){
            pessoas[i] = new Pessoa();
        }
    }
    public Residencia getResidenciaApartirDoNumero(int numeroDaCasa){
        for(Residencia casa:this.residencias){
            if(casa.getNumeroDasa() == numeroDaCasa){
                return casa;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //variaveis utilizadas na execução do programa
        int quantPessoas, quantResidencias;
        Scanner scanner = new Scanner(System.in);
        SistemaDeAluguel sistemaDeAluguel = new SistemaDeAluguel();
        
        //abaixo toda parte procedural da execução do programa
        System.out.println("quantas pessoas serão cadastradas? ");
        quantPessoas = scanner.nextInt();
        System.out.println("quantas residencias serao cadastradas? ");
        quantResidencias = scanner.nextInt();
        sistemaDeAluguel.quantidadeDePessoa(quantPessoas);
        sistemaDeAluguel.quantidadeDeResidencias(quantResidencias);
        
        for(int i=0;i < quantPessoas;i++){
            String nome,cpf,posicao;
            int idade, numeroDaCasa;
            float salarioMensal,metragem;
            Pessoa pessoa = new Pessoa();
            Residencia residencia = new Residencia();
            
            System.out.println("Digite o nome do cliente :");
            nome = scanner.next();
            System.err.println("Digite o cpf de "+nome+" no formato 123.456.567-89");
            cpf = scanner.next();
            System.out.println("Digite a idade de "+nome);
            idade = scanner.nextInt();
            System.out.println("Digite o salario Mensal de "+nome);
            salarioMensal = scanner.nextFloat();
            
            System.err.println("Abaixo segue toda a parte do procedimento de aluguel de residencias para "+nome);
            for(int j=0; j<quantResidencias;j++){
                System.out.println("Digite o numero da casa à ser alugada");
                numeroDaCasa = scanner.nextInt();
            }
            
            
            
        }
    }
}
