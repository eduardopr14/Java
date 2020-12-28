
// É uma interface
	// Não pode ter atributos
	// Não pode ter métodos com implementação
	// Não pode ter nada concreto, só abstratos

// Analogia: Contrato -> Autenticavel
	// Quem assinar esse contrato, precisa implementar todos os métodos da interface

public abstract interface Autenticavel {

    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);
        
}
