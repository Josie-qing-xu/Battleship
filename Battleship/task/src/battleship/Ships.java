package battleship;

import static battleship.Main.BattleshipField;
import static java.lang.Math.abs;


public class Ships {
    private  int beginningRow;
    private  int beginningColumn;
    private  int endRow;
    private  int endsColumn;


    public Ships(String battleshipCoordinates) {



        String battleship = battleshipCoordinates.replaceAll("\\s+", "");
        String[] splitStr = battleship.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        beginningRow = (int) splitStr[0].charAt(0)-65;
        beginningColumn = Integer.parseInt(splitStr[1])-1;
        endRow = (int) splitStr[2].charAt(0)-65;
        endsColumn = Integer.parseInt(splitStr[3])-1;

        if (beginningColumn > endsColumn) {
            int x = beginningColumn;
            beginningColumn = endsColumn;
            endsColumn = x;
        }
        if (beginningRow > endRow) {
            int x = beginningRow;
            beginningRow = endRow;
            endRow = x;
        }

    }

    public boolean shipDraw(int shipLength) {

        if (beginningRow == endRow || beginningColumn == endsColumn) {
            if (abs(beginningRow - endRow) == shipLength - 1 || abs(beginningColumn - endsColumn) == shipLength - 1) {
                if (beginningRow == endRow){
                    for (int i = 0; i < shipLength; i++) {
                        Field.LocalArray[beginningRow][beginningColumn + i] = "O";
                    }
                }
                if (beginningColumn == endsColumn){
                    for (int i = 0; i < shipLength; i++) {
                        Field.LocalArray[beginningRow+ i][beginningColumn] = "O";
                    }
                }

                BattleshipField.fieldDraw();
                return false;
            }
            else {
                System.out.print("Error! Wrong length of the Submarine! Try again:\n> ");
                return true;
            }
        }
        else {
            System.out.print("Error! Wrong ship location! Try again:\n> ");
            return true;
        }

    }

}
