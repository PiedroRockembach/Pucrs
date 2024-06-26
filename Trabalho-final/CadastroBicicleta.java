public class CadastroBicicleta
{
    private Bicicleta[] bicicletas;
    
    public CadastroBicicleta(){

        this.bicicletas = new Bicicleta[10];
    }
    
    public Bicicleta BuscaBicicletaPeloModelo(String modelo) {
        //apagar linha de baixo
        return new Bicicleta(0,0,"");
    }
    
    public boolean AdicionaBicicleta() {
        //apagar linha de baixo
        return true;
    }
    
    public int TotalUnidades() {
        //apagar linha de baixo
        return 0;
    }
    public void MostraBicicletas() {
    }
    
}
