import java.util.Scanner;

public class lista_2_ex1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();
        if (idade < 18) System.out.println("Você é menor de idade!");
        else {
            System.out.println("Você é maior de idade!");
        }
    }
}