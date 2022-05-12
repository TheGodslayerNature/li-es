package chess;
import chess.Pieces.Pawn;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void BoardTest(){
        
        Board board = new Board();
        assertEquals(0,board.getNumberOfPieces());

    }

    @Test
    public void CountPieces() {
        Board board = new Board();
        board.incrementCount();
        assertEquals(1,board.getNumberOfPieces());
    }
    @Test
    public void testAddPieces(){
        Pawn pawn = new Pawn();
        Board board = new Board();
        board.addPawn(pawn);
        assertEquals(pawn, board.getPieces(0));
    }


}
