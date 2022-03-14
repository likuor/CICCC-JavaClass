package ChessProject;

import java.util.ArrayList;

public class Position {
    public String toString() {
        String brdStr = "";

        brdStr += " a b c d e f g h\n";

        for (int r = 0; r < 8; r++) {
            brdStr += (8 - r) + "";
            for (int c = 0; c < 8; c++) {
                brdStr += " .";
            }
            brdStr += (8 - r) + "";
            brdStr += "\n"; // line break
        }
        brdStr += " a b c d e f g h\n";

        return brdStr;
    }

    public ArrayList<ArrayList<String>> position(){
        String boardRow = "";

        //making the board array
        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        for(int row = 0; row < 8; row++) {
            ArrayList<String> rowArray = new ArrayList<>();
            for(int col = 0; col < 9; col++) {
                if (col == 8){
                    String str = " " + (col-board.size());
                    rowArray.add(str);
                } else {
                    rowArray.add(" .");
                }
            }
            board.add(rowArray);
        }

        //display the board
        boardRow += " a b c d e f g h\n";
        System.out.print(boardRow);
        for (ArrayList s: board){
            for(int colNum = 0; colNum < 9; colNum++) {
                System.out.print(s.get(colNum));
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(boardRow);

        return board;
    }
}
