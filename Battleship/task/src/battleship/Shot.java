package battleship;

import java.util.Objects;

import static battleship.Main.BattleshipCoverFog;

public class Shot {

    private final Field ship;
    private final Field fog;
    private final int Row;
    private final int Column;


    public Shot(String shotCoordinates, Field ship, Field fog) {

        this.ship = ship;
        this.fog = fog;
        String[] splitStr = shotCoordinates.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        Row = (int) splitStr[0].charAt(0) - 65;
        Column = Integer.parseInt(splitStr[1]) - 1;
    }

    public boolean shotHit() {
        try {

            if (Objects.equals(ship.LocalArray[Row][Column], "O")) {

                fog.LocalArray[Row][Column] = "X";

                BattleshipCoverFog.fieldDraw();
                System.out.print("You hit a ship! Try again:\n> ");
            } else {

                fog.LocalArray[Row][Column] = "M";

                BattleshipCoverFog.fieldDraw();
                System.out.print("You missed! Try again:\n> ");
            }
        }
        catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.print("Error! You entered the wrong coordinates! Try again:\n> ");

        }

        return true;
    }
}
