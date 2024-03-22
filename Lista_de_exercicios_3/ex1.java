
/**
 * Escreva uma descrição da classe ex1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;

public class ex1
{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\fDigite sua nota: ");
        double nota = teclado.nextDouble();
        if (nota < 0 || nota > 10 ) System.out.println("Valor inválido! ");
        else{
            if(nota >= 9) System.out.println("A");
            else if(nota >= 7) System.out.println("B");
            else if(nota >= 5) System.out.println("C");
            else if(nota >= 3) System.out.println("D");
            else System.out.println("E");
        }
        
        
    }
}
