
/**
 * Escreva uma descrição da classe lista_do_while_ex1 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class lista_do_while_ex1
{
    public static void main(String args[]) {
        int counter = 501;
        int soma = 0;
        do{
            System.out.println(counter);
            soma += counter;
            counter += 2;
            
        }while(counter < 700);
        System.out.println("A soma dos números ímpares entre 500 e 700 é: " + soma);
        
    }
}
