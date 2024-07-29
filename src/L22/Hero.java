package L22;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Hero extends JLabel {
    int w = 88;
    int h = 200;
    int currentX = 0;
    private Image originalImage = null;

    public Hero() {
        try {
            originalImage = ImageIO.read(new File("src/Image/pngwing.com.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        setSize(w, h);
        new BaseAnim().start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(originalImage, currentX, -50, this);
    }

    public void move(int x, int y) {
        setBounds(x, y, w, h);
        repaint();
    }

    public void jump() {
        new Jump().start();
    }

    class Jump extends Thread {
        int[] yJump = {2, 12, 15, -1, -3, -7, -15, -3, -1};
        int[] xJump = {3, 3, 2, 2, 1, 2, 3, 4, 5};

        @Override
        public void run() {
            for (int i = 0; i < yJump.length; i++) {
                setBounds(getX() + xJump[i], getY() - yJump[i], w, h);
                try {
                    sleep(1000 / 25);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class BaseAnim extends Thread {
        int count = 0;

        @Override
        public void run() {
            while (true) {
                count++;
                if (count == 4) {
                    currentX = 0;
                    count = 0;
                } else {
                    currentX -= w;
                }

                repaint();
                try {
                    sleep(1000 / 5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}