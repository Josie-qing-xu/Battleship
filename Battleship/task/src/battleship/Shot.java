package battleship;

import java.util.Objects;
import static battleship.Main.Coordinates;
import static battleship.Main.shipDict;


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
        String shipName = Coordinates.get(Integer.toString(Row) + Column);
        try {

            if (Objects.equals(field.LocalArray[Row][Column], "O")) {
                if (!Objects.equals(fogfield.LocalArray[Row][Column], "X")){

                    fogfield.LocalArray[Row][Column] = "X";

                    shipDict.put(shipName, shipDict.get(shipName) - 1);
                }

                fogfield.fieldDraw();
                if (shipDict.get(shipName) == 0){
                    int sum = 0;
                    for (String key : shipDict.keySet()) {

                        sum = sum + shipDict.get(key);
                    }
                    if (sum == 0){
                        System.out.print("You sank the last ship. You won. Congratulations!");
                        return false;
                    }
                    System.out.print("You sank a ship! Specify a new target:\n> ");
                } else {
                    System.out.print("You hit a ship! Try again:\n> ");
                }
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
