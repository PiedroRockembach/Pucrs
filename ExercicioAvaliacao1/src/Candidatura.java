import java.util.ArrayList;

public class Candidatura {

	private ArrayList<Candidato> candidatos;
	public Candidatura() {
		this.candidatos = new ArrayList<Candidato>();
	}

	public boolean cadastraCandidato(Candidato c) {
		for (Candidato candidato : candidatos) {
			if (candidato.getNumero() == c.getNumero()  && candidato.getMunicipio().equals(c.getMunicipio())) {
				return false;
			}
		}
		return false;
	}

}
