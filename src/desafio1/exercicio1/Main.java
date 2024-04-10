package desafio1.exercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        String[] op = {"Continuar", "Sair"}; // Opções de saída de programa


        JOptionPane.showMessageDialog(null, "Bem-vindo, para iniciar o programa clique em 'ok'");
        
        while(true){
            double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número: "));
            VerificNumero.getVerific(numero); // Retorna se o número é positivo, neutro ou negativo

            int opcoes = JOptionPane.showOptionDialog(null, "Deseja continuar no programa:", "SAIR PROGRAMA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op, op[0]);

            if (opcoes == 1){
                break;
            }
        }
    }
}
