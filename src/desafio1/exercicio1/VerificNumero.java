package desafio1.exercicio1;

import javax.swing.*;

public class VerificNumero {

    public static void getVerific(double numero){
        if(numero < 0){
            JOptionPane.showMessageDialog(null, "Seu número é negativo");
        }
        else if(numero > 0){
            JOptionPane.showMessageDialog(null, "Seu número é positivo");
        }
        else{
            JOptionPane.showMessageDialog(null, "Seu número é neutro");
        }
    }

    public VerificNumero(){}
}
