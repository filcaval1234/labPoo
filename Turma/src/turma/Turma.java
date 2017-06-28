/**
 * a classe turma encapsula os dados necessarios para a modelagem de uma
 * turma do ensino fundamental
 */
package turma;
import java.util.Scanner;
/**
 *
 * @author fc.corporation
 */
public class Turma {
    private String codigo;
    private String nome;
    private int sala;
    private String horario;
    private char tipo;
    static private Professor[] professores;
    private Disciplina[] disciplinas;
    /**
     * o construtor da classe recebe os argumentos necessarios para inicializar
     * os atributos nome, codigo, sala, horario, tipo
     * @param codigo codigo da sala
     * @param nome nome da sala
     * @param sala o numero da sala
     * @param horario horarios da turma
     * @param tipo a turma é A, B ou C
     */
    Turma(String codigo, String nome, int sala, String horario, char tipo){
        this.codigo = codigo;
        this.nome = nome;
        this.sala = sala;
        this.horario = horario;
        this.tipo = tipo;
    }
    /**
     * o metodo setProfessores recebe um argumento 
     * @param quantidadeDeProfessores quantidade de professores da turma
     */
    static public void setProfessores(int quantidadeDeProfessores){
        Scanner scanner = new Scanner(System.in);
        String nome, dataDeNascimento, grauDeInstrucao;
        float salarioBase;
        int matricula;
        
        professores = new Professor[quantidadeDeProfessores];
        for(int i=0;i < quantidadeDeProfessores;i++){
            //recebendo as caracteristicas do professor via entrada padrao
            System.out.println("digite o nome do professor");
            nome = scanner.nextLine();
            System.out.println("digite a data de nascimento do professor "+nome);
            dataDeNascimento = scanner.nextLine();
            System.out.println("digite a matricula do professor "+nome);
            matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("digite o grau de instrução do professor "+nome);
            grauDeInstrucao = scanner.nextLine();
            System.out.println("digite o salario base do "+grauDeInstrucao+nome);
            salarioBase = scanner.nextFloat();
            scanner.nextLine();
            //instaciando um indice da lista de professores
            professores[i] = new Professor(nome, dataDeNascimento, matricula, grauDeInstrucao, salarioBase);           
        }
    }
    /**
     * o metodo getProfessorApartirDoNone recebe um argumento que é uma String
     * a partir dai procura um professor com esse nome 
     * @param nomeDoProfessor String nome do professor
     * @return um professor
     */
    public Professor getProfessorApartirDoNone(String nomeDoProfessor){
        Professor professorTemp = new Professor();
        for(Professor prof: professores){
            if(prof.getNome().equals(nomeDoProfessor)){
                professorTemp =  prof;

            }
        }
        return professorTemp;
    }
    /**
     * o metodo get Professores retorna todos os professores da turma
     * @return uma lista de todos os professores
     */
    static public Professor[] getProfessores(){
        return professores;
    }
    /**
     * o metodo setDisciplinas recebe um argumento e vai "setar" as disciplinas
     * @param quantidadeDeDisciplinas quantidade de disciplinas
     */
    public void setDisciplinas(int quantidadeDeDisciplinas){
        Scanner scanner = new Scanner(System.in);
        String nomeDaDisciplina;
        String nomeDoProfessor;
        int quantidadeDeAlunos;
        disciplinas = new Disciplina[quantidadeDeDisciplinas];
        int quantidadeDeNotas;
        
        for(int i=0;i < quantidadeDeDisciplinas; i++){
            System.out.println("digite o nome da disciplina");
            nomeDaDisciplina = scanner.next();
            scanner.nextLine();
            System.out.println("quem sera o professor da disciplina "+ nomeDaDisciplina);
            nomeDoProfessor = scanner.nextLine();
            disciplinas[i] = new Disciplina(nomeDaDisciplina, this.getProfessorApartirDoNone(nomeDoProfessor));
        }
        System.out.println("digite a quantidade de alunos da turma");
        quantidadeDeAlunos = scanner.nextInt();
        Disciplina.setListaDeAlunosMatriculados(quantidadeDeAlunos);
        for(int i=0;i < disciplinas.length;i++){
            System.out.println("quantas notas terao a disciplina "+disciplinas[i].getNomeDaDisciplina());
            quantidadeDeNotas = scanner.nextInt();
            disciplinas[i].setNotas(quantidadeDeNotas);
        }   
    }
    public String toString(){
        String turma = "";
        for(Disciplina disc: disciplinas){
            turma += disc.getProfessorDaDisciplina();
            turma += disc;
        }
        return turma;
    }
}