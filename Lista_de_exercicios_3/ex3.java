
/**
 * 
 * @author (Piedro Rockembach Nunes) 
 * @version (15/03/2024)
 */
import java.util.Scanner;

public class ex3
{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2;
        int operacao;
        
        System.out.println("Informe o primeiro valor");
        valor1 = teclado.nextDouble();
        System.out.println("Informe o segundo valor");
        valor2 = teclado.nextDouble();
        System.out.println("O que gostaria de fazer com estes valores?");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        operacao = teclado.nextInt();
        if(operacao == 1) {
            System.out.println("A soma entre " + valor1 + " e " + valor2 + " é " + valor1 + valor2  );
        } else if(operacao == 2) {
            System.out.println("A subtração entre " + valor1 + " e " + valor2 + " é " + (valor1 - valor2)  );
        } else if(operacao == 3) {
            System.out.println("A multiplicação entre " + valor1 + " e " + valor2 + " é " + valor1 * valor2  );
        } else if(operacao == 4) {
            System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é " + valor1 / valor2  );
        }              
    }
}
