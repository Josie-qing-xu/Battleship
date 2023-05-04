package battleship;

import java.util.Objects;

public class Shot {

    private final int Row;
    private final int Column;


    public Shot(String shotCoordinates) {
        String[] splitStr = shotCoordinates.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        Row = (int) splitStr[0].charAt(0) - 65;
        Column = Integer.parseInt(splitStr[1]) - 1;
    }

    public boolean shotHit() {
        try {
            if (Objects.equals(Field.LocalArray[Row][Column], "O")) {
                System.out.print("You hit a ship!");
                Field.LocalArray[Row][Column] = "X";
            } else {
                System.out.print("You missed!");
                Field.LocalArray[Row][Column] = "M";
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.print("Error! You entered the wrong coordinates! Try again:\n>");
            return true;
        }

        return false;
    }
}
