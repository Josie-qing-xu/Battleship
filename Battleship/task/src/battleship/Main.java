package battleship;
import java.util.*;


public class Main {

    public static Field BattleshipField;
    public static Field BattleshipFogField;

    public static Map<String, Integer>  shipDict = new HashMap<>();
    public static  Map<String, String> Coordinates = new HashMap<>();

    public static void main(String[] args) {


        // Create a 10x10 field
        int BattleshipRows = 10;
        int BattleshipColumns = 10;
        BattleshipField = new Field(BattleshipRows,BattleshipColumns);
        BattleshipFogField = new Field(BattleshipRows,BattleshipColumns);
        BattleshipField.fieldDraw();
        shipDict.put("Aircraft Carrier", 5);
        shipDict.put("Battleship", 4);
        shipDict.put("Submarine", 3);
        shipDict.put("Cruiser", 3);
        shipDict.put("Destroyer", 2);
        String[] shipList = {"Aircraft Carrier", "Battleship", "Submarine", "Cruiser","Destroyer"};


        Scanner coordinates = new Scanner(System.in);

        for (String shipName : shipList) {
            Integer shipLength = shipDict.get(shipName);
            System.out.printf("Enter the coordinates of the %s (%d cells): \n> ",shipName,shipLength);
            boolean result;
            do {
                String shipCoordinates = coordinates.nextLine();
                Ships battleship = new Ships(shipName,shipCoordinates,BattleshipField);
                result = battleship.ship(shipLength);
                if (!result){
                    BattleshipField.fieldDraw();
                }

            }while (result);
        }

        System.out.print("\nThe game starts!\n");
        BattleshipFogField.fieldDraw();


        System.out.print("\nTake a shot!\n>");
        boolean hit;
        do {
            String shotCoordinates = coordinates.nextLine();
            Shot shell = new Shot(shotCoordinates,BattleshipField,BattleshipFogField);
            hit = shell.shotHit();
        }while (hit);

    }
}
