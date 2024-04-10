package desafio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        String[] op = {"Adcionar", "Visualizar", "Remover", "Sair"}; // Opções de serviços
        int opcoes = 0; // Escolha de serviço

        @SuppressWarnings("unused")
        ServicoTarefa servico = new ServicoTarefa(); // Criando umm objeto servico

        JOptionPane.showMessageDialog(null, "Seja bem-vindo ao seu gerenciador de tarefas!");

        while(opcoes != 3){
            opcoes = JOptionPane.showOptionDialog(null, "Qual opção deseja escolher:", "MINHAS TAREFAS", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
            ServicoTarefa.menu(opcoes + 1);
        }

        JOptionPane.showMessageDialog(null, "Saindo do gerenciador de tarefas...");
    }
}
