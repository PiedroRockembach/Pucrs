/*
Exercício 2 - Faça um programa mostrando todos os seus aprendizados com string. Use a criatividade!!!
*/
import java.util.Scanner;
public class Exercicio02_criatividade {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fVamos jogar xadrez!\nPara jogar digite a casa de origem de sua peça e em seguida a casa de destino!\nPor Exemplo:\ng1 f3");
        System.out.println("\nPressione Enter para jogar");
        in.nextLine();
        Jogo();
    }

    public static void Jogo() {
        String um = "RNBQKBNR";
        String dois = "PPPPPPPP";
        String tres = "########";
        String quatro = "########";
        String cinco = "########";
        String seis = "########";
        String sete = "PPPPPPPP";
        String oito = "RNBKQBNR";
        
        while(true){
            System.out.print("\f");
            System.out.println(oito);
            System.out.println(sete);
            System.out.println(seis);
            System.out.println(cinco);
            System.out.println(quatro);
            System.out.println(tres);
            System.out.println(dois);
            System.out.println(um);
            String lance = Lance();
            if(lance.equals("sair")) break;
            if(!ValidaLance(lance)){
                System.out.println("Este lance não é válido");
                continue;
            }
            char primeiraLetra = lance.charAt(0);
            char primeiroNumero = lance.charAt(0);
            char segundaLetra = lance.charAt(0);
            char segundoNumero = lance.charAt(0);
            
        };
    }

    public static String Lance() {
        Scanner in = new Scanner(System.in);
        String novoLance = in.nextLine();      
        return novoLance;

    }
    
    public static boolean ValidaLance(String lance) {
        if(lance == null || lance == "") return false;
        int contador = 0;
        int letras = 0;
        for(int i = 0; i < lance.length(); i += 1) {
            if(lance.charAt(i) == ' ') contador += 1;
            else {
                letras += 1;
            };
        }
        if(contador != 1 && letras != 4) return false;
        
        return true;
        
    }
}