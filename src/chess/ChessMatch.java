package chess;

import boardgame.Board;

public class ChessMatch { // É nessa classe que vão ter as regras do jogo de xadrez
	
	private Board board; // Uma partida de xadrez tem que ter um tabuleiro
	
	public ChessMatch() {
		board = new Board(8, 8);  // Quem tem que saber a dimensão de um tabuleiro de xadrez é a classe ChessMatch
	}
	
	public ChessPiece[][] getPieces() { // Vai ter que retornar uma matriz de peças de xadrez correspondente a partida
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return matriz;
	}

}
