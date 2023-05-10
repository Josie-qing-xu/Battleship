package battleship;

import java.util.*;

import static battleship.Main.Coordinates;
import static java.lang.Math.abs;


class Ships {

    private final Field field;
    private final String shipName;
    private  int beginningRow;
    private  int beginningColumn;
    private  int endRow;
    private  int endsColumn;




    Ships(String shipName,String shipCoordinates,Field field) {

        this.field = field;
        this.shipName = shipName;

        String coordinates = shipCoordinates.replaceAll("\\s+", "");
        String[] splitStr = coordinates.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

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

    public boolean ship(int shipLength) {

        if (beginningRow == endRow || beginningColumn == endsColumn) {
            if (abs(beginningRow - endRow) == shipLength - 1 || abs(beginningColumn - endsColumn) == shipLength - 1) {
                if (beginningRow == endRow){
                    if (horizontalShipBounds(shipLength)){
                        System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                        return true;
                    } else {

                        for (int i = 0; i < shipLength; i++) {
                            int Row = beginningRow;
                            int Column = beginningColumn+i;

                            field.LocalArray[Row][Column] = "O";
                            // add dict value
                            Coordinates.put(Integer.toString(Row)+ Column, shipName);

                        }


                    }

                }
                if (beginningColumn == endsColumn){
                    if (verticalsShipBounds(shipLength)){
                        System.out.print("Error! You placed it too close to another one. Try again:\n> ");
                        return true;
                    } else {
                        for (int i = 0; i < shipLength; i++) {
                            field.LocalArray[beginningRow + i][beginningColumn] = "O";
                        }
                    }
                }

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
                if (Objects.equals(field.LocalArray[beginningRow][beginningColumn + n], "O")) {

                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow + 1][beginningColumn + n], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow - 1][beginningColumn + n], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow][beginningColumn + n - 1], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow][beginningColumn + n + 1], "O")) {
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
                if (Objects.equals(field.LocalArray[beginningRow + n][beginningColumn], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow + n][beginningColumn + 1], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow + n][beginningColumn - 1], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow + n - 1][beginningColumn], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }
            try {
                if (Objects.equals(field.LocalArray[beginningRow + n + 1][beginningColumn], "O")) {
                    return true;
                }
            } catch (Exception ArrayIndexOutOfBoundsException) {
                assert true;
            }

        }
        return false;
    }
}
