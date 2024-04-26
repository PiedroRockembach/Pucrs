/*
5. Faça um programa em java que lê uma palavra e imprime a mesma na ordem
inversa.
 */

import java.util.Scanner;
import java.lang.StringBuilder;
public class Exercicio_05
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\fEscreva uma palavra");
        String palavra = in.nextLine();
        StringBuilder palavraInvertida = new StringBuilder();
        for(int i = palavra.length() - 1; i >= 0; i -= 1) {
            palavraInvertida.append(palavra.charAt(i));
        }
        
        System.out.println(palavraInvertida);
    }       
}
