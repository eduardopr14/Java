
public class Conexao implements AutoCloseable {
	
	// Simula uma conex�o
	
	public Conexao() {
		System.out.println("- Abrindo Conex�o -\n");
//		throw new IllegalStateException();
	}
	
	public void leDados() {
		System.out.println("- Recebendo Dados -\n");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("- Fechando Conex�o -\n");
	}
	
}
