package desafio1.exercicio2;

import javax.swing.*;

public class DiaSemana {

    private static final String[] DIA_DA_SEMANA = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

    public static void getDia(int dia){
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[0]);
                break;

            case 2:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[1]);
                break;

            case 3:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[2]);
                break;

            case 4:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[3]);
                break;

            case 5:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[4]);
                break;

            case 6:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[5]);
                break;

            case 7:
                JOptionPane.showMessageDialog(null, DIA_DA_SEMANA[6]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número inválido!");
                break;
        }

        
    }

    public DiaSemana(){}
}
