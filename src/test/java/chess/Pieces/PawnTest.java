package chess.Pieces;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PawnTest {
    private Pawn whitePawn;
    private Pawn blackPawn;
@Before
    public void setUp(){
        whitePawn = new Pawn("White",'p');
        blackPawn = new Pawn("Black", 'P');
    }
    @Test
    public void TestPawn(){
            assertEquals("White", whitePawn.getColor());
            assertEquals('p', whitePawn.getRepresentation());

            assertEquals("Black", blackPawn.getColor());
            assertEquals('P', blackPawn.getRepresentation());
    }
    @Test
    public void TestPawnWithoutColor(){
        Pawn pawn = new Pawn();
        assertEquals(Pawn.WHITE,pawn.getColor());
    }
}
