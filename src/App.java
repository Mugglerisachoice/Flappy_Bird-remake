import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;
        //entry Jframe Pop up window
        JFrame frame = new JFrame("Flappy Bird");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//on close Jframe disapears

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}

