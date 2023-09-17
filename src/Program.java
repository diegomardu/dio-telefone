
public class Program {

	public static void main(String[] args) {
		
		Aparelho aparelho = new Aparelho();
		
		/*
		 * System.out.println("------------->"); aparelho.getReproducao("Los Hermanos");
		 * aparelho.tocar(); aparelho.pausar();
		 */

	    System.out.println("------------->");
	    aparelho.getTelefone().atender();
	    aparelho.getTelefone().iniciarCorreioVoz();
	    aparelho.getTelefone().ligar(40028922);

		/*
		 * System.out.println("------------->"); aparelho.exibirPagina();
		 * aparelho.atualizarPagina(); aparelho.adicionarNovaAba();
		 */

	    System.out.println("------------->");
	}

}
