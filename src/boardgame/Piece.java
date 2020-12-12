package boardgame; // Pacote correspondente a camada de tabuleiro

public class Piece {
	
	protected Position position; // A posição de uma peça recem criada vai ser inicialmente nula, dizendo que essa peça não foi colocada no tabuleiro ainda
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // protected --> Somente classes do mesmo pacote e subclasses vão poder acessar o tabuleiro(Board) de uma peça(Piece)
		return board;
	}
	 // Não tem o método setBoard pois não permitirei que meu tabuleiro seja alterado
	
}
