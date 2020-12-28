
public class Conexao implements AutoCloseable {
	
	// Simula uma conexão
	
	public Conexao() {
		System.out.println("- Abrindo Conexão -\n");
//		throw new IllegalStateException();
	}
	
	public void leDados() {
		System.out.println("- Recebendo Dados -\n");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("- Fechando Conexão -\n");
	}
	
}
