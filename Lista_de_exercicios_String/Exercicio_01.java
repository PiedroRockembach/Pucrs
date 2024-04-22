/*
Faça um programa que leia uma frase e informe quantas palavras
fazem parte desta frase   
*/
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int contador = 1;
        System.out.println("\f Digite uma frase");
        
        String frase = in.nextLine();
        
        if(frase.isEmpty()) {
            System.out.println("\fVocê precisa digitar uma frase com pelo menos um caractere");
            return;
        }
        
        for(int i = 0; i < frase.length(); i += 1) {
            if(frase.charAt(i) == ' ') contador += 1;
        }
        
        System.out.print("Esta frase possui " + contador + " palavra");
        if(contador > 1) System.out.print("s");
    }
}