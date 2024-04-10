package desafio2;

import javax.swing.*;

public class ServicoTarefa {

    private static String tarefaAdd;
    private static int tarefaRemove;

    public static void menu(int escolha){

        switch (escolha){
            case 1:
                tarefaAdd = JOptionPane.showInputDialog(null, "Digite a tarefa que deseja adcionar: ");
                Tarefas.setTarefas(tarefaAdd);
                break;
        
            case 2:
                Tarefas.getTarefas();
                break;
            
            case 3:
                tarefaRemove = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da tarefa que deseja remover:  "));
                Tarefas.removerTarefa(tarefaRemove);
                break;
        }
    }

    public ServicoTarefa(){} // Construtor padrão

}
