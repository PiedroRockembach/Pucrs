/**
 * Escreva uma descrição da classe lista_do_while_ex2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class lista_do_while_ex2
{
    public static void main(String args[]) {
        System.out.println("\f");
        int counter = 0;
        int num = 101;
        
        do {
            if(num % 7 == 0) {
                counter += 1;
                System.out.println(counter + "º - " + num);
                
            }    
            num += 1;
            
        } while(counter < 50);
    }
}
