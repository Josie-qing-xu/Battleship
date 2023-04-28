package battleship;

public class Main {

    public static void main(String[] args) {
        // Create a 10x10 field
        int BattleshipRows = 11;
        int BattleshipColumns = 11;
        GameField BattleshipField = new GameField(BattleshipRows,BattleshipColumns);
        System.out.println(BattleshipField);
    }
}
