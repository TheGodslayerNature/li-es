package chess;
import chess.Pieces.Pawn;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoardTest {
    @Test
    public void TestBoard(){
        Board board = new Board();
        assertEquals(16,board.getNumberOfPieces());
        board.initialize();
        assertEquals("pppppppp", board.firstRankRepresentation());
        assertEquals("PPPPPPPP", board.seventhRankRepresentation());
    }

    @Test
    public void CountPieces() {
        Board board = new Board();
        board.incrementCount();
        assertEquals(16,board.getNumberOfPieces());
    }
//    @Test
//    public void testAddPieces(){
//        Pawn pawn = new Pawn();
//        Board board = new Board();
//        board.addPawn(pawn);
//        assertEquals(pawn, board.getPieces(0));
//        System.out.println(board.getNumberOfPieces());
//    }


}
