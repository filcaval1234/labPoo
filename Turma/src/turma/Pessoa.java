/**
 * a classe pessoa encapsula os dados basicos necessarios para modelar uma
 * pessoa que tenha algum vinculo com uma instituição de ensino fundamental
 */
package turma;

/**
 *
 * @author fc.corporation
 */
public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private int matricula;
    
    /**
     * o construtor para a classe Pessoa que recebe todos os argumentos 
     * para inicializar todos os atributos de uma pessoa
     * @param nome o nome da pessoa
     * @param dataDeNascimento data de nascimento da pessoa no formato dd/mm/aaaa
     * @param matricula matricula da pessoa na instituição de ensino fundamental
     */
    Pessoa(String nome, String dataDeNascimento, int matricula){
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.matricula = matricula;
    }
    /**
     * o construtor da classe que nao recebe nemhum argumento
     */
    Pessoa(){}
    
    public String getNome(){
        return nome;
    }
    /**
     * o metodo getMatricula nao recebe nemhum argumento retornando o campo
     * matricula da classe Pessoa
     * @return um inteiro representando uma matricula
     */
    public int getMatricula(){
        return matricula;
    }
    /**
     * o metodo getDataDeNascimento nao recebe nemhum argumento retornando o campo
     * dataDeNascimento da classe Pessoa
     * @return uma String no formato dd/mm/aaaa
     */
    public String getDataDeNascimiento(){
        return dataDeNascimento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDataDeNascimento(String data){
        dataDeNascimento = data;
    }
    public void setMatricula(int mat){
        matricula = mat;
    }
}