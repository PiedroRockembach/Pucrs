
/**
6) Escreva um programa que leia 30 valores reais, todos pertencentes ao intervalo [0;10], calcule
a média aritmética desses valores. Os valores devem ser inseridos em um vetor.
 */
import java.util.Scanner;
public class ex06
{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double valor, soma = 0;
        double vetor[] = new double[30];
        for (int i = 0; i < 30; i += 1) {
            while(true) {
                System.out.println("\fValor " + (i + 1) + ":");
                System.out.println("Digite um valor real no intervalo de [0, 10]");
                valor = teclado.nextDouble();
                if(valor > 0 && valor < 10) break;
            }
            vetor[i] = valor;
            soma += valor;
        }
        System.out.println("A média dos valores digitados é: " + (soma / 30));
    }
}

