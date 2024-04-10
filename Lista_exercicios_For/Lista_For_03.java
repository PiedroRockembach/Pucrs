
/**
 * Escreva uma descrição da classe Lista_For_03 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Lista_For_03
{
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\f Escolha um número para contarmos até ele: ");
        int num = in.nextInt();
        for (int i = 0; i < num; i += 1) {
            System.out.println(i);
        }
        
    }
}
