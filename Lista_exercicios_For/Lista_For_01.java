
/**
 * Escreva uma descrição da classe ex1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.Scanner;
public class Lista_For_01
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\fInforme o numero de alunos na turma: ");
        int numberOfStudants = in.nextInt();
        
        double gradesSum = 0;
        for(int i = 0; i < numberOfStudants; i += 1) {
            System.out.println("Informe a nota de E1 do aluno: ");
            gradesSum += in.nextDouble();
        }
        
        System.out.println("A média das notas é: " + (gradesSum / numberOfStudants));
    }
}
