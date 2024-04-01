
/**
 * Escreva uma descrição da classe BancoMetodos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class BancoMetodos
{
    public static double DinheiroNaConta = 1000;
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\fO que gostaria de fazer?");
        System.out.println("1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3- Verificar Limite");

        int operacao = teclado.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("\nQual valor gostaria de depositar?");
                Depositar(teclado.nextDouble());
                break;
            case 2:
                System.out.println("\nQual valor gostaria de sacar?");
                Sacar(teclado.nextDouble());
                break;
            case 3:
                VerificarLimite();
                break;
            default:
                System.out.println("Ação inválida");
                break;
                
        }              
    }
    
    public static void Depositar(double valor) {
        if(valor < 0) {
            System.out.println("valor inválido");
            return;
        }
        DinheiroNaConta += valor;
        System.out.println("\nVocê Depositou " + valor + " reais.");
        System.out.println("\nSeu novo saldo é:  " + DinheiroNaConta + " reais.");
    }
    
    public static void Sacar(double valor ) {
        if(valor > DinheiroNaConta) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        
        DinheiroNaConta -= valor;
        System.out.println("\nVocê sacou " + valor + " reais.");
        System.out.println("\nSeu novo saldo é:  " + DinheiroNaConta + " reais.");
    }
    
    public static void VerificarLimite() {
        System.out.println("\nSeu saldo é:  " + DinheiroNaConta + " reais.");
    }
    
}
