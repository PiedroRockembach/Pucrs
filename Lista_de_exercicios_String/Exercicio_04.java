/*
4. Faça um programa que leia o nome completo de uma pessoa e mostra a rubrica
da pessoa. Esta rubrica deve ser composta pelas iniciais do seu nome(s) e
sobrenome(s)
*/

import java.util.Scanner;
import java.lang.StringBuilder;
public class Exercicio_04 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\fEscreva seu nome :");
        String nome = in.nextLine();
        StringBuilder rubrica = new StringBuilder();
        if(nome.equals(null) || nome.equals("")){
            System.out.println("É preciso digitar um nome válido!");
            return;
        }
        
        rubrica.append(nome.charAt(0));
        
        for(int i = 0; i < nome.length(); i  += 1) {
            if (nome.charAt(i) == ' ') {
                rubrica.append(nome.charAt(i + 1));
            }
        }
        
        System.out.println("Sua rubrica é: " + rubrica.toString());
    }
}