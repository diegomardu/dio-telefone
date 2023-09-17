package telefone.navegador;

public class NavegadorImpl implements Navegador{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

}
