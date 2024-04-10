package desafio1.exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] op = {"Continuar", "Sair"}; // Opções de escolha de continuação
        boolean sair = false;

        JOptionPane.showMessageDialog(null, "Bem-vindo, para iniciar o programa clique em 'ok'");

        while(sair == false){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número correspondente ao dia da semana(1-7): "));
            DiaSemana.getDia(numero); // Retorna o dia da semana

            int opcoes = JOptionPane.showOptionDialog(null, "Deseja continuar no programa:", "SAIR PROGRAMA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);
            
            if (opcoes == 1){
                sair = true;
            }
        } 

        JOptionPane.showMessageDialog(null, "Saindo do programa...");

    }
}
