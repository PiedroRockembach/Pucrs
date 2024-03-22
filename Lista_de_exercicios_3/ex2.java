
/**
 * Escreva uma descrição da classe L3_ex2 aqui.
 * 
    Elabore um programa que leia um número inteiro de 4 dígitos (garanta isso). A seguir
    o programa deve determinar se o número lido é capicua. Um número é capicua quando
    lido da esquerda para a direita ou da direita para a esquerda representa sempre o
    mesmo valor, como por exemplo 6446.
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class L3_ex2
{
    public static void main(String args[]) {
            L3_ex2.Capicua();
            
    }
    
    public static void Controller(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nGostaria de tentar novamente? ");
        System.out.println("1 - Sim ");
        System.out.println("2- Não");
        int choise = in.nextInt();
        if(choise == 1) L3_ex2.Capicua();
    }
    
    public static void Capicua() {
        System.out.println("\fDigite um número de 4 dígitos: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num / 1000 < 1 || num / 10000 >= 1) System.out.println("\fO número precisa ter 4 dígitos!");
        else{
            String numToString = Integer.toString(num);
            char first = numToString.charAt(0);
            char second = numToString.charAt(1);
            char third = numToString.charAt(2);
            char fourth = numToString.charAt(3);
            boolean edge = first == fourth;
            boolean center = second == third;
            System.out.println(edge && center ? "!!!!  É UMA CAPICUA  !!!": "!!!  NÃO É UMA CAPICUA  !!!" );  
        }
        L3_ex2.Controller();
            
    }
}


