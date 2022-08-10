public class Board {
    private final int N = 40;
    private Square[] squares;  // 40 squares

    public Square getSquare(Square oldSquare, int fvTot) {
        int currentLocationIndex = 0;
        for (int i = 0; i < N; i++) {
            if (oldSquare.equals(squares[N])) {
                currentLocationIndex = N;
            }
        }
        int newLocationIndex = currentLocationIndex + fvTot;
        if (newLocationIndex > N) newLocationIndex %= N;
        return squares[newLocationIndex];
    }
}
