
/**
 * Escreva uma descrição da classe ex2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */

import java.util.Scanner;
public class ex2
{
    public static void main (String args[]) {
      ex2.Soma();
    
    }
    
    public static  void Soma() {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, soma, loop;
        
        System.out.println("\fDigite o primeiro valor: ");
        valor1 = teclado.nextInt();
        System.out.println("Digite outro valor: ");
        valor2 = teclado.nextInt();
        System.out.println("A soma de " + valor1 + " + " + valor2 + " é " + (valor1 + valor2));
        System.out.println("Para realizar outra soma digite 1");
        loop = teclado.nextInt();
        if(loop == 1) ex2.Soma();
        else System.out.println("Obrigado por usar nosso programa!");
    }
}
