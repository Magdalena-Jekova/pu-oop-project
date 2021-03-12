package pieces;

import java.awt.*;

public class Elf extends Piece {

    public Elf(int row, int col, Color color, Color borderColor) {
        super(row, col, "E", 5, 1, 10, 3, 3);
        this.color = color;
        this.borderColor = borderColor;
    }
}