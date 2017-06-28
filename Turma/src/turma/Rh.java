/**
 * a classe Rh encapsula os campos necessarios para a modelagem de
 * um setor de Recursos Humanos de uma escola de ensino fundamental 
 */
package turma;

/**
 *
 * @author fc.corporation
 */
public class Rh {
    private static Professor[] professores;
    private float dinheiroEmCaixa;
    /**
     * o construtor da classe Rh recebe um argumento e utiliza de um metodo
     * estatico que retorna a lista de professores
     * @param dinheiro dinheiro que a instituição passa ao setor de Rh
     */
    Rh(float dinheiro){
        professores = Turma.getProfessores();
        dinheiroEmCaixa = dinheiro;
    }
    /**
     * o construtor da classe que nao recebe argumentos inicializando 
     * apenas o campo professores
     */
    Rh(){
        professores = Turma.getProfessores();
    }
    /**
     * o metodo realizarPagamento é um procedimento e não recebe argumentos
     * realizando o pagamento de todos os professores, caso haja dinheiro em caixa
     */
    public void realizarPagamento(){
        for(Professor prof: professores){
            if(prof.getSalarioBase() < dinheiroEmCaixa){
                System.out.println("Salario pago à "+prof.getNome());
                dinheiroEmCaixa -= prof.getSalarioBase();
            }
            else{
                System.out.println("Nao foi possivel realizar o pagamento de "+ prof.getNome());
            }
        }
    }
    /**
     * o metodo realizarPagamentoUnitario recebe um argumento que é o nome
     * do professor daí então o procura na lista de professores 
     * quando encontrado e contiver dinheiro em caixa suficiente para paga-lo
     * será feiro o pagamento
     * @param nomeDoProfessor nome do professor hà ser pago o salario
     */
    public void realizarPagamentoUnitario(String nomeDoProfessor){
        for(Professor prof: professores){
            if(prof.getNome().equals(nomeDoProfessor) && prof.getSalarioBase() < dinheiroEmCaixa){
                System.out.println("Salario pago a "+prof.getNome());
                dinheiroEmCaixa -= prof.getSalarioBase();
            }
        }
    }
}
