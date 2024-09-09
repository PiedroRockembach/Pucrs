import java.util.ArrayList;
public class Partido {

	private ArrayList<Candidato> candidatos;
	private int numero;
	private String nome;

	public int getNumero() { return this.numero;	}
	public String getNome() { return this.nome;	}
	
	public void adicionaCandidato(Candidato c) {
		candidatos.add(c);
	}

}
