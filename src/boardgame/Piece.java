package boardgame; // Pacote correspondente a camada de tabuleiro

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] matriz = possibleMoves();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (matriz[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
