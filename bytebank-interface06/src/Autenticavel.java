
// � uma interface
	// N�o pode ter atributos
	// N�o pode ter m�todos com implementa��o
	// N�o pode ter nada concreto, s� abstratos

// Analogia: Contrato -> Autenticavel
	// Quem assinar esse contrato, precisa implementar todos os m�todos da interface

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);
        
}
