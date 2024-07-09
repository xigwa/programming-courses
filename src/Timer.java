import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer extends JFrame {
    private javax.swing.Timer timer;
    private int seconds;
    private int minutes;
    private boolean isRunning;

    public Timer() {
        setLayout(null);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Timer");

        JLabel timerLabel = new JLabel("Timer", SwingConstants.CENTER);
        timerLabel.setFont(timerLabel.getFont().deriveFont(24.0f));
        timerLabel.setBounds(20, 20, 260, 50);

        add(timerLabel);

        JButton startStopButton = new JButton("Start");
        startStopButton.setFont(startStopButton.getFont().deriveFont(18.0f));
        startStopButton.setBounds(20, 100, 120, 40);
        startStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRunning) {
                    timer.stop();
                    startStopButton.setText("Start");
                } else {
                    timer.start();
                    startStopButton.setText("Stop");
                }
                isRunning = !isRunning;
            }
        });

        add(startStopButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setFont(resetButton.getFont().deriveFont(18.0f));
        resetButton.setBounds(160, 100, 120, 40);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                seconds = 0;
                minutes = 0;
                isRunning = false;
                startStopButton.setText("Start");
                timerLabel.setText("Minute: " + minutes + " Second: " + seconds);
            }
        });
        add(resetButton);

        seconds = 0;
        minutes = 0;
        isRunning = false;
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTimer();
                timerLabel.setText("Minute: " + minutes + " Second: " + seconds);
            }
        });
        setVisible(true);
    }

    private void updateTimer() {
        seconds++;
        if (seconds >= 60) {
            minutes++;
            seconds -= 60;
        }
    }
}
