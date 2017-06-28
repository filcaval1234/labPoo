/**
 * a classe professor encapsula os dados necessarios para modelar um professor
 * de ensino fundamental herdando metodos e atributos da classe Pessoa
 */
package turma;

/**
 *
 * @author fc.corporation
 */
public class Professor extends Pessoa{
    private String grauDeInstrucao;
    private float salarioBase;
    /**
     * o construtor da classe Professor recebe todos os argumento necessarios 
     * inicializar os dados de um Professor
     * @param nome nome do Professor
     * @param dataDeNascimento data de nascimento do professor
     * @param matricula matricula do Professor
     * @param grauDeInstrucao grau de instrução do Profesor
     * @param salarioBase salario base do Professor
     */
    Professor(String nome, String dataDeNascimento, int matricula, String grauDeInstrucao, float salarioBase){
        super(nome, dataDeNascimento, matricula);
        this.grauDeInstrucao = grauDeInstrucao;
        this.salarioBase = salarioBase;
    }
    /**
     * o construtor da classe Professor que nao recebe nemhum argumento
     */
    Professor(){
        super();
    }
    public void setNome(String nome){
        super.setNome(nome);
    }
    public void setDataDeNascimento(String data){
        super.setDataDeNascimento(data);
    }
    public void setMatricula(int mat){
        super.setMatricula(mat);
    }
    public void setGrauDeInstrucao(String grau){
        grauDeInstrucao = grau;
    }
    public void setSalarioBase(float salario){
        salarioBase = salario;
    }
    public String getNome(){
        return super.getNome();
    }
    public String getDataDeNascimento(){
        return super.getDataDeNascimiento();
    }
    public int getMatricula(){
        return super.getMatricula();
    }
    public String getGrauDeInstrucao(){
        return grauDeInstrucao;
    }
    public float getSalarioBase(){
        return salarioBase;
    }
}