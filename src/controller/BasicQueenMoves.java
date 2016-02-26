package controller;

import model.Chessboard;

public class BasicQueenMoves extends BasicMoves {

	public BasicQueenMoves(int x, int y, Chessboard board) {
		super(x, y, board);
		
	}

	
	@Override
	public void fillTheVector(int x, int y, Chessboard board) {
		
		 
		Move[] rookMoves = getRookMoves(x,y,board);
		for(int i = 0; i < rookMoves.length; i++)
				this.possibleMoves.add(rookMoves[i]);
		
		Move[] bishopMoves = getBishopMoves(x, y, board);
		for(int i = 0; i < bishopMoves.length; i++)
				this.possibleMoves.add(bishopMoves[i]);
	}

	@Override
	public boolean isValid(Move move, Chessboard board) {
		
		return !isOutOfTheBoard(move);
	}
	
	
	public Move[] getRookMoves(int x, int y, Chessboard board){
		BasicMoves basicRookMoves = new BasicRookMoves(x,y,board);
		return basicRookMoves.getMoves();
	}
	
	
	
	public Move[] getBishopMoves(int x, int y, Chessboard board){
		BasicMoves basicBishopMoves = new BasicBishopMoves(x,y,board);
		return basicBishopMoves.getMoves();
	}
}
