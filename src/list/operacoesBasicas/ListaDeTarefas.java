package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    //atributo
    private final List<Tarefa> tarefaList;

    public ListaDeTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricaoRemover){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList ){
            if(t.getDescricao().equalsIgnoreCase(descricaoRemover)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }

    public void obterDescricoestarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        System.out.println("O numero de tarefas é " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");
        listaDeTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O numero de tarefas é " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.removerTarefa("Tarefa 2");
        System.out.println("O numero de tarefas é " + listaDeTarefas.obterNumeroTotalTarefas());

        listaDeTarefas.obterDescricoestarefas();
        
    }
}
