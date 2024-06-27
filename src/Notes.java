import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class Notes extends JFrame implements MouseListener, ActionListener, MouseMotionListener {

    private int countjLabel = 90;
    private JLabel currentLabel;
    private Map<JLabel, String> labelTexts = new HashMap<>();

    private JTextField jTextField = new JTextField();

    public Notes() {
        setLayout(null);
        setSize(500, 500);
        setTitle("Notes");
        getContentPane().setBackground(Color.LIGHT_GRAY);
        ui();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void ui() {
        JButton jButtonAdd = new JButton("Add");
        jButtonAdd.setBounds(50, 50, 60, 50);
        add(jButtonAdd);

        jTextField.setBounds(110, 50, 90, 50);
        add(jTextField);

        jButtonAdd.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String labelName = jTextField.getText();

        JLabel jLabel = new JLabel();
        jLabel.setText(labelName);
        jLabel.setBounds(110, countjLabel, 90, 50);
        jLabel.addMouseListener(this);
        jLabel.addMouseMotionListener(this);

        // Добавляем контекстное меню для метки
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem deleteItem = new JMenuItem("Delete");
        deleteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(Notes.this, "Are you sure you want to delete this note?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    getContentPane().remove(jLabel);
                    labelTexts.remove(jLabel);
                    revalidate();
                    repaint();
                }
            }
        });
        popupMenu.add(deleteItem);
        jLabel.setComponentPopupMenu(popupMenu);

        add(jLabel);
        labelTexts.put(jLabel, "");

        // Очистка текстового поля
        jTextField.setText("");

        repaint();
        countjLabel += 30;
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        currentLabel = (JLabel) e.getSource();
        String labelName = currentLabel.getText();
        String editableText = labelTexts.get(currentLabel);

        // Создаем диалоговое окно для редактирования текста
        JFrame editFrame = new JFrame("Edit Text");
        editFrame.setSize(300, 200);
        editFrame.setLayout(new BorderLayout());

        JTextArea editArea = new JTextArea(editableText);
        editFrame.add(editArea, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton saveButton = new JButton("Save");
        JButton dontSaveButton = new JButton("Don't Save");
        JButton deleteButton = new JButton("Delete");
        buttonPanel.add(saveButton);
        buttonPanel.add(dontSaveButton);
        buttonPanel.add(deleteButton);
        editFrame.add(buttonPanel, BorderLayout.SOUTH);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelTexts.put(currentLabel, editArea.getText());
                editFrame.dispose();
            }
        });

        dontSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editFrame.dispose();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int option = JOptionPane.showConfirmDialog(Notes.this, "Are you sure you want to delete this note?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    getContentPane().remove(currentLabel);
                    labelTexts.remove(currentLabel);
                    editFrame.dispose();
                    revalidate();
                    repaint();
                }
            }
        });

        editFrame.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentLabel = (JLabel) e.getSource();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        currentLabel = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setForeground(Color.CYAN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JLabel label = (JLabel) e.getSource();
        label.setForeground(Color.BLACK);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (currentLabel != null) {
            int x = e.getX() + currentLabel.getX();
            int y = e.getY() + currentLabel.getY();
            currentLabel.setLocation(x, y);
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
