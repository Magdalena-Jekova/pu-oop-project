package pieces;

import java.awt.*;

public class Knight extends Piece {

    public Knight(int row, int col, Color color, Color borderColor) {
        super(row, col,"K", 8, 3, 15, 1, 1);
        this.color = color;
        this.borderColor = borderColor;
    }
}