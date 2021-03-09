package tiles;

import java.awt.*;

public class PlayerACastle extends BoardTiles {

    public PlayerACastle(int row, int col) {
        super(row, col);
    }

    /**
     * Метод за визуализиране на полетата, от които се състои територията на PlayerA.
     * @param g Graphics object
     */
    @Override
    public void render(Graphics g) {
        super.render(g);

        int boardTileX = this.col * BOARD_TILE_SIZE;
        int boardTileY = this.row * BOARD_TILE_SIZE;

        boolean isRowEven = (row % 2 == 0);
        boolean isColEven = (col % 2 == 0);

        if((!isRowEven && isColEven) || (isRowEven && !isColEven)){
            g.setColor(Color.gray);
        }else{
            g.setColor(Color.lightGray);
        }
        g.fillRect(boardTileX + 1, boardTileY + 1, BOARD_TILE_SIZE - 1, BOARD_TILE_SIZE - 1);
    }
}