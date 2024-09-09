import java.util.ArrayList;

public class Candidatura {

	private ArrayList<Candidato> candidatos;
	public Candidatura() {
		this.candidatos = new ArrayList<Candidato>();
	}

	public boolean cadastraCandidato(Candidato c) {
		String novo = Integer.toString(c.getNumero());
		for (Candidato candidato : candidatos) {
			String atual = Integer.toString(candidato.getNumero());
			
			if (novo.charAt(0) == atual.charAt(0) 
				&& atual.charAt(1) == novo.charAt(1)
				) {
				return false;
			}
		}
		return true;
	}

}
