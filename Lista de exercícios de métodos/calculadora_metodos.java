
/**
 * 
 * @author (Piedro Rockembach Nunes) 
 * @version (18/03/2024)
 */
import java.util.Scanner;

public class CalculadoraMetodos
{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double valor1, valor2;
        int operacao;
        
        System.out.println("\fInforme o primeiro valor");
        valor1 = teclado.nextDouble();
        System.out.println("Informe o segundo valor");
        valor2 = teclado.nextDouble();
        System.out.println("O que gostaria de fazer com estes valores?");
        System.out.println("1- Somar");
        System.out.println("2- Subtrair");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        operacao = teclado.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("A subtração entre " + valor1 + " e " + valor2 + " é " + Soma(valor1, valor2)  );
                break;
            case 2:
                System.out.println("A subtração entre " + valor1 + " e " + valor2 + " é " + Subtracao(valor1, valor2)  );
                break;
            case 3:
                System.out.println("A multiplicação entre " + valor1 + " e " + valor2 + " é " + Multiplicacao(valor1, valor2)  );
                break;
            case 4:
                System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é " + Divisao(valor1, valor2)  );
                break;
            default:
                System.out.println("Valor inválido");
                break;
                
        }              
    }
    public static double Soma(double valor1, double valor2) {
        return valor1 + valor2;
    }
    public static double Multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }
    public static double Divisao(double valor1, double valor2) {
        return valor1 / valor2;
    }
    public static double Subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }
}
