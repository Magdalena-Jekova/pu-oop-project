package pieces;

public abstract class  Piece {

    protected int row;
    protected int col;
    protected String id;
    protected int attack;
    protected int armor;
    protected int health;
    protected int attackSquares;
    protected int speed;

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
}