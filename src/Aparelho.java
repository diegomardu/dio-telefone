import telefone.navegador.Navegador;
import telefone.reprodutor.Reproducao;
import telefone.telefone.Telefone;
import telefone.telefone.TelefoneImpl;

public class Aparelho {
	
	private TelefoneImpl telefone;
	
	private Navegador navegador;
	
	private Reproducao reproducao;
	
	public Aparelho() {
		
	}
	
	public Aparelho(TelefoneImpl telefone, Navegador navegador, Reproducao reproducao) {
		this.telefone = telefone;
		this.navegador = navegador;
		this.reproducao = reproducao;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(TelefoneImpl telefone) {
		this.telefone = telefone;
	}

	public Navegador getNavegador() {
		return navegador;
	}

	public void setNavegador(Navegador navegador) {
		this.navegador = navegador;
	}

	public Reproducao getReproducao() {
		return reproducao;
	}

	public void setReproducao(Reproducao reproducao) {
		this.reproducao = reproducao;
	}

}
