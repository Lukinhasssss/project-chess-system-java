package boardgame;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg); // Repassa a mensagem para o construtor da superclasse que é o RuntimeException
	}

}
