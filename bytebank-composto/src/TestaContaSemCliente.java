
public class TestaContaSemCliente { 
	
    public static void main(String[] args) { 
    	
        Conta conta = new Conta();
        System.out.println(conta.getSaldo());

        conta.titular = new Cliente();
        System.out.println(conta.titular);

        conta.titular.setNome("Eduardo");
        System.out.println(conta.titular.getNome()); 
        
    }
    
} 
