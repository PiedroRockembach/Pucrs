
/**
 * 2. Faça um programa que leia uma frase e que troque todas as vogais por maiúsculas.
 */
import java.util.Scanner;


public class Exercicio_02 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = in.nextLine();
        
        StringBuilder novaPalavra = new StringBuilder();
        
        for(int i = 0; i < palavra.length(); i += 1) {
            char letra = palavra.charAt(i);
            if(letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u' ) {
                novaPalavra.append(Character.toUpperCase(letra));
            } else {
                novaPalavra.append(letra);
            }
        }
        
        System.out.println(novaPalavra.toString());
    }
}