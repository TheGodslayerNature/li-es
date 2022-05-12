package chess;

import chess.Pieces.Pawn;

import java.util.ArrayList;

public class Board {
    private int Number;
    private ArrayList<Pawn> arrayList;
    /**
     * Cria um constructor chess.Board no qual,ele irá iniciar com zero peças.
     *
     */
    public Board (){
        this.Number = 0;
        this.arrayList = new ArrayList<>();
    }

    /**
     * metodo usado para retorna número de peças
     * @return retorna peças em formato númerico
     */
    public int getNumberOfPieces(){
        return Number;
    }
    public void incrementCount(){
        this.Number += 1;
    }

    /**
     * adiciona pawn em uma array
     * @param pawn é usado para se referir objeto e adiciona-ló
     */
    public void addPawn(Pawn pawn){
        arrayList.add(pawn);
    }

    /**
     * metodo criado para receber as peças recebidas
     * @param index especifica o tipo da variavel
     * @return pegará o objeto guardado e o envia para a array
     */
    public Pawn getPieces(int index ){
        return arrayList.get(index);
    }

}
