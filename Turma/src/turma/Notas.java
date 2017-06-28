/**
 * a classe Notas encapsula os dados necessarios para a modelagem de notas
 * de um aluno de ensino fundamental
 */
package turma;

/**
 *
 * @author fc.corporation
 */
public class Notas {
    private float[] listaDeNotas;
    private float media;
    /**
     * o construtor da classe Notas recebe todos os argumentos para inicializar
     * apenas um dos atributos da classe que é notas
     * @param notas lista de notas
     */
    Notas(float[] notas){
        this.listaDeNotas = new float[notas.length];
        for(int i=0;i < notas.length;i++){
            listaDeNotas[i] = notas[i];
        }
        this.media = this.calculoDeMedia();
    }
    /**
     * o construtor que não recebe argumentos
     */
    Notas(){
        this.listaDeNotas = new float[5];
    }
    /**
     * o metodo privado calculoDeMedia recebe um argumento que é uma lista de
     * notas daí retornando o resultado para o atributo media
     * @return a media baseado na lista de notas
     */
    private float calculoDeMedia(){
        float med = 0;
        for(int i=0;i < listaDeNotas.length;i++){
            med += listaDeNotas[i];
        }
        return med/listaDeNotas.length;
    }
    /**
     * metodo getMedia retorna o atributo media da classe notas
     * @return o atributo da classe
     */
    public float getMedia(){
        return this.media;
    } 
    /**
     * o metodo setListaDeNotas recebe um argumentos 
     * @param nota lista de notas do aluno
     */
    public void setListaDeNotas(float[] nota){
        listaDeNotas = new float[nota.length];
        for(int i=0;i < nota.length;i++){
            listaDeNotas[i] = nota[i];
        }
    }
    /**
     * o metodo toString retornara as notas do aluno e sua media
     * @return uma String com os dados dos campos formatados 
     */
    public String toString(){
        String nota = "";
        for(int i=0;i < this.listaDeNotas.length;i++){
            nota += (i+1)+"ª Nota "+this.listaDeNotas[i]+"\n";
        }
        nota += "Média: "+this.media+"\n";
        return nota;
    }
}