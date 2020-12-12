package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch { // � NESSA CLASSE QUE V�O TER AS REGRAS DO JOGO DE XADREZ
	
	private Board board; // Uma partida de xadrez tem que ter um tabuleiro
	
	public ChessMatch() {
		board = new Board(8, 8);  // Quem tem que saber a dimens�o de um tabuleiro de xadrez � a classe ChessMatch
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() { // Vai ter que retornar uma matriz de pe�as de xadrez correspondente a partida
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matriz[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return matriz;
	}
	
	private void initialSetup() { // M�todo respons�vel por iniciar a partida de xadrez colocando as pe�as no tabuleiro
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}

}