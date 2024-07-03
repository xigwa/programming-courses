import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Paint extends JFrame {
    private Color currentColor = Color.BLACK;
    private BufferedImage canvas;
    private Graphics2D g2;
    private boolean erasing;

    public Paint() {
        setTitle("Simple Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas = new BufferedImage(800, 600, BufferedImage.TYPE_INT_RGB);
        g2 = canvas.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(Color.WHITE);
        g2.fillRect(0, 0, 800, 600);
        g2.setPaint(currentColor);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(canvas, 0, 0, null);
            }
        };

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (erasing) {
                    int eraseSize = 20;
                    int x = e.getX() - eraseSize / 2;
                    int y = e.getY() - eraseSize / 2;
                    g2.setPaint(Color.WHITE);
                    g2.fillRect(x, y, eraseSize, eraseSize);
                    g2.setPaint(currentColor);
                    panel.repaint();
                } else {
                    int size = 4;
                    int x = e.getX() - size / 2;
                    int y = e.getY() - size / 2;
                    g2.fillOval(x, y, size, size);
                    panel.repaint();
                }
            }
        });

        add(panel, BorderLayout.CENTER);

        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);

        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> {
            g2.setPaint(Color.WHITE);
            g2.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            g2.setPaint(currentColor);
            panel.repaint();
        });
        toolBar.add(clearButton);

        JButton eraseButton = new JButton("Grater");
        eraseButton.addActionListener(e -> {
            erasing = true;
        });
        toolBar.add(eraseButton);

        JButton drawButton = new JButton("Brush");
        drawButton.addActionListener(e -> {
            erasing = false;
        });
        toolBar.add(drawButton);

        JColorChooser jColorChooser = new JColorChooser(currentColor);
        JPanel colorChooserPanel = new JPanel(new BorderLayout());
        colorChooserPanel.setPreferredSize(new Dimension(200, 200));
        colorChooserPanel.setLocation(10, 25);
        jColorChooser.getSelectionModel().addChangeListener(e -> {
            currentColor = jColorChooser.getColor();
            g2.setPaint(currentColor);
        });
        toolBar.add(jColorChooser);

        add(toolBar, BorderLayout.NORTH);
        setVisible(true);
    }

}
