package battleship;

import java.util.Objects;

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
                    if (horizontalShipBounds(shipLength)){
                        return true;
                    } else {
                        for (int i = 0; i < shipLength; i++) {
                            Field.LocalArray[beginningRow][beginningColumn + i] = "O";
                        }
                    }

                }
                if (beginningColumn == endsColumn){
                    if (verticalsShipBounds(shipLength)){
                        return true;
                    } else {
                        for (int i = 0; i < shipLength; i++) {
                            Field.LocalArray[beginningRow + i][beginningColumn] = "O";
                        }
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
    public boolean horizontalShipBounds(int shipLength) {
        for (int n = 0; n < shipLength; n++) {
            try {
                if (Objects.equals(Field.LocalArray[beginningRow][beginningColumn + n], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + 1][beginningColumn + n], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow - 1][beginningColumn + n], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow][beginningColumn + n - 1], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow][beginningColumn + n + 1], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }

        }
        return false;
    }

    public boolean verticalsShipBounds(int shipLength) {
        for (int n = 0; n < shipLength; n++) {
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + n][beginningColumn], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + n][beginningColumn + 1], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + n][beginningColumn - 1], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + n - 1][beginningColumn], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(Field.LocalArray[beginningRow + n + 1][beginningColumn], "O")) {
                    System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }

        }
        return false;
    }
}
