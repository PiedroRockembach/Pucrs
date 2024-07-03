

public class Bicicleta
{
    private int quantidadeUnidades;
    private int codigo;
    private String modelo;
    
    public Bicicleta(int codigo, int quantidadeUnidades, String modelo) {
        this.quantidadeUnidades = quantidadeUnidades;
        this.codigo = codigo;
        this.modelo = modelo;
    }
    
    public void RealizaDevolucao() {
        quantidadeUnidades = quantidadeUnidades + 1;
    
    }
    
    public Bicicleta RealizaEmprestimo() {
        if(quantidadeUnidades < 0) {
            System.out.println("Não existem bicicletas disponíveis");
        }
        quantidadeUnidades = quantidadeUnidades - 1;
        
        return this;
    
    }
    
}
