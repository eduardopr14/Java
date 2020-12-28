
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conexão!\n");
		}
		
		// ---------------------------------------------------------------------
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro na conexão!\n");
//		} finally { // finally será executado de qualquer jeito, com ou sem erro
//			con.close();
//		}
//		
//		// ---------------------------------------------------------------------
//		
//		// Também funciona, não precisa do catch()
//		try {
//			
//		} finally {
//			
//		}
		
	}
	
}
