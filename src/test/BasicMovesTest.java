package test;

import static org.junit.Assert.*;
import model.Chessboard;

import org.junit.Test;

import controller.BasicBishopMoves;
import controller.BasicKingMoves;
import controller.BasicKnightMoves;
import controller.BasicMoves;
import controller.BasicQueenMoves;
import controller.BasicRookMoves;
import controller.Move;

public class BasicMovesTest {
	
	
	@Test
	public void rookTest() {
		Chessboard board = new Chessboard("black","white");
		BasicMoves basicRookMoves = new BasicRookMoves(7,7,board);
		Move[] rookMoves = basicRookMoves.getMoves();
		System.out.println("Rook Moves :");
		for(Move move:rookMoves)
				System.out.println(move);
		assertTrue(rookMoves.length == 13);
		
	}
	
	
	@Test
	public void bishopTest() {
		Chessboard board = new Chessboard("black","white");
		BasicMoves basicBishopMoves = new BasicBishopMoves(7,5,board);
		Move[] bishopMoves = basicBishopMoves.getMoves();
		System.out.println("Bishop Moves :");
		for(Move move:bishopMoves)
				System.out.println(move);
		assertTrue(bishopMoves.length == 7);
		
	}
	
	
	@Test
	public void queenTest() {
		Chessboard board = new Chessboard("black","white");
		BasicMoves basicQueenMoves = new BasicQueenMoves(7,3,board);
		Move[] queenMoves = basicQueenMoves.getMoves();
		System.out.println("Queen Moves :");
		for(Move move:queenMoves)
				System.out.println(move);
		assertTrue(queenMoves.length == 20);
		
	}
	
	
	@Test
	public void knightTest() {
		Chessboard board = new Chessboard("black","white");
		BasicMoves basicKnightMoves = new BasicKnightMoves(7,6,board);
		Move[] knightMoves = basicKnightMoves.getMoves();
		System.out.println("Knight Moves :");
		for(Move move:knightMoves)
				System.out.println(move);
		assertTrue(knightMoves.length == 3);
		
	}
	
	
	@Test
	public void kingTest() {
		Chessboard board = new Chessboard("black","white");
		BasicMoves basicKingMoves = new BasicKingMoves(7,4,board);
		Move[] kingMoves = basicKingMoves.getMoves();
		System.out.println("King Moves :");
		for(Move move:kingMoves)
				System.out.println(move);
		assertTrue(kingMoves.length == 5);
		
	}
	
}
