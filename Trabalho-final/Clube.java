import java.util.Scanner;
public class Clube
{
    public static void main() {
        Menu();
    }
    
    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        CadastroBicicleta cadastroBicicletas = new CadastroBicicleta();
        CadastroMembro cadastroMembros = new CadastroMembro(); 
        boolean fazerLoop = true;
        
        do {
            System.out.println("\f1 - Incluir membro.");
            System.out.println("2 - Mostrar membros.");
            System.out.println("3 - Pesquisar membro pelo nome.");
            System.out.println("4 - Incluir bicicleta.");
            System.out.println("5 - Mostrar bicicletas.");
            System.out.println("6 - Pesquisar bicicleta por modelo.");
            System.out.println("7 - Emprestar bicicleta.");
            System.out.println("8 - Devolver bicicleta.");
            System.out.println("9 - Quantitade total de unidades disponíveis no sistema de empréstimo.");
            System.out.println("10 - Sair do programa.");
            int opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    cadastroMembros.AdicionaMembro();
                    break;
                case 2:
                    cadastroMembros.MostraMembros();
                    break;
                case 3:
                    System.out.println("\fDigite o nome do membro que deseja buscar: ");
                    String nome = teclado.nextLine();
                    cadastroMembros.BuscaMembroPeloNome(nome);
                    teclado.nextLine();
                    break;
                case 4:
                    cadastroBicicletas.AdicionaBicicleta();
                    break;
                case 5:
                    cadastroBicicletas.MostraBicicletas();
                    break;
                case 6:
                    System.out.println("\fDigite o modelo da bicicleta que deseja buscar: ");
                    String modelo = teclado.nextLine();
                    cadastroBicicletas.BuscaBicicletaPeloModelo(modelo);
                    break;
                case 7:
                    
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    fazerLoop = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
                    
            }
            
        } while(fazerLoop);
    }
}
