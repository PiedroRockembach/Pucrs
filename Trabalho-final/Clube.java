import java.util.Scanner;
public class Clube
{
    public static void main() {
        System.out.println("\f");
        Menu();
    }
    
    public static void Menu() {
        
        
        CadastroBicicleta cadastroBicicletas = new CadastroBicicleta();
        CadastroMembro cadastroMembros = new CadastroMembro(); 
        boolean fazerLoop = true;
        String modelo;
        do {
            
            Scanner teclado = new Scanner(System.in);
            System.out.println("\n1 - Incluir membro.");
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
                    System.out.println("\fDigite seu nome: ");
                    teclado.nextLine();
                    String membroNome = teclado.nextLine();                    
                    System.out.println("Digite seu cpf sem espaços ou traços: ");

                    int membroMatricula = teclado.nextInt();
                    if(cadastroMembros.BuscaMembroPelaMatricula(membroMatricula) != null) {
                        System.out.println("\fEste cpf já está cadastrado em outro membro. \n");
                        break;
                    }
                    System.out.println("Digite o nome da sua cidade de origem: ");
                    teclado.nextLine();
                    String membroCidade = teclado.nextLine();
                    Membro newMembro = new Membro(membroMatricula, membroNome, membroCidade);
                    cadastroMembros.AdicionaMembro(newMembro);
                    System.out.println("\fMembro: " + membroNome + " cadastrado com sucesso.\n" );
                    break;
                case 2:
                    cadastroMembros.MostraMembros();
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("\fDigite o nome do membro que deseja buscar: ");
                    String nome = teclado.nextLine();
                    Membro membroPeloNome = cadastroMembros.BuscaMembroPeloNome(nome);
                    if(membroPeloNome == null) {
                        System.out.println("Membro não encontrado!");
                        break;
                    }
                    System.out.println(membroPeloNome.toString());
                    
                    break;
                case 4:
                    cadastroBicicletas.AdicionaBicicleta();
                    System.out.println("\fbicicleta cadastrada com sucesso.\n" );
                    break;
                case 5:
                    cadastroBicicletas.MostraBicicletas();
                    break;
                case 6:
                    System.out.println("\fDigite o modelo da bicicleta que deseja buscar: ");
                    modelo = teclado.nextLine();
                    cadastroBicicletas.BuscaBicicletaPeloModelo(modelo);
                    break;
                case 7:
                        if(cadastroBicicletas.TotalUnidades() <= 0) {
                            System.out.println("Não há bicicletas disponíveis no momento!");
                            break;
                        } 
                        System.out.println("Digite o modelo desejado: ");
                        modelo = teclado.nextLine();
                        if(cadastroBicicletas.BuscaBicicletaPeloModelo(modelo) == null) {
                            System.out.println("Modelo não encontrado!");
                            break;
                        }
                        System.out.println("Qual usuario gostaria de retirar este modelo?");
                        String usuario = teclado.nextLine();
                        Membro membro = cadastroMembros.BuscaMembroPeloNome(usuario);
                        if( membro == null) {
                            System.out.println("Membro não encontrado!");
                            break;
                        }
                        if(membro.getBicicletaEmprestada() != null) {
                            System.out.println("Este usuário já possui uma bicicleta emprestada!");
                            break;
                        }
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
            teclado.close();
        } while(fazerLoop);
        
    }
}
