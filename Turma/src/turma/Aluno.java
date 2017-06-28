/**
 * A classe Aluno encapsula os dados necessarios para um aluno
 * do ensino fundamental, herdando metodos e atributos da classe Pessoa
 */
package turma;

/**
 *
 * @author fc.corporation
 */
public class Aluno  extends Pessoa{
    private String nomeDaMae;
    /**
     * o construtor da classe que recebe argumento para todos os atributos
     * @param nome o nome do aluno
     * @param nomeDaMae o nome da mae do aluno
     * @param matricula matricula do aluno na instituição
     * @param dataDeNascimento data de nascimento do aluno
     */
    Aluno(String nome, String nomeDaMae, int matricula, String dataDeNascimento){
        super(nome,dataDeNascimento,matricula);
        this.nomeDaMae = nomeDaMae;
    }
    /**
     * o metodo getNome retornara o nome do aluno como a classe Aluno 
     * herda propriedades da classe Pessoa
     * @return retorna o nome da pessoa
     */
    public String getNome(){
        return super.getNome();
    }
    /**
     * o metodo toString não recebe nemhum argumento e retorna os valores dos
     * campos da classe
     * @return uma String com os dados dos campos formatados
     */
    public String toString(){
        String aluno = "------------------------------------------\n";
        aluno += "Nome: "+ this.getNome()+"\n";
        aluno += "Nome da Mãe: "+ this.nomeDaMae+"\n";
        aluno += "Matricula: "+super.getMatricula()+"\n";
        aluno += "Data de nascimento: "+ super.getDataDeNascimiento()+"\n";
        return aluno;
    }
}