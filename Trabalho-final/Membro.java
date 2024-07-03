public class Membro {
    private int matricula;
    private String nome;
    private String cidadeOrigem;
    private Bicicleta bicicletaEmprestada;
    
    public Membro (int matricula, String nome, String cidadeOrigem) {
        this.matricula = matricula;
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
        this.bicicletaEmprestada = null; 
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public Bicicleta getBicicletaEmprestada() {
        return bicicletaEmprestada;
    }

    public void emprestarBicicleta(Bicicleta bicicleta) {
        this.bicicletaEmprestada = bicicleta;
    }

    public void devolverBicicleta() {
        this.bicicletaEmprestada = null;
    }
    
}
