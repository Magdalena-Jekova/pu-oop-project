package pieces;

import java.awt.*;

public class Dwarf extends Piece {

    public Dwarf(int row, int col, Color color, Color borderColor) {
        super(row, col,"D", 6, 2, 12, 2, 2);
        this.color = color;
        this.borderColor = borderColor;
    }
}