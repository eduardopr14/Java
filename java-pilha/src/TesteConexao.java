
public class TesteConexao {
	
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Erro na conex�o!\n");
		}
		
		// ---------------------------------------------------------------------
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException ex) {
//			System.out.println("Erro na conex�o!\n");
//		} finally { // finally ser� executado de qualquer jeito, com ou sem erro
//			con.close();
//		}
//		
//		// ---------------------------------------------------------------------
//		
//		// Tamb�m funciona, n�o precisa do catch()
//		try {
//			
//		} finally {
//			
//		}
		
	}
	
}
