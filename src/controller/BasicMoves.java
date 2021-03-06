package controller;

import java.util.ArrayList;

import model.Chessboard;


public abstract class BasicMoves {
	protected ArrayList<Move> possibleMoves;
	
 
	public BasicMoves(int x, int y, Chessboard board){
		possibleMoves = new ArrayList<Move>();
		if(board.getPawn(x, y) != null)
			fillTheVector(x,y,board);
	}
	
 
	public Move[] getMoves(){
		Move[] result = new Move[possibleMoves.size()];
		for(int i = 0; i < possibleMoves.size(); i++)
			result[i] = possibleMoves.get(i);
		return result;
	}

	
	public abstract void fillTheVector(int x, int y, Chessboard board);
	
	
	public boolean isOutOfTheBoard(int x, int y){
		
		return x > 7 || y > 7 || x < 0 || y < 0;
		
		
	}
	
	public boolean isOutOfTheBoard(Move move){
		return isOutOfTheBoard(move.getX(),move.getY());		
	}
	
	public abstract boolean isValid(Move move, Chessboard board);
}
