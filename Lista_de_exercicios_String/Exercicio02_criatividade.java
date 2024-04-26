/*
Exercício 2 - Faça um programa mostrando todos os seus aprendizados com string. Use a criatividade!!!
*/
import java.util.Scanner;
public class Exercicio02_criatividade {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("\fVamos jogar xadrez!
        \nPara jogar digite a casa de origem de sua peça e em seguida a casa de destino!
        \nPor Exemplo:
        \ng1 f3
        ");
        System.out.println("\nPressione Enter para jogar");
        in.nextLine();
        Jogo();
    }

    void Jogo() {
        String um = "RNBQKBNR"
        String dois = "PPPPPPPP"
        String tres = "########"
        String quatro = "########"
        String cinco = "########"
        String seis = "########"
        String sete = "PPPPPPPP"
        String oito = "RNBKQBNR"
        While(true) {
            String lance = lance();
            if(lance.equals("sair")) break;
        }
    }

    String Lance() {
        Scanner in = new Scanner(System.in);
        String novoLance = in.nextLine();
        return novoLance;

    }
}