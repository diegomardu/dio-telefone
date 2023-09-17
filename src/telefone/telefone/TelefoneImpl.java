package telefone.telefone;

public class TelefoneImpl implements Telefone {
	
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
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
		System.out.println("Correio de voz.");
		
	}

}
