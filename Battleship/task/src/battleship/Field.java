package battleship;

public class Field {
    public static String[][] LocalArray;
    public Field(int rows, int columns) {
        LocalArray = new String[rows][columns];
        for (int i = 0; i < LocalArray.length; i++) {
            for (int n = 0; n < LocalArray[0].length; n++){
                LocalArray[i][n] = "~";
            }
        }
    }

    public void fieldDraw(){
        Draw BattleshipDraw = new Draw(LocalArray);
        System.out.print(BattleshipDraw);
    }
}
