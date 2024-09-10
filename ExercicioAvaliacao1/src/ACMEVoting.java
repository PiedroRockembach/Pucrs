import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ACMEVoting {
	private Scanner entrada = new Scanner(System.in);  // Atributo para entrada padrao (teclado)
    private final String nomeArquivoEntrada = "input.txt";  // Nome do arquivo de entrada de dados
    private final String nomeArquivoSaida = "output.txt";  // Nome do arquivo de saida de dados

	private Candidatura candidatura;

	private CadastroPartido cadastroPartido;
	

	public ACMEVoting() {
		this.candidatura = new Candidatura();
		this.cadastroPartido = new CadastroPartido();
		this.redirecionaSaida();
		this.redirecionaEntrada();
	}

	public void executar() {
		//Cadastra Partidos
		while(true) {
			int numero = entrada.nextInt();
			entrada.nextLine();
			if(numero == -1) break;
			String nome = entrada.nextLine();
			Partido p = new Partido(numero, nome);
			if (cadastroPartido.cadastraPartido(p)) System.out.println("1:" + p);
		}
		//Cadastra Candidatos
		while(true) {
			int numero = entrada.nextInt();
			entrada.nextLine();
			if(numero == -1) break;
			String nome = entrada.nextLine();
			String municipio = entrada.nextLine();
			int numeroPartido = Integer.parseInt(Integer.toString(numero).substring(0, 2));
			Partido partido = cadastroPartido.consultaPartido(numeroPartido);
			if(partido == null) { continue; }
			Candidato c = new Candidato(numero, nome, municipio);
			if(this.candidatura.cadastraCandidato(c)) {
				System.out.println("2:" + c);
				partido.adicionaCandidato(c);
			}
		}
		//Votação
		while (true) {
			int numero = entrada.nextInt();
			entrada.nextLine();
			if(numero == -1) break;
			String municipio = entrada.nextLine();
			int votos = entrada.nextInt();
			entrada.nextLine();
			
			Candidato candidato = this.candidatura.consultaCandidato(numero, municipio);

			if(candidato == null) { continue; }
			candidato.vota(votos);
			System.out.println("3:" + numero + "," + candidato.getMunicipio() + "," + votos);
		}
		//Mostra dados de um determinado partido
		int numeroPartido = entrada.nextInt();
		entrada.nextLine();
		Partido partido = cadastroPartido.consultaPartido(numeroPartido);
		if (partido == null)  System.out.println("4:Nenhum partido encontrado."); 
		else  System.out.println("4:" + numeroPartido + "," + partido.getNome());
		
		//Mostra dados de um determinado candidato
		int numeroCandidato = entrada.nextInt();
		entrada.nextLine();
		String municipio = entrada.nextLine();
		Candidato candidato = this.candidatura.consultaCandidato(numeroCandidato, municipio);
		if (candidato == null) System.out.println("5:Nenhum candidato encontrado.");
		else System.out.println("5:" + candidato + "," + candidato.getVotos());

		//Mostra dados de todos os prefeitos de um determinado partido
		String nomePartido = entrada.nextLine();
		partido = cadastroPartido.consultaPartido(nomePartido);
		if (partido == null) System.out.println("6:Nenhum partido encontrado.");
		else {
			ArrayList<Candidato> candidatos = partido.getCandidatos();
			ArrayList<Candidato> prefeitos = new ArrayList<Candidato>();
			for (Candidato c : candidatos) {
				if(Integer.toString(c.getNumero()).length() == 2) {
					prefeitos.add(c);
				}	
			}
			for (Candidato c : prefeitos) {
				System.out.println("6:" + partido.getNome() + "," + c + "," + c.getVotos());
			}
		}
		//Mostra os dados do partido com mais candidatos
		Partido partidoMaisCandidatos = null;
		for( Partido p : cadastroPartido.getPartidos()) {
			if(partidoMaisCandidatos == null || p.getCandidatos().size() > partidoMaisCandidatos.getCandidatos().size()) {
				partidoMaisCandidatos = p;
			}
		}
		if(partidoMaisCandidatos == null || partidoMaisCandidatos.getCandidatos().size() == 0) System.out.println("7:Nenhum partido com candidatos.");
		System.out.println("7:" + partidoMaisCandidatos + "," + partidoMaisCandidatos.getCandidatos().size());
		//Mostrar os dados do prefeito e do vereador mais votados
		if(this.candidatura.getCandidatos().size() == 0) System.out.println("8:Nenhum candidato encontrado.");
		else {
			Candidato prefeitoMaisVotado = null;
			Candidato vereadorMaisVotado = null;
			for(Candidato c : this.candidatura.getCandidatos()) {
				if(Integer.toString(c.getNumero()).length() == 2) {
					if(prefeitoMaisVotado == null || c.getVotos() > prefeitoMaisVotado.getVotos()) {
						prefeitoMaisVotado = c;
					}
				} else {
					if(vereadorMaisVotado == null || c.getVotos() > vereadorMaisVotado.getVotos()) {
						vereadorMaisVotado = c;
					}
				}
			}
			if(prefeitoMaisVotado != null) System.out.println("8:" + prefeitoMaisVotado + "," + prefeitoMaisVotado.getVotos());
			if(vereadorMaisVotado != null) System.out.println("8:" + vereadorMaisVotado + "," + vereadorMaisVotado.getVotos());
		}
	}
	private void redirecionaEntrada() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
            entrada = new Scanner(streamEntrada);   // Usa como entrada um arquivo
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);   // Ajusta para ponto decimal
        entrada.useLocale(Locale.ENGLISH);   // Ajusta para leitura para ponto decimal
    }

    // Redireciona Saida de dados para arquivos em vez da tela (terminal)
    // Chame este metodo para redirecionar a escrita de dados para arquivos
    private void redirecionaSaida() {
        try {
            PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
            System.setOut(streamSaida);             // Usa como saida um arquivo
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);   // Ajusta para ponto decimal
    }


}
