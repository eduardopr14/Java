
public class FluxoException {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        } catch(Exception ex) {
        	// catch (ArithmeticException | NullPointerException ex) { // Podem ter várias Exceptions específicas
        	String msg = ex.getMessage();
        	System.out.println("Erro: " + msg);
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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = i / 0; // Esse código vai dar erro => Exception
            
//            try {
//            	int a = i / 0;
//            } catch(ArithmeticException ex) {
//              String msg = ex.getMessage();
//            	System.out.println("ArithmeticException" + msg);
//              ex.printStackTrace();
//            }
            // Esse código não dará erro, pegaria o erro no catch
            
            // Erro 2
//            Conta c = null;
//            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
    
}
