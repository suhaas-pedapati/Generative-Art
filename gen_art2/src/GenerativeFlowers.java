/*
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GenerativeFlowers extends JFrame {

    public GenerativeFlowers() {
        setTitle("Generative Flowers");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            int size = rand.nextInt(50) + 10;
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            g.setColor(color);
            g.fillOval(x, y, size, size);
        }
    }

    public static void main(String[] args) {
        new GenerativeFlowers();
    }
}
*/