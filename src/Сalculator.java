import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Сalculator extends JFrame {
    private static String text1 = "";
    private static String sign = "";


    public Сalculator() {
        setLayout(null);
        setSize(300, 400);

        JTextField jTextField = new JTextField();
        jTextField.setEditable(false);
        jTextField.setSize(300, 30);
        jTextField.setLocation(0, 10);
        add(jTextField);


        JButton jButton1 = new JButton("1");
        jButton1.setBackground(new Color(115, 168, 171));
        jButton1.setSize(70, 50);
        jButton1.setLocation(0, 45);
        add(jButton1);
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "1");
            }
        });

        JButton jButton2 = new JButton("2");
        jButton2.setBackground(new Color(115, 168, 171));
        jButton2.setSize(70, 50);
        jButton2.setLocation(70, 45);
        add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "2");
            }
        });

        JButton jButton3 = new JButton("3");
        jButton3.setBackground(new Color(115, 168, 171));
        jButton3.setSize(70, 50);
        jButton3.setLocation(140, 45);
        add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "3");
            }
        });

        JButton jButton4 = new JButton("4");
        jButton4.setBackground(new Color(115, 168, 171));
        jButton4.setSize(70, 50);
        jButton4.setLocation(0, 95);
        add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "4");
            }
        });

        JButton jButton5 = new JButton("5");
        jButton5.setBackground(new Color(115, 168, 171));
        jButton5.setSize(70, 50);
        jButton5.setLocation(70, 95);
        add(jButton5);
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "5");
            }
        });

        JButton jButton6 = new JButton("6");
        jButton6.setBackground(new Color(115, 168, 171));
        jButton6.setSize(70, 50);
        jButton6.setLocation(140, 95);
        add(jButton6);
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "6");
            }
        });

        JButton jButton7 = new JButton("7");
        jButton7.setBackground(new Color(115, 168, 171));
        jButton7.setSize(70, 50);
        jButton7.setLocation(0, 145);
        add(jButton7);
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "7");
            }
        });

        JButton jButton8 = new JButton("8");
        jButton8.setBackground(new Color(115, 168, 171));
        jButton8.setSize(70, 50);
        jButton8.setLocation(70, 145);
        add(jButton8);
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "8");
            }
        });

        JButton jButton9 = new JButton("9");
        jButton9.setBackground(new Color(115, 168, 171));
        jButton9.setSize(70, 50);
        jButton9.setLocation(140, 145);
        add(jButton9);
        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "9");
            }
        });

        JButton jButton0 = new JButton("0");
        jButton0.setBackground(new Color(115, 168, 171));
        jButton0.setSize(70, 50);
        jButton0.setLocation(70, 195);
        add(jButton0);
        jButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + "0");
            }
        });

        JButton jButtonClear = new JButton("Clear");
        jButtonClear.setBackground(new Color(89, 132, 132));
        jButtonClear.setSize(70, 50);
        jButtonClear.setLocation(0, 195);
        add(jButtonClear);
        jButtonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
                text1 = "";
                sign = "";
            }
        });

        JButton jButtonPlus = new JButton("+");
        jButtonPlus.setBackground(new Color(89, 132, 132));
        jButtonPlus.setSize(70, 50);
        jButtonPlus.setLocation(210, 45);
        add(jButtonPlus);
        jButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                sign = "+";
                jTextField.setText("");
            }
        });

        JButton jButtonMinus = new JButton("-");
        jButtonMinus.setBackground(new Color(89, 132, 132));
        jButtonMinus.setSize(70, 50);
        jButtonMinus.setLocation(210, 95);
        add(jButtonMinus);
        jButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                sign = "-";
                jTextField.setText("");
            }
        });

        JButton jButtonMultiply = new JButton("×");
        jButtonMultiply.setBackground(new Color(89, 132, 132));
        jButtonMultiply.setSize(70, 50);
        jButtonMultiply.setLocation(210, 145);
        add(jButtonMultiply);
        jButtonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                sign = "*";
                jTextField.setText("");
            }
        });

        JButton jButtonDivide = new JButton("÷");
        jButtonDivide.setBackground(new Color(89, 132, 132));
        jButtonDivide.setSize(70, 50);
        jButtonDivide.setLocation(210, 195);
        add(jButtonDivide);
        jButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1 = jTextField.getText();
                sign = "/";
                jTextField.setText("");
            }
        });


        JButton jButtonSum = new JButton("=");
        jButtonSum.setBackground(new Color(89, 132, 132));
        jButtonSum.setSize(70, 50);
        jButtonSum.setLocation(140, 195);
        add(jButtonSum);
        jButtonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (sign) {
                    case "+":
                        jTextField.setText(String.valueOf(Integer.parseInt(text1) + Integer.parseInt(jTextField.getText())));
                        break;
                    case "-":
                        jTextField.setText(String.valueOf(Integer.parseInt(text1) - Integer.parseInt(jTextField.getText())));
                        break;
                    case "*":
                        jTextField.setText(String.valueOf(Integer.parseInt(text1) * Integer.parseInt(jTextField.getText())));
                        break;
                    case "/":
                        jTextField.setText(String.valueOf(Integer.parseInt(text1) / Integer.parseInt(jTextField.getText())));
                        break;
                    default:
                        System.out.println("Error! Enter correct operator");
                        break;
                }
            }
        });
        setVisible(true);
    }
}
