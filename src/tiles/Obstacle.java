package tiles;

import java.awt.*;

public class Obstacle extends BoardTiles {

    public Obstacle(int row, int col) {
        super(row, col);
        this.color = Color.BLACK;
    }
}