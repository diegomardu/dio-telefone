package telefone.reprodutor;

public class ReproducaoImpl implements Reproducao{
	
	private String nome;	

	public ReproducaoImpl(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica " + nome);
		
	}

	@Override
	public void pausar() {
		System.out.println(nome + " pausada.");
		
	}

	@Override
	public void selecionarMusica(String nome) {
		System.out.println("Musica selecionada " + nome);
		
	}

}
