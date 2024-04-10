package desafio4;

public class DadosBancarios {
    
    private String nomeTitular;
    private String senha;
    private int numeroConta;
    private double saldo;

    // Nome titular
    public static String getNomeTitular(DadosBancarios usuario){
        return usuario.nomeTitular;
    }
    
    public static void setNomeTitular(DadosBancarios usuario, String nomeTitular) {
        usuario.nomeTitular = nomeTitular;
    }

    // Numero da conta
    public static int getNumeroConta(DadosBancarios usuario) {
        return usuario.numeroConta;
    }

    public static void setNumeroConta(DadosBancarios usuario, int numeroConta) {
        usuario.numeroConta = numeroConta;
    }

    // Saldo
    public static double getSaldo(DadosBancarios usuario) {
        return usuario.saldo;
    }

    public static void setSaldo(DadosBancarios usuario, double saldo) {
        usuario.saldo = saldo;
    }

    // Senha da conta
    public static String getSenha(DadosBancarios usuario) {
        return usuario.senha;
    }

    public static void setSenha(DadosBancarios usuario, String senha) {
        usuario.senha = senha;
    }

    public DadosBancarios(){}

    public DadosBancarios(int numeroConta, String nomeTitular, double saldo, String senha){
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.senha = senha;
    }

    
    public String toString(){
        return "Conta(Número da conta: " + numeroConta + " || Nome titular: " + nomeTitular + " || Saldo: " + saldo + ")";
    } 

}
