package desafio3;

public class Funcionario {
    
    private String nome;
    private double salarioBruto;
    private double taxa;


    public static double getSalario(Funcionario funcionario){
        return funcionario.salarioBruto;
    }

    public static double getTaxa(Funcionario funcionario){
        return funcionario.taxa;
    }

    public static void setSalario(Funcionario funcionario, double salario){
        funcionario.salarioBruto = salario;
    }

    public Funcionario(){}

    public Funcionario(String nome, double salarioBruto, double taxa){
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String toString(){
        return "Funcionário (Nome: " + nome + " || Salário: " + salarioBruto + " || Taxa: " + taxa + ")";
    }
}
