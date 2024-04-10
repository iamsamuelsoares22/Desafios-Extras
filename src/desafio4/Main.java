package desafio4;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        // Dados bancários
        String nomeTitular = "";
        double saldo = 0;

        // Serviços contas
        String senha_Login;
        String senha = "xxxxxxx";
        double deposito, saque;
        

        // Criando limites para o gerador de números aleátorios
        int min = 1000;
        int max = 9999;
        int numeroConta = 00000;

        // Listas de escolhas
        int menu = 0;
        int perfil = 0;

        String[] login_Strings = {"Login", "Cadastrar", "Sair"};
        String[] depositoInicial_Strings = {"Depositar", "Continuar"};
        String[] menu_Strings = {"Depositar", "Sacar", "Minha conta", "Sair"};
        String[] perfil_Strings = {"Meus dados", "Alterar nome titular", "Altera senha", "Menu"};

        // Instâncias
        @SuppressWarnings("unused")
        Random rand = new Random();
        DadosBancarios usuario = new DadosBancarios(numeroConta, nomeTitular, saldo, senha);

        while(true){

            int login = JOptionPane.showOptionDialog(null, "Bem-vindo ao seu banco digital", "LOGIN", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, login_Strings, login_Strings[0]); // Escolha dos funcionários
            
            // login/Cadastro
            if(login == 0){ // Login 

                while(true){
                    int numeroConta_Login = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da sua conta: "));

                    if(numeroConta_Login == numeroConta){
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Número da conta inválida, tente novamente!");
                    }
                    
                }

                while(true){
                    senha_Login = JOptionPane.showInputDialog(null, "Digite sua senha: ");
                    
                    if(senha_Login.equals(senha)){
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente!");
                    }
                }

                menu = 0;
            }
            else if(login == 1){ // Cadastro
                numeroConta = (int)(Math.random() * (max - min + 1) + min); // Gerando o número da conta do banco    

                // Criando usuario
                nomeTitular = JOptionPane.showInputDialog(null, "Digite seu nome: ");
                senha = JOptionPane.showInputDialog(null, "Digite uma senha: ");

                JOptionPane.showMessageDialog(null, "Seu número da conta é " + numeroConta + ", você pode acessar ele nas configurações do seu perfil" );

                // Deposito inicial
                int depositoInicial = JOptionPane.showOptionDialog(null, "Você deseja depositar um saldo inicial?", "DEPOSITO INICIAL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, depositoInicial_Strings, depositoInicial_Strings[0]); // Escolha dos funcionários

                if(depositoInicial == 0){
                    deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de depósito: "));
                    ServicoConta.deposito(usuario, deposito);
                }

                // Dados para login
                DadosBancarios.setNumeroConta(usuario, numeroConta); 
                DadosBancarios.setNomeTitular(usuario, nomeTitular);
                DadosBancarios.setSenha(usuario, senha);

                JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                JOptionPane.showMessageDialog(null, "Dados da conta: \n \n" + usuario);
            }
            else{
                break;
            }

            // Menu
            while(menu != 3){
                menu = JOptionPane.showOptionDialog(null, "Olá, " + nomeTitular + "\n Saldo: " + DadosBancarios.getSaldo(usuario), "MENU", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu_Strings, menu_Strings[0]); // Escolha dos funcionários

                switch (menu + 1) {
                    case 1:
                        deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor de depósito: "));
                        ServicoConta.deposito(usuario, deposito);
                        break;
                
                    case 2:
                        saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do saque: "));
                        ServicoConta.saque(usuario, saque);
                        break;
                    
                    case 3:
                        perfil = 0; 
                        while(perfil != 3){
                            perfil = JOptionPane.showOptionDialog(null, "Editar perfil: ", "MEU PERFIL", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, perfil_Strings, perfil_Strings[0]); // Escolha dos funcionários
                        
                            switch (perfil + 1) {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Dados da conta: \n \n" + usuario);
                                    break;
                            
                                case 2:
                                    nomeTitular = JOptionPane.showInputDialog(null, "Digite seu nome: ");
                                    DadosBancarios.setNomeTitular(usuario, nomeTitular);
                                    break;
                                
                                case 3:
                                    senha = JOptionPane.showInputDialog(null, "Digite uma senha: ");
                                    DadosBancarios.setSenha(usuario, senha);
                                    break;
                                
                                case 4:
                                    break;
                            }
                        }
                        
                        break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Saindo do programa...");
    }
}
