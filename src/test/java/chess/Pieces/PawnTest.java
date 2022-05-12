package chess.Pieces;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PawnTest {
    @Test
    public void PawnTest(){
            Pawn whitePawn = new Pawn("White");
            assertEquals("White", whitePawn.getColor());

            Pawn blackPawn = new Pawn("Black");
            assertEquals("Black", blackPawn.getColor());

    }
    @Test
    public void TestPawnWithoutColor(){
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE,pawn.getColor());
    }
}
