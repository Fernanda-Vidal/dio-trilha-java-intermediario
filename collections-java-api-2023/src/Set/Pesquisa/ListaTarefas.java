package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                tarefaSet.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == true) {
                tarefasConcluidas.add(new Tarefa(t.getDescricao()));
            }
        }
        return tarefasConcluidas;
    }

      public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == false) {
                tarefasPendentes.add(new Tarefa(t.getDescricao()));
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaPendente = t;
                break;
            }
        }

        if (tarefaPendente != null) {
            if (tarefaPendente.isConcluida()) {
                tarefaPendente.setConcluida(false);
            } else {
                System.out.println("Tarefa não encontrada na lista");
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefa(s)");
        listaTarefas.exibirTarefas();
        
        listaTarefas.adicionarTarefa("marcar exames");
        listaTarefas.adicionarTarefa("buscar endócrino");
        listaTarefas.adicionarTarefa("buscar fonoaudiólogo");
        listaTarefas.adicionarTarefa("buscar fonoaudiólogo");
        listaTarefas.adicionarTarefa("fazer comida da semana");
        
        System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefa(s)");
        listaTarefas.exibirTarefas();
        
        listaTarefas.marcarTarefaConcluida("buscar fonoaudiólogo");
        listaTarefas.marcarTarefaConcluida("fazer comida da semana");
        
        System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefa(s)");
        listaTarefas.exibirTarefas();

        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("marcar exames");

        System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefa(s)");
        listaTarefas.exibirTarefas();
        
        listaTarefas.limparListaTarefas();
        System.out.println("Você tem " + listaTarefas.contarTarefas() + " tarefa(s)");
    }
}
