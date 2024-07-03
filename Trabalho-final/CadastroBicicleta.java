import java.util.Scanner;
public class CadastroBicicleta
{
    private Bicicleta[] bicicletas;
    private Scanner teclado;
    private int contador;
    
    public CadastroBicicleta(){

        this.bicicletas = new Bicicleta[10];
        this.teclado = new Scanner(System.in);
        contador = 0;
    }
    
    public Bicicleta BuscaBicicletaPeloModelo(String modelo) {
        //apagar linha de baixo
        return new Bicicleta(0,0,"");
    }
    
    public boolean AdicionaBicicleta() {
        if(contador >= 10) {
            System.out.println("Não há espaço para mais bicicletas!");
            return false;
        }
        System.out.println("Informe o modelo da bicicleta");
        String modelo = teclado.nextLine();
        System.out.println("Informe quantas bicicletas vão ser adicionadas");
        int quantidade = teclado.nextInt();

        bicicletas[contador] = new Bicicleta(contador, quantidade, modelo);
        contador = contador + 1;

        return true;
    }
    
    public int TotalUnidades() {
        //apagar linha de baixo
        return 0;
    }
    public void MostraBicicletas() {
    }
    
}
