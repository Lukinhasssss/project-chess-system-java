package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece { // Rook == Torre

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()]; // Por padr�o todas as posi��es dessa matriz come�am com false.
		
		Position p = new Position(0, 0);
		
		// above
		p.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto a posi��o p existir e n�o tiver uma pe�a l�, ou seja, enquanto a posi��o estiver vaga eu vou marcar essa posi��o como true...
			matriz[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}
		
		// left
		p.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto a posi��o p existir e n�o tiver uma pe�a l�, ou seja, enquanto a posi��o estiver vaga eu vou marcar essa posi��o como true...
			matriz[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}
		
		// right
		p.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto a posi��o p existir e n�o tiver uma pe�a l�, ou seja, enquanto a posi��o estiver vaga eu vou marcar essa posi��o como true...
			matriz[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}
		
		// below
		p.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto a posi��o p existir e n�o tiver uma pe�a l�, ou seja, enquanto a posi��o estiver vaga eu vou marcar essa posi��o como true...
			matriz[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			matriz[p.getRow()][p.getColumn()] = true;
		}
		
		return matriz;
	}

}
