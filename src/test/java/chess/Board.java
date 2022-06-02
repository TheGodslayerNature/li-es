package chess;

import chess.Pieces.Pawn;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Board {
    private final int Number;
    private final ArrayList<Pawn> arrayList;
    private final ArrayList<Pawn> FirstRank;
    private final ArrayList<Pawn> SeventhRank;

    public Board (){
        this.Number = 16;
        this.arrayList = new ArrayList<>();
        this.FirstRank = new ArrayList<>();
        this.SeventhRank = new ArrayList<>();
    }
    public int getNumberOfPieces(){
        return Number;
    }
    public int incrementCount(){
        return Number;
    }
//    public void addPawn(Pawn pawn){
//        arrayList.add(pawn);
//    }
    public Pawn getPieces(int index ){
        return arrayList.get(index);
    }
    public void initialize(){
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        FirstRank.add(new Pawn("White", 'p'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
    }
    public String firstRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < FirstRank.size(); i++) {
            buffer.append(FirstRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String seventhRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < SeventhRank.size(); i++) {
            buffer.append(SeventhRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
}
