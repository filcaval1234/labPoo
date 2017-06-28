/**
 * a classe Escola encapsula os campos necessarios para a modelagem 
 * de uma escola de ensino fundamental
 */
package turma;
import java.util.Scanner;
/**
 *
 * @author fc.corporation
 */
public class Escola {
    private Rh rh;
    private Turma[] turmas;
    /**
     * o construtor da classe Escola nao recebe nemhum argumento e inicializa
     * apenas o campo rh
     */
    Escola(){
        rh = new Rh();
    }
    public void setTurmas(int quantidadeDeTurmas){
        int quantProfessores = 2;
        Scanner scanner = new Scanner(System.in);
        turmas = new Turma[quantidadeDeTurmas];
        String codigo, nome, horario;
        int sala;
        char tipo;
        
        Turma.setProfessores(quantProfessores);
        for(int i=0;i < quantidadeDeTurmas;i++){
            System.out.println("Digite o nome da sala");
            nome = scanner.nextLine();
            System.out.println("digite o codigo da sala");
            codigo = scanner.nextLine();
            System.out.println("digite o horario da turma: TARDE ou NOITE");
            horario = scanner.nextLine();
            System.out.println("digite o numero relativo à sala");
            sala = scanner.nextInt();
            scanner.nextLine();
            //System.out.println("Digite o tipo da turma A, B ou C");
            //tipo = scanner.next();
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turma turmaA = new Turma("1234", "1A", 2, "tarde", 'A');
        turmaA.setProfessores(2);
        turmaA.setDisciplinas(2);
        System.out.println(turmaA);
    }    
}