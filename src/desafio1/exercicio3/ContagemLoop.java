package desafio1.exercicio3;

import java.util.ArrayList;

public class ContagemLoop {

    private static int contador_while;
    private static int contador_dowhile;

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static ArrayList<Integer> contagem_for = new ArrayList(); // Criando uma lista 

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static ArrayList<Integer> contagem_while = new ArrayList(); // Criando uma lista 
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static ArrayList<Integer> contagem_dowhile = new ArrayList(); // Criando uma lista 
    
    public static void setContagem(int numero){

        contador_while = 0; // Limpando o contador
        contador_dowhile = 0; // Limpando o contador

        contagem_for.removeAll(contagem_for); // Limpando toda a lista
        contagem_while.removeAll(contagem_while); // Limpando toda a lista
        contagem_dowhile.removeAll(contagem_dowhile); // Limpando toda a lista

        for (int x = 0; x < numero; x++){
            contagem_for.add(x);
        }

        while (contador_while < numero){
            contagem_while.add(contador_while);
            contador_while ++;
        }

        do { 
            contagem_dowhile.add(contador_dowhile);
            contador_dowhile ++;
        } while (contador_dowhile < numero);
        
    }

    public ContagemLoop(){}

    public String toString(){
        return "Estrutura (For): " + contagem_for + "\n" + "Estrutura (while): " + contagem_while + "\n" + "Estrutura (do while): " + contagem_dowhile;

    }
}
