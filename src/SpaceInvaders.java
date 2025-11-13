import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class SpaceInvaders extends JPanel implements ActionListener, KeyListener {

    class Block {
        int x;
        int y;
        int width;
        int height;
        int velocityX;
        Image img;
        boolean alive = true; // invaders
        boolean used = false; // bullets

        Block(int x, int y, int width, int height, Image img){
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.img = img;
        }
    }

    // déclaration du joueur
    Block player;

    Timer gameloop;

    // board
    int tileSize = 32;
    int rows = 16;
    int columns = 16;
    int boardWidth = tileSize * columns;
    int boardHeight = tileSize * rows;

    Image PlayerImg;
    Image InvaderImg;
    Image InvaderImg2;
    Image InvaderImg3;
    ArrayList<Image> InvaderImgArray;

    // player
    int playerWidth = tileSize * 2;
    int playerHeight = tileSize;
    int playerx = tileSize * columns / 2 - tileSize;
    int playery = boardHeight - tileSize * 2;
    int playerVelocityX = tileSize;

    SpaceInvaders(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);
        setFocusable(true);
        addKeyListener(this);

        PlayerImg = new ImageIcon("src/assets/player.png").getImage();
        InvaderImg = new ImageIcon("src/assets/invader1.png").getImage();
        InvaderImg2 = new ImageIcon("src/assets/invader2.png").getImage();
        InvaderImg3 = new ImageIcon("src/assets/invader3.png").getImage();

        InvaderImgArray = new ArrayList<Image>();
        InvaderImgArray.add(InvaderImg);
        InvaderImgArray.add(InvaderImg2);
        InvaderImgArray.add(InvaderImg3);

        player = new Block(playerx, playery, playerWidth, playerHeight, PlayerImg);
        gameloop = new Timer(1000/60, this  );
        gameloop.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // draw player
        g.drawImage(player.img, player.x, player.y, player.width, player.height, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT  && player.x - playerVelocityX >= 0) {
            player.x -= playerVelocityX;
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT  && player.x + playerVelocityX + player.width <= boardWidth) {
            player.x += playerVelocityX;
        }
    }
}
