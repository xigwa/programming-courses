package L22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UI extends JFrame implements KeyListener {
    private Hero hero = new Hero();

    public UI() {
        setLayout(null);
        setTitle("Hero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/Image/photo_2024-07-25_18-43-01.jpg");
        setIconImage(icon.getImage());

        hero.setBounds(0, 0, hero.getWidth(), hero.getHeight());
        add(hero);

        addKeyListener(this);
        setBounds(100, 100, 800, 700);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                hero.move(hero.getX() + 10, hero.getY());
                break;
            case KeyEvent.VK_LEFT:
                hero.move(hero.getX() - 10, hero.getY());
                break;
            case KeyEvent.VK_UP:
                hero.move(hero.getX(), hero.getY() - 10);
                break;
            case KeyEvent.VK_DOWN:
                hero.move(hero.getX(), hero.getY() + 10);
                break;
            case KeyEvent.VK_SPACE:
                hero.jump();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}