package battleship;


public class Draw {

    private final String[][] field;

    public Draw(String[][] LocalArray) {
        field = LocalArray;

    }
    public String toString(){//overriding the toString() method
        StringBuilder sb = new StringBuilder();
        sb.append("  ");

        // the first row should contain numbers from 1 to 10 indicating the column
        for (int c = 1; c <= field.length; c++) {
            sb.append(c).append(" ");
        }
        sb.append('\n');

        for (int r = 0; r < field.length; r++) {
            //the first column should contain letters from A to J indicating the row. Convert ASCII code to a character.
            sb.append(Character.toString(r + 65)).append(" ");

            //The symbol ~ denotes the fog of war
            for (int n = 0; n < field[0].length; n++){
                sb.append(field[r][n]).append(" ");
            }
            sb.append('\n');
        }
        return sb.toString();
    }

}
