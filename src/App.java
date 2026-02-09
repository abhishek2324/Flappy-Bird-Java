import javax.swing.*;

/**
 * Entry point for the Flappy Bird game. Creates the main window and game panel.
 */
public class App {

    private static final int WINDOW_WIDTH = 360;
    private static final int WINDOW_HEIGHT = 640;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird - Java");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        frame.setVisible(true);
    }
}
// use this cmmnd to run this project  cd "c:\Users\ar626\Downloads\Flappy-Bird-JAVA-main\Flappy-Bird-JAVA-main"
// .\run.ps1