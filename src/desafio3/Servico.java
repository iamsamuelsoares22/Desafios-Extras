package desafio3;

public class Servico {

    public static double salarioLiquido(double salarioBruto, double taxa){
        return salarioBruto - ((salarioBruto * taxa)/100);
    }
    
    public static double aumentarSalario(double salarioBruto, double aumento){
        return salarioBruto + ((salarioBruto * aumento)/100);
    }
}
