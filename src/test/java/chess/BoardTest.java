package chess;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoardTest {
    private Board board;
    @Before
    public void setUp() {
        board = new Board();
    }
    @Test
    public void testCreateInitialBoardVersionRemastered(){
        board.initialize();
        assertEquals("......." + Board.NEWLINE +
                "PPPPPPPP"+ Board.NEWLINE +
                "......." + Board.NEWLINE +
                "......." + Board.NEWLINE +
                "......." + Board.NEWLINE +
                "......." + Board.NEWLINE +
                "pppppppp" + Board.NEWLINE +
                "......." , board.anotherPrintBoardSolution());
        System.out.println(board.anotherPrintBoardSolution());
        System.out.println(board.getNumberOfPieces());
    }
//    @Test
//    public void testCreateInitialBoard(){
//        board.initialize();
//        assertEquals("......." + Board.NEWLINE +
//                "PPPPPPPP"+ Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "pppppppp"+ Board.NEWLINE +
//                "......." , board.printBoard());
//        System.out.println(board.printBoard());
//    }
    @Test
    public void testCreateBoard(){
        assertEquals(0,board.getNumberOfPieces());
//        board.initialize();
//        assertEquals("pppppppp", board.secondRankRepresentation());
//        assertEquals(".......", board.emptyRepresentation());
//        assertEquals("PPPPPPPP", board.seventhRankRepresentation());
    }

    @Test
    public void testCountPieces() {
        board.incrementCount();
        assertEquals(0,board.getNumberOfPieces());
    }

}
