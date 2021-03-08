package tiles;

import java.awt.*;

public class BoardTiles {

    public static final int BOARD_TILE_SIZE = 100;
    protected int row;
    protected int col;
    protected Color color;
    protected String id;

    public BoardTiles(int row, int col){
        this.row = row;
        this.col = col;
    }

    public String getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Color getColor() {
        return color;
    }

    /**
     * Метод за визуализиране на полетата на дъската.
     * @param g Graphics object
     */
    public void render(Graphics g){
        int boardTileX = this.col * BOARD_TILE_SIZE;
        int boardTileY = this.row * BOARD_TILE_SIZE;

        g.setColor(Color.BLACK);
        g.fillRect(boardTileX, boardTileY, BOARD_TILE_SIZE, BOARD_TILE_SIZE);

        g.setColor(getColor());
        g.fillRect(boardTileX + 1, boardTileY + 1, BOARD_TILE_SIZE - 1, BOARD_TILE_SIZE - 1);
    }
}