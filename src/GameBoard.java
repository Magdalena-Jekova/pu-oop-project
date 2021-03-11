import tiles.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameBoard extends JFrame{

    public static final int BOARD_WIDTH  = 9;
    public static final int BOARD_HEIGHT = 7;
    private BoardTiles[][] boardTiles;

    public GameBoard() {
        this.boardTiles = new BoardTiles[BOARD_HEIGHT][BOARD_WIDTH];

        this.setBoardTiles();

        this.setTitle("Knights / Elfs / Dwarfs");
        this.setSize(900, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * Метод за визуализиране на всички полета върху дъската.
     * @param g Graphics object
     */
    @Override
    public void paint(Graphics g) {
        for(int row = 0; row < 7; row++){
            for(int col = 0; col < 9; col++){
                BoardTiles tile = boardTiles[row][col];
                tile.render(g);
            }
        }
    }

    /**
     * Метод, при извикването на който се инициализират всички полета върху дъската.
     */
    private void setBoardTiles(){
        setPlayerAField();
        setBattlefield();
        setPlayerBField();
        setObstacles();
    }

    /**
     * Метод за инициализиране на полетата на PlayerA върху дъската.
     */
    private void setPlayerAField(){

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 9; col++){
                    this.boardTiles[row][col] = new PlayerACastle(row, col);
            }
        }
    }

    /**
     * Метод за инициализиране на полетата, от които се състои бойното поле.
     */
    private void setBattlefield(){

        for(int row = 2; row < 5; row++){
            for(int col = 0; col < 9; col++){
                this.boardTiles[row][col] = new Battlefield(row, col);
            }
        }
    }

    /**
     * Метод за инициализиране на препятствията на случайни позиции върху бойното поле.
     */
    private void setObstacles(){

        Random random = new Random();
        int randomObstacles = random.nextInt(5);

        for(int row = 0; row <= randomObstacles; row++){

            int randomRow = random.nextInt(3) + 2;
            int randomCol = random.nextInt(9);

            this.boardTiles[randomRow][randomCol] = new Obstacle(randomRow, randomCol);
        }
    }

    /**
     * Метод за инициализиране на полетата на PlayerB върху дъската.
     */
    private void setPlayerBField(){

        for(int row = 5; row < 7; row++){
            for(int col = 0; col < 9; col++){
                this.boardTiles[row][col] = new PlayerBCastle(row, col);
            }
        }
    }
}