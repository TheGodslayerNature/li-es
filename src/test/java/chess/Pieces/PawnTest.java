package chess.Pieces;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PawnTest {
    @Test
    public void TestPawn(){
            Pawn whitePawn = new Pawn("White", 'p');
            assertEquals("White", whitePawn.getColor());
            assertEquals('p', whitePawn.getRepresentation());

            Pawn blackPawn = new Pawn("Black",'P');
            assertEquals("Black", blackPawn.getColor());
            assertEquals('P', blackPawn.getRepresentation());
    }
    @Test
    public void TestPawnWithoutColor(){
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE,pawn.getColor());
    }
}
