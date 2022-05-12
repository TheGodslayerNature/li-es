package chess.Pieces;

import java.awt.*;

public class Pawn {
    private String color;

    /**
     * cria um pawn que receberá um tipo de cor
     * @param color especifica o tipo dado
     */
    public Pawn(String color){
        this.color = color;
    }

    /**
     * metodo para receber uma cor
     * @return retorna a cor
     */
    public String getColor(){
        return color;
    }

    public static String WHITE = "White";
    public static String BLACK = "Black";

    /**
     *
     */
    public Pawn(){
        this.color = WHITE;
    }







}
