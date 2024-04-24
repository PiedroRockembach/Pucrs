
/**
3. Faça um programa que leia um número indeterminado de palavras e informe qual
delas possui o maior número de vogais. A condição de parada é quando for lida
a palavra SAIR.
 */
import java.util.Scanner;
public class Exercicio_03
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int MaiorQuantidadeVogais = -1;
        String palavra = "", maiorPalavra = "";
        while(true) {
            System.out.println("\fDigite uma palavra: ");
            palavra = in.nextLine();
            int quantidadeVogais = 0;
            if(palavra.equalsIgnoreCase("SAIR")) break;
            
            for(int i = 0; i < palavra.length(); i += 1) {
                char letra = palavra.charAt(i);
                if(
                    letra == 'a'||
                    letra == 'e' ||
                    letra == 'i' || 
                    letra == 'o'||
                    letra == 'u'||
                    letra == 'A'||
                    letra == 'E' ||
                    letra == 'I' || 
                    letra == 'O'||
                    letra == 'U'
                    ) {
                        quantidadeVogais += 1;
                    }
                    
                if(quantidadeVogais > MaiorQuantidadeVogais) {
                    MaiorQuantidadeVogais = quantidadeVogais;
                    maiorPalavra = palavra;
                    
                    
                }
            }
            
        }
        
        //fazer vverificação se esta vazio
        System.out.println("A palavra digitada com mais vogais é: " + maiorPalavra + " com " + MaiorQuantidadeVogais + " vogais!");
        
        
    }
}
