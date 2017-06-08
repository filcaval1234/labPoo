package aluno;

public class Disciplina {
	private String nomeDisciplina;
	private float[] nota = new float[3];
	private float media = this.calculoMedia(this.nota);
	
	Disciplina(){}
	Disciplina(String nomeDisciplina, float[] nota){
		this.nomeDisciplina = nomeDisciplina;
		this.nota = nota;
	}
	public void setnomeDisciplina(String nomeDisciplina){
		this.nomeDisciplina = nomeDisciplina;
	}
	public void setnota(float nota1, float nota2, float nota3){
		this.nota[0] = nota1;
		this.nota[1] = nota2;
		this.nota[2] = nota3;
	}
	public String getnomeDisciplina(){
		return this.nomeDisciplina;
	}
	public float[] getnota(){
		return this.nota;
	}

	private float calculoMedia(float[] nota){
		for (int i =0; i<nota.length;i++)
			this.media += nota[i];
		this.media = media /nota.length;
		return this.media;
	}
	public float getmedia(){
		return this.media;
	}
}
