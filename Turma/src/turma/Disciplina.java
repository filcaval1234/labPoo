/**
 * a classe Disciplina encapsula todos os dados necessarios para uma
 * disciplina do ensino fundamental não herdando atributos e metodos de outras
 * classes
 */
package turma;
import java.util.Scanner;
/**
 *
 * @author fc.corporation
 */
public class Disciplina {
    private String nomeDaDisciplina;
    static private Aluno[] listaDeAlunosMatriculados;
    private Notas[] notas;
    private Professor professorDaDisciplina = new Professor();
    /**
     * o contrutor da classe Disciplina recebe todos os argumentos para inicializar
     * os atributos  nomeDaDisciplina e professor
     */
    Disciplina(String nomeDaDisciplina, Professor professor){
        this.nomeDaDisciplina = nomeDaDisciplina;
        professorDaDisciplina.setNome(professor.getNome());
        professorDaDisciplina.setDataDeNascimento(professor.getDataDeNascimento());
        professorDaDisciplina.setMatricula(professor.getMatricula());
        professorDaDisciplina.setGrauDeInstrucao(professor.getGrauDeInstrucao());
        professorDaDisciplina.setSalarioBase(professor.getSalarioBase());
    }
    /**
     * o metodo setListaDeAlunosMatriculados vai "setar" todos os alunos
     * da disciplina e como e um atributo estatico 
     * sera a mesma lista de alunos para todas as disciplinas 
     * recebe  como argumento
     * @param quantidadeAlunos que é a quantidade de alunos 
     */
    static public void setListaDeAlunosMatriculados(int quantidadeAlunos){
        listaDeAlunosMatriculados = new Aluno[quantidadeAlunos];
        String nome,nomeDaMae, dataDeNascimento;
        int matricula;
        float[] nota;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i < listaDeAlunosMatriculados.length;i++){
            System.out.println("digite o nome do aluno");
            nome = scanner.nextLine();
            System.out.println("digite a data de nascimento de "+nome+"no formato dd/mm/aaaa");
            dataDeNascimento = scanner.nextLine();
            System.out.println("digite o nome da mãe de "+nome);
            nomeDaMae = scanner.nextLine();
            System.out.println("digite a matricula de "+nome);
            matricula = scanner.nextInt();
            scanner.nextLine();
            listaDeAlunosMatriculados[i] = new Aluno(nome, nomeDaMae, matricula, dataDeNascimento);
        }
    }
    /**
     * o metodo setNotas inicializara a lista de notas e vai "setar" as notas de
     * todos os aluno
     * @param quantidadeDeNotas quantidade de notas que cada aluno tera na disciplina
     */
    public void setNotas(int quantidadeDeNotas){
        float[] notaTemp = new float[quantidadeDeNotas];
        Scanner scanner = new Scanner(System.in);
        this.notas = new Notas[this.listaDeAlunosMatriculados.length];
        for(int j=0;j < notas.length;j++){
             for(int i=0;i < quantidadeDeNotas;i++){
                System.out.println("digite a "+i+"ª nota do aluno(a)"+this.listaDeAlunosMatriculados[j].getNome());
                notaTemp[i] = scanner.nextFloat();
            }
            notas[j] = new Notas(notaTemp);
         }
    }
    /**
     * o metodo toString nao recebe nemhum argumento retornando um 
     * relatorio da classe disciplina
     * @return uma String com os dados dos campos da classe formatados
     */
    public String toString(){
        String disciplina = "";
        disciplina += "######"+this.nomeDaDisciplina+"######\n";
        disciplina += "Alunos matriculados seguidos por sua respctiva nota\n";
        for(int i=0;i < this.listaDeAlunosMatriculados.length;i++){
            disciplina += this.listaDeAlunosMatriculados[i];
            disciplina += this.notas[i].toString();
        }
        return disciplina;
    }
    /**
     * o metodo getNomeDaDisciplina nao recebe nemhum argumento 
     * e retorna o nome da disciplina
     * @return uma String contendo o nome da disciplina
     */
    public String getNomeDaDisciplina(){
        return this.nomeDaDisciplina;
    }
    /**
     * o metodo getProfessorDaDisciplina não recebe nemhum argumento
     * e retorna o nome do professor da disciplina
     * @return uma String que é o nome do professor
     */
    public String getProfessorDaDisciplina(){
        return professorDaDisciplina.getNome();
    }
}