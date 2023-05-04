package battleship;
import java.util.*;
import java.util.Hashtable;


public class Main {

    public static Field BattleshipField;
    public static Hashtable<String, Integer>  ship_dict = new Hashtable<>();


    public static void main(String[] args) {

        // Create a 10x10 field
        int BattleshipRows = 10;
        int BattleshipColumns = 10;
        BattleshipField = new Field(BattleshipRows,BattleshipColumns);
        BattleshipField.fieldDraw();
        ship_dict.put("Aircraft Carrier", 5);
        ship_dict.put("Battleship", 4);
        ship_dict.put("Submarine", 3);
        ship_dict.put("Cruiser", 3);
        ship_dict.put("Destroyer", 2);
        String[] shipList = {"Aircraft Carrier", "Battleship", "Submarine", "Cruiser","Destroyer"};


        Scanner coordinates = new Scanner(System.in);

        for (String shipname : shipList) {
            Integer shipLength = ship_dict.get(shipname);
            System.out.printf("Enter the coordinates of the %s (%d cells): \n> ",shipname,shipLength);
            boolean result;
            do {
                String shipCoordinates = coordinates.nextLine();
                Ships battleship = new Ships(shipCoordinates);
                result = battleship.shipDraw(shipLength);
            }while (result);
        }

        System.out.print("\nThe game starts!\n");
        BattleshipField.fieldDraw();
        System.out.print("\nTake a shot!\n>");
        boolean hit;
        do {
            String shotCoordinates = coordinates.nextLine();
            Shot shell = new Shot(shotCoordinates);
            hit = shell.shotHit();

        }while (hit);
        BattleshipField.fieldDraw();
    }
}
