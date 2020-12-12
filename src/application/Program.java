package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		// Instanciando uma partida de xadrez e imprimindo o tabuleiro dessa partida
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces()); // Recebe como parâmetro a matriz de peças da minha partida

	}

}
