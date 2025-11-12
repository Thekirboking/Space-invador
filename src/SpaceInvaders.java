import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SpaceInvaders extends JPanel{
    //board
    int tilesize = 32;
    int rows = 16;
    int collums = 16;
    int boardWidth = tilesize * collums;
    int boardHeight = tilesize * rows;

    SpaceInvaders(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.black);
        JFrame frame = new JFrame("Space Invaders");

    }
}
