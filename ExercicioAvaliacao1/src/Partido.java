import java.util.ArrayList;
public class Partido {

	private ArrayList<Candidato> candidatos;
	private int numero;
	private String nome;
	
	public Partido(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.candidatos = new ArrayList<Candidato>();
	}

	public int getNumero() { return this.numero; }
	public String getNome() { return this.nome;	}
	public ArrayList<Candidato> getCandidatos() { return this.candidatos; }

	/*
	 * Adiciona um candidato ao partido
	 * @param c Candidato a ser adicionado
	 * @return void
	 */
	public void adicionaCandidato(Candidato c) {
		candidatos.add(c);
	}

	@Override
	public String toString() {
		return this.numero + "," + this.nome;
	}
}
