package desafio1.exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        String[] op = {"Continuar", "Sair"}; // Opções de saída de programa

        ContagemLoop contagem = new ContagemLoop();

        JOptionPane.showMessageDialog(null, "Bem-vindo, para iniciar o programa clique em 'ok'");

        while(true){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para o tamanho da contagem: "));
            ContagemLoop.setContagem(numero);

            JOptionPane.showMessageDialog(null, contagem);
            
            int opcoes_saida = JOptionPane.showOptionDialog(null, "Deseja continuar no programa:", "SAIR PROGRAMA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);

            if (opcoes_saida == 1){
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Saindo do programa...");

    }
}
