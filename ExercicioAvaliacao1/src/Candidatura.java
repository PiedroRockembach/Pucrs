import java.util.Collection;

public class Candidatura {

	private Collection<Candidato> candidato;

	public boolean cadastraCandidato(Candidato c) {
		for (Candidato candidato : candidato) {
			if (candidato.getNumero() == c.getNumero()  && candidato.getMunicipio().equals(c.getMunicipio())) {
				return false;
			}
		}
		return false;
	}

}
