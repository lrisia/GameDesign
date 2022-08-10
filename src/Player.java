public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private Die[] die;  // 2 die

    public void takeTurn() {
        Square oldLoc, newLoc;
        int fv = 0;
        for (Die dice: die) {
            dice.roll();
            fv += dice.getFaceValue();
        }
        oldLoc = piece.getLocation();
        newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
        return;
    }
}
