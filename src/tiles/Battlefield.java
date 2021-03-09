package tiles;

import java.awt.*;

public class Battlefield extends BoardTiles {

    public Battlefield(int row, int col) {
        super(row, col);
    }

    /**
     * Метод за визуализиране на полетата, от които се състои бойното поле.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int boardTileX = this.col * BOARD_TILE_SIZE;
        int boardTileY = this.row * BOARD_TILE_SIZE;

        g.setColor(Color.decode("#FF7043"));
        g.fillRect(boardTileX + 1, boardTileY + 1, BOARD_TILE_SIZE - 1, BOARD_TILE_SIZE - 1);
    }
}