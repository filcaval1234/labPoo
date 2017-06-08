package aluno;
import java.lang.String;
public class Aluno {
	
	private String nome;
	private long matricula;
	private String curso;
	private int idade;
	private String cor;
	private Disciplina[] disciplina;
	
	Aluno(){}
	Aluno(String nome, long matricula, String curso, int idade, String cor){
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.idade = idade;
		this.cor = cor;
	}
	public Disciplina[] quantDisciplina(int quantidade){
		Disciplina[] disciplina = new Disciplina[quantidade];
		return disciplina;
	}
	
	public void setdisciplina(int quantidade, String[] listaNomeDisciplina){
		this.disciplina = this.quantDisciplina(quantidade);
		for(int i= 0; i < quantidade;i++){
			disciplina[i] = new Disciplina();
			disciplina[i].setnomeDisciplina(listaNomeDisciplina[i]);
		}
	}
	public String[] getnomeDisciplina(){
		String[] nomeDisciplina = new String[this.disciplina.length];
		for (int i=0; i < this.disciplina.length; i++){
			nomeDisciplina[i] = this.disciplina[i].getnomeDisciplina();
		}
		return nomeDisciplina;
	}
	
	public void setnotaAluno(float[] nota, int indice){
		this.disciplina[indice].setnota(nota[0], nota[1], nota[2]);
	}
		
	public String getnome(){
		return this.nome;
	}
	public void setnome(String nome){
		this.nome = nome;
	}
	public long getmatricula(){
		return this.matricula;
	}
	public void setmatricula(int matricula){
		this.matricula = matricula;
	}
	public String getcurso(){
		return this.curso;
	}
	public void setcurso(String curso){
		this.curso = curso;
	}
	public int getidade(){
		return this.idade;
	}
	public void setidade(int idade){
		this.idade = idade;
	}
	
	public String getcor(){
		return this.cor;
	}
	public void setcor(String cor){
		this.cor = cor;
	}
}