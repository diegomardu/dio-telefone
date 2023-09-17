import telefone.navegador.Navegador;
import telefone.reprodutor.Reproducao;
import telefone.telefone.Telefone;

public class Aparelho implements Telefone, Navegador, Reproducao{

	@Override
	public void tocar() {
		System.out.println("Ouvindo musica.");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada.");
		
	}

	@Override
	public void selecionarMusica(String nome) {
		System.out.println(nome + " selecionada.");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");
		
	}

	@Override
	public void ligar(Integer numero) {
		System.out.println("Ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz");
		
	}
	
	
}
