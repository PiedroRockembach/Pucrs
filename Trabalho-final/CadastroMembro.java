
public class CadastroMembro {
   private Membro[] membros;
   private int contador;
     
    public CadastroMembro() {
        membros = new Membro[10];
        contador=0;
   }
    
   public boolean AdicionaMembro(Membro novoMembro) {
        if (contador < membros.length) {
            membros[contador]=novoMembro;
            contador++;
            return true;
        }
        
        return false;
    }
   
    public Membro BuscaMembroPeloNome(String nome) {
        for (int i = 0; i < contador; i++) {
            if (membros[i].getNome().equalsIgnoreCase(nome)) {
                return membros[i];
            }
    }
    return null;
   }

   public Membro BuscaMembroPelaMatricula(int matricula) {
        for (int i = 0; i < contador; i++) {
            if (membros[i].getMatricula() == matricula) {
                return membros[i];
            }
        }
        return null;
    }

   
   public void MostraMembros() {
         if (contador == 0) {
            System.out.println("Nenhum membro cadastrado.");
            return;
        } 

        System.out.println("Membros: \n");
        for (int i = 0; i < contador; i++) {
            System.out.println(membros[i].toString());
        }
        return;
   }
}