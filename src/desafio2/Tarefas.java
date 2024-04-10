package desafio2;

import java.util.ArrayList;
import javax.swing.*;

public class Tarefas {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static ArrayList<String> tarefas = new ArrayList(); // Criando uma lista
    private static int i = 0;

    public static void getTarefas(){
        String varAuxiliar = "";
        for(i = 0; i < tarefas.size(); i++){
            varAuxiliar += (i+1) + "- " + tarefas.get(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, "Minha lista de tarefas: \n" + varAuxiliar);
    }

    public static void setTarefas(String tarefa){
        if(tarefas.contains(tarefa)){
            JOptionPane.showMessageDialog(null, "Essa tarefa já foi adcionada na lista!");
        }
        else{
            tarefas.add(tarefa);
        }
    }

    public static void removerTarefa(int tarefa){
        tarefas.remove(tarefa - 1);
    }

    public Tarefas(){}

}
