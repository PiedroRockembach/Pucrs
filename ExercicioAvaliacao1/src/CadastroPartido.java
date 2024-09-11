import java.util.ArrayList;

public class CadastroPartido {

	private ArrayList<Partido> partidos;

	public CadastroPartido() {
		this.partidos = new ArrayList<Partido>();
	}
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}
	/**
	 * Cadastra um partido
	 * @param p Partido a ser cadastrado
	 * @return boolean
	 * @return true se o partido foi cadastrado com sucesso
	 * @return false se o partido ja existe
	 */
	public boolean cadastraPartido(Partido p) {
		int numeroPartido = p.getNumero();
		if(Integer.toString(numeroPartido).length() != 2) {
			return false;
		}
		if (this.consultaPartido(numeroPartido) != null ) {
			return false;
		}
		partidos.add(p);
		return true;
	}

	/**
	 * Consulta um partido pelo nome
	 * @param nome Nome do partido a ser consultado
	 * @return Partido
	 * @return null se o partido nao existe
	 */
	public Partido consultaPartido(String nome) {
		for (Partido partido : partidos) {
			if (partido.getNome().equals(nome)) {
				return partido;
			}
		}
		return null;
	}

	/**
	 * Consulta um partido pelo número
	 * @param numero Numero do partido a ser consultado
	 * @return Partido se o partido existe
	 * @return null se o partido nao existe
	 */
	public Partido consultaPartido(int numero) {
		for (Partido partido : partidos) {
			if (partido.getNumero() == numero) {
				return partido;
			}
		}
		return null;
	}

}
