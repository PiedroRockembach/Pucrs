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
        for(int i = 0; i < bicicletas.length; i++) {
            if(bicicletas[i].getModelo().equalsIgnoreCase(modelo)) return bicicletas[i];
        }
        System.out.println("Modelo não encontrado!");
        return null;
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
        teclado.nextLine();
        return true;
    }
    
    public int TotalUnidades() {
        int acum = 0;
        for(int i = 0 ; i< bicicletas.length; i++ ){
            acum = acum + bicicletas[i].getQuantidadeUnidades();
        }
        return acum;
    }

    public void MostraBicicletas() {
        if(contador == 0) {
            System.out.println("\fNão há bicicletas cadastradas!");
            return;
        }
        System.out.println("\fModelos cadastrados: ");
        for(int i = 0; i < contador; i++) {
            System.out.println(bicicletas[i].toString());
        }
    }
    
}
