package battleship;

import java.util.Objects;

public class Shot {

    private final Field field;
    private final Field fogfield;
    private final int Row;
    private final int Column;


    public Shot(String shotCoordinates, Field field, Field fogfield) {

        this.field = field;
        this.fogfield = fogfield;
        String[] splitStr = shotCoordinates.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        Row = (int) splitStr[0].charAt(0) - 65;
        Column = Integer.parseInt(splitStr[1]) - 1;
    }

    public boolean shotHit() {
        try {

            if (Objects.equals(field.LocalArray[Row][Column], "O")) {

                fogfield.LocalArray[Row][Column] = "X";

                fogfield.fieldDraw();
                System.out.print("You hit a ship! Try again:\n> ");
            } else {

                fogfield.LocalArray[Row][Column] = "M";

                fogfield.fieldDraw();
                System.out.print("You missed! Try again:\n> ");
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.print("Error! You entered the wrong coordinates! Try again:\n> ");

        }

        return true;
    }
}
