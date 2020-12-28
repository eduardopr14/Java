
public class FluxoExceptionMinha {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(MinhaExcecao2 ex) { // MinhaExcecao só vai compilar se for unchecked
        	String mensagem = ex.getMessage();
        	System.out.println("Exception " + mensagem);
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao2("deu muito errado!");
    }
    
}
