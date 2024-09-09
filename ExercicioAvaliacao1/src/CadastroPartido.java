import java.util.ArrayList;

public class CadastroPartido {

	private ArrayList<Partido> partido;

	public boolean cadastraPartido(Partido p) {
		for (Partido partido : partido) {
			if (partido.getNumero() == p.getNumero()) {
				return false;
			}
		}
		partido.add(p);
		return true;
	}

	public Partido consultaPartido(String nome) {
		for (Partido partido : partido) {
			if (partido.getNome().equals(nome)) {
				return partido;
			}
		}
		return null;
	}

	public Partido consultaPartido(int numero) {
		for (Partido partido : partido) {
			if (partido.getNumero() == numero) {
				return partido;
			}
		}
		return null;
	}

}
