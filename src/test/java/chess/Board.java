package chess;

import chess.Pieces.Pawn;

import java.util.ArrayList;

public class Board {
    private final int Number;
    private final ArrayList<Pawn> arrayList;
    private final ArrayList<Pawn> secondRank;
    private final ArrayList<Pawn> SeventhRank;
    private final String dot = ".......";
    public static final String NEWLINE = System.getProperty("line.separator");

    public Board (){
        this.Number = 0;
        this.arrayList = new ArrayList<>();
        this.secondRank = new ArrayList<>();
        this.SeventhRank = new ArrayList<>();
    }
    public int getNumberOfPieces(){
        return secondRank.size() + SeventhRank.size();
    }
    public int incrementCount(){
        return Number;
    }
//    public Pawn getPieces(int index ){
//        return arrayList.get(index);
//    }
    public void initialize(){
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        secondRank.add(new Pawn("White", 'p'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
        SeventhRank.add(new Pawn("Black", 'P'));
    }
    public String secondRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < secondRank.size(); i++) {
            buffer.append(secondRank.get(i).getRepresentation());
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
    public String emptyRepresentation(){
        return dot;
    }
    public String printBoard(){
        return
                emptyRepresentation() + NEWLINE +
                seventhRankRepresentation() + NEWLINE +
                emptyRepresentation() + NEWLINE +
                emptyRepresentation() + NEWLINE +
                emptyRepresentation() + NEWLINE +
                emptyRepresentation() + NEWLINE +
                secondRankRepresentation() + NEWLINE +
                emptyRepresentation();
    }

    public String anotherPrintBoardSolution(){
        StringBuilder buffer = new StringBuilder();
        buffer.append(emptyRepresentation());
        buffer.append(NEWLINE);
        buffer.append(seventhRankRepresentation());
        buffer.append(NEWLINE);
        buffer.append(emptyRepresentation());
        buffer.append(NEWLINE);
        buffer.append(emptyRepresentation());
        buffer.append(NEWLINE);
        buffer.append(emptyRepresentation());
        buffer.append(NEWLINE);
        buffer.append(emptyRepresentation());
        buffer.append(NEWLINE);
        buffer.append(secondRankRepresentation());
        buffer.append(NEWLINE);
        buffer.append(emptyRepresentation());
        return buffer.toString();
    }
}
