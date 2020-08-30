package apllication;

import BoardGame.Board;
import BoardGame.Position;
import chess.ChessMatch;

public class jogoChadress {

	public static void main(String[] args) {
	
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
