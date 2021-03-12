package pieces;

import java.awt.*;

public abstract class  Piece {

    public static final int PIECE_SIZE = 50;
    protected int row;
    protected int col;
    protected String id;
    protected int attack;
    protected int armor;
    protected int health;
    protected int attackSquares;
    protected int speed;
    protected Color color;
    protected Color borderColor;

    public Piece(int row, int col, String id, int attack, int armor, int health, int attackSquares, int speed) {
        this.row = row;
        this.col = col;
        this.id  = id;
        this.attack = attack;
        this.armor  = armor;
        this.health = health;
        this.attackSquares = attackSquares;
        this.speed  = speed;
    }

    /**
     * Метод за визуализиране на фигурите.
     * @param g Graphics object
     */
    public void render(Graphics g){
        int pieceX = this.col * (PIECE_SIZE * 2);
        int pieceY = this.row * (PIECE_SIZE * 2);

        g.setColor(this.borderColor);
        g.fillOval(pieceX + 20,pieceY + 30,60,60);

        g.setColor(this.color);
        g.fillOval(pieceX + 25,pieceY + 35, PIECE_SIZE, PIECE_SIZE);

        g.setColor(Color.WHITE);
        g.drawString(this.id, pieceX + 47, pieceY + 65);
    }
}