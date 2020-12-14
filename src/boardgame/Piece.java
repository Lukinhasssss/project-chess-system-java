package boardgame; // Pacote correspondente a camada de tabuleiro

public abstract class Piece {
	
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
