import java.util.ArrayList;

public class Candidatura {

	private ArrayList<Candidato> candidatos;

	public Candidatura() {
		this.candidatos = new ArrayList<Candidato>();
	}
	
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	/**
	 * Cadastra um candidato
	 * @param c Candidato a ser cadastrado
	 * @return boolean
	 * @return true se o candidato foi cadastrado com sucesso
	 * @return false se o candidato ja existe
	 * @return false se o candidato tem o mesmo numero que outro candidato
	 */
	public boolean cadastraCandidato(Candidato c) {
		String novo = Integer.toString(c.getNumero());
		for (Candidato candidato : candidatos) {
			String atual = Integer.toString(candidato.getNumero());
			
			if (atual.substring(0, 1).equals(novo.substring(0, 1))
				&& atual.length() == novo.length()
				) {
				
				return false;
			}
		}
		candidatos.add(c);
		return true;
	}

	/**
	 * Consulta um candidato pelo número e municipio
	 * @param nome Nome do candidato a ser consultado
	 * @param municipio Municipio do candidato a ser consultado
	 * @return Candidato
	 * @return null se o candidato nao existe
	 */
	public Candidato consultaCandidato(int numero, String municipio) {
		for (Candidato candidato : this.candidatos) {
			if (candidato.getNumero() == numero && candidato.getMunicipio().equals(municipio)) {
				return candidato;
			}
		}
		return null;
	}
	

	/**
	 * Adiciona votos ao candidato
	 * @param numero Número do candidato
	 * @param votos Votos a serem adicionados
	 * @return boolean 
	 * @return false se o candidato nao existe
	 * @return true se os votos foram adicionados com sucesso
	 */
	public boolean vota(int numero, String municipio, int votos) {
		Candidato candidato = this.consultaCandidato(numero, municipio);
		if (candidato == null) {
			return false;
		}
		candidato.vota(votos);
		return true;
	}

}
