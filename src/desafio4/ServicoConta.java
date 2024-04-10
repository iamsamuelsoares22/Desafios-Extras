package desafio4;

public class ServicoConta {

    private static double saldoAtualizado;
    private static double taxa = 5;
    
    public static void deposito(DadosBancarios usuario, double deposito){
        saldoAtualizado = DadosBancarios.getSaldo(usuario) + deposito;
        DadosBancarios.setSaldo(usuario, saldoAtualizado);
    }

    public static void saque(DadosBancarios usuario, double saque){
        saldoAtualizado = (DadosBancarios.getSaldo(usuario) - saque) - taxa ; 
        DadosBancarios.setSaldo(usuario, saldoAtualizado);
    }
}
