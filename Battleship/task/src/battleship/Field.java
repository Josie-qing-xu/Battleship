package battleship;
class Field {
    String[][] LocalArray;
    Field(int rows, int columns) {
        LocalArray = new String[rows][columns];
        for (int i = 0; i < LocalArray.length; i++) {
            for (int n = 0; n < LocalArray[0].length; n++){
                LocalArray[i][n] = "~";
            }
        }
    }

    void fieldDraw(){
        Draw BattleshipDraw = new Draw(LocalArray);
        System.out.print(BattleshipDraw);
    }
}
