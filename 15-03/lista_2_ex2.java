/**
 * Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.Faça um programa que lê a idade e classifica de acordo com: crianças até 11 anos;
adolescentes de 12 a 17 anos; adultos de 18 a 59 anos; idoso com 60 anos ou mais.
 */
import java.util.Scanner;
public class lista_2_ex2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();
        // Ta errado, arrumar o switch
        switch (idade) {
            case idade <= 11:
                System.out.println("Você é uma criança!");
                break;
            case idade >= 12 && idade <= 17:
                System.out.println("Você é um adolescente!");
                break;
            case idade >= 18 && idade <= 59:
                System.out.println("Você é um adulto!");
                break;
            case idade > 60:
                System.out.println("Você é um idoso!");
                break;
        }
    }
}
