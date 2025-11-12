import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //window settings
        int tilesize = 32;
        int rows = 16;
        int collums = 16;
        int boardWidth = tilesize * collums;
        int boardHeight = tilesize * rows;

        JFrame frame = new JFrame("space invaders");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(boardWidth, boardHeight);

        SpaceInvaders spaceInvaders =new SpaceInvaders();
        frame.add(spaceInvaders);
    }
}