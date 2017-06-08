package aluno;
import java.util.*;
public class Sala {
	static int[] listaIdade = new int[5];
	static Aluno[] listaAluno = new Aluno[5];
	static int[] listaCor = new int[5];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maiorIdade=0;
		int index=0;
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i < 2; i++){
			listaAluno[i]= new Aluno();
			
			System.out.println("digite a idade");
			listaAluno[i].setidade(input.nextInt());
			listaIdade[i] = listaAluno[i].getidade();
			
			if(listaIdade[i]> maiorIdade){
				maiorIdade = listaIdade[i];
				index = i;
			}
				
			System.out.println("digite o nome");
			listaAluno[i].setnome(input.next());
			
			System.out.println("digite a cor");
			listaAluno[i].setcor(input.next());
		}
		System.out.println(listaAluno[index].getnome()+" : "+listaAluno[index].getidade());
		
		for(int j=0;j<2;j++){
				System.gc();
			if(listaAluno[j].getcor().equals("rosa") || listaAluno[j].getcor().equals("ROSA")){
				System.out.println(listaAluno[j].getnome());
			}
		}
	}
	
	public void colocarnotaDisciplina(String disciplina, float[] nota, int quantdisciplina, Aluno[] aluno){
		String[] listaDisciplina;
		for(int i=0; i < quantdisciplina; i++){
			listaDisciplina = aluno[i].getnomeDisciplina();
			for(int j =0; j < listaDisciplina.length;j++){
				if (listaDisciplina[j].equals(disciplina));{
					aluno[i].setnotaAluno(nota, j);
				}
			}
		}
	}
}
			

