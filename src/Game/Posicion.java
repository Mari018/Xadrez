package Game;

public class Posicion {
    private final int col;
    private final int row;

    public Posicion(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean equals(Object other) {
        boolean result = false;

        if (other instanceof Posicion that) {
            result = (getCol() ==that.getCol() && getRow() == that.getRow());
        }

        return result;
    }
}
