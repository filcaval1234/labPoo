package aluno;
import java.lang.String;
public class Aluno {
	
	private String nome;
	private long matricula;
	private String curso;
	private int idade;
	private String cor;
	
	Aluno(){}
	Aluno(String nome, long matricula, String curso, int idade, String cor){
		this.nome = nome;
		this.matricula = 201611250014L;
		this.curso = curso;
		this.idade = idade;
		this.cor = cor;
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