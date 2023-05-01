package battleship;

public class Main {

    public static void main(String[] args) {
        // Create a 10x10 field
        int BattleshipRows = 10;
        int BattleshipColumns = 10;
        Field BattleshipField = new Field(BattleshipRows,BattleshipColumns);
        BattleshipField.fieldDraw();

    }
}
