package battleship;

// print GameField

public class GameField {
    public static String[][] LocalArray;
    public GameField(int rows, int columns) {
        GameField.LocalArray = new String[rows][columns];
    }

    public String toString(){//overriding the toString() method
        StringBuilder sb = new StringBuilder();
        sb.append("  ");

        // the first row should contain numbers from 1 to 10 indicating the column
        for (int c = 1; c < GameField.LocalArray.length; c++) {
            sb.append(c).append(" ");
        }
        sb.append('\n');

        for (int r = 0; r < GameField.LocalArray.length; r++) {
            //the first column should contain letters from A to J indicating the row. Convert ASCII code to a character.
            sb.append(Character.toString(r + 65)).append(" ");

            //The symbol ~ denotes the fog of war
            sb.append(("~" + " ").repeat(Math.max(0, GameField.LocalArray[0].length - 1)));
            sb.append('\n');
        }
        return sb.toString();
    }

}
