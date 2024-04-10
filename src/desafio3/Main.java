package desafio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        // Menu principal
        int opcoes1 = 0;
        
        // Contagem de aumento do salário
        int contAtualizacao1 = 0; 
        int contAtualizacao2 = 0; 

        // Dados dos funcionários
        String nome1, nome2;
        double salario1, salarioLiquido1, salarioLiquido2, salario2, salarioAtualizado, taxa1, taxa2;

        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao gerenciador dos funcionários");

        // Funcionário 1
        JOptionPane.showMessageDialog(null, "Clique em 'ok' para adcionar os dados do funcionário 1");

        nome1 = JOptionPane.showInputDialog(null, "Digite o nome do funcionário 1: ");
        salario1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário bruto do funcionário 1: "));
        taxa1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa do funcionário 1: "));

        Funcionario funcionario1 = new Funcionario(nome1, salario1, taxa1); // Criando objeto 

        // Funcionário 2
        JOptionPane.showMessageDialog(null, "Clique em 'ok' para adcionar os dados do funcionário 2");

        nome2 = JOptionPane.showInputDialog(null, "Digite o nome do funcionário 2: ");
        salario2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário bruto do funcionário 2: "));
        taxa2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a taxa do funcionário 2: "));
        
        Funcionario funcionario2 = new Funcionario(nome2, salario2, taxa2); // Criando objeto

        // Exibir detalhes dos funcionários
        JOptionPane.showMessageDialog(null, "Detalhes dos funcionários: \n  \n" + funcionario1 + "\n  \n" + funcionario2);

        // Salário líquido
        salarioLiquido1 = Servico.salarioLiquido(Funcionario.getSalario(funcionario1), Funcionario.getTaxa(funcionario1));
        Funcionario.setSalario(funcionario1, salarioLiquido1);

        salarioLiquido2 = Servico.salarioLiquido(Funcionario.getSalario(funcionario2), Funcionario.getTaxa(funcionario2));
        Funcionario.setSalario(funcionario2, salarioLiquido2);

        while(opcoes1 != 3){

            // Menu
            int opcoes2 = 0;
            int opcoes3 = 0;

            // Menu de gerenciamento dos dados
            String[] fcn = {nome1, nome2, "Geral", "Sair"}; 
            String[] dados_fcn = {"Aumentar salário", "Salário líquido", "Dados do funcionário", "Menu"};


            opcoes1 = JOptionPane.showOptionDialog(null, "Dados dos funcionários: ", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, fcn, fcn[0]); // Escolha dos funcionários

            switch (opcoes1 + 1) {
                case 1:
                    while(opcoes2 != 3){
                        opcoes2 = JOptionPane.showOptionDialog(null, "Dados dos funcionários: ", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dados_fcn, dados_fcn[0]); // Escolha dos funcionários
                        switch (opcoes2 + 1) {
                            case 1:
                                if(contAtualizacao1 == 0){
                                    salarioAtualizado = Servico.aumentarSalario(Funcionario.getSalario(funcionario1), Funcionario.getTaxa(funcionario1));
                                    Funcionario.setSalario(funcionario1, salarioAtualizado);

                                    JOptionPane.showMessageDialog(null, "Salário de " + nome1 + " foi atualizado!");
                                    contAtualizacao1++;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "O salário já foi atualizado!");
                                }
                                break;
                        
                            case 2:
                                JOptionPane.showMessageDialog(null, "Salário líquido de " + nome1 + " é " + Funcionario.getSalario(funcionario1));
                                break;
                            
                            case 3:
                                JOptionPane.showMessageDialog(null, funcionario1);
                                break;

                            case 4:
                                break;
                        }
                    }
                    break;
                
                case 2:
                    while(opcoes3 != 3){
                        opcoes3 = JOptionPane.showOptionDialog(null, "Dados dos funcionários: ", "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dados_fcn, dados_fcn[0]); // Escolha dos funcionários
                        switch (opcoes3 + 1) {
                            case 1:
                                if(contAtualizacao2 == 0){
                                    salarioAtualizado = Servico.aumentarSalario(Funcionario.getSalario(funcionario2), Funcionario.getTaxa(funcionario2));
                                    Funcionario.setSalario(funcionario2, salarioAtualizado);

                                    JOptionPane.showMessageDialog(null, "Salário de " + nome2 + " foi atualizado!");
                                    contAtualizacao2++;
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "O salário já foi atualizado!");
                                }
                                break;
                        
                            case 2:
                                JOptionPane.showMessageDialog(null, "Salário líquido de " + nome2 + " é " + Funcionario.getSalario(funcionario2));
                                break;
                            
                            case 3:
                                JOptionPane.showMessageDialog(null, funcionario2);
                                break;

                            case 4:
                                break;
                        }
                    }
                    break;
    
                case 3:
                    JOptionPane.showMessageDialog(null, "Detalhes dos funcionários: \n  \n" + funcionario1 + "\n  \n" + funcionario2);
                    break;
                
                case 4:
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Saindo do programa...");
        
    }
}
