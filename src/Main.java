// java
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int tilesize = 32;
        int rows = 16;
        int collums = 16;
        int boardWidth = tilesize * collums;
        int boardHeight = tilesize * rows;

        JFrame frame = new JFrame("space invaders");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeight);
        frame.setResizable(false);

        SpaceInvaders spaceInvaders = new SpaceInvaders();
        frame.add(spaceInvaders);

        frame.pack();                         // calcule la taille d'après le preferredSize du panneau
        frame.setLocationRelativeTo(null);    // centre la fenêtre maintenant que sa taille est connue
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
