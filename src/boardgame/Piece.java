package boardgame; // Pacote correspondente a camada de tabuleiro

public class Piece {
	
	protected Position position; // A posi��o de uma pe�a recem criada vai ser inicialmente nula, dizendo que essa pe�a n�o foi colocada no tabuleiro ainda
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // protected --> Somente classes do mesmo pacote e subclasses v�o poder acessar o tabuleiro(Board) de uma pe�a(Piece)
		return board;
	}
	 // N�o tem o m�todo setBoard pois n�o permitirei que meu tabuleiro seja alterado
	
}
