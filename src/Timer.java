import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Timer {
    private int seconds;
    private int minutes;
    private boolean isRunning;
    private TimerListener listener;

    public Timer(TimerListener listener) {
        this.listener = listener;
        this.seconds = 0;
        this.minutes = 0;
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        listener.onStart();
    }

    public void stop() {
        isRunning = false;
        listener.onStop();
    }

    public void reset() {
        stop();
        seconds = 0;
        minutes = 0;
        listener.onReset();
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void tick() {
        if (isRunning) {
            seconds++;
            if (seconds >= 60) {
                minutes++;
                seconds -= 60;
            }
            listener.onTick(minutes, seconds);
        }
    }
}

interface TimerListener {
    void onStart();
    void onStop();
    void onReset();
    void onTick(int minutes, int seconds);
}

class TimerUI extends JFrame implements TimerListener {
    private JLabel timerLabel;
    private JButton startStopButton;
    private Timer timer;
    private javax.swing.Timer swingTimer;

    public TimerUI() {
        timer = new Timer(this);
        setupUI();
    }

    private void setupUI() {
        setLayout(null);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Timer");

        timerLabel = new JLabel("Timer", SwingConstants.CENTER);
        timerLabel.setFont(timerLabel.getFont().deriveFont(24.0f));
        timerLabel.setBounds(20, 20, 260, 50);
        add(timerLabel);

        startStopButton = new JButton("Start");
        startStopButton.setFont(startStopButton.getFont().deriveFont(18.0f));
        startStopButton.setBounds(20, 100, 120, 40);
        startStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer.isRunning()) {
                    timer.stop();
                } else {
                    timer.start();
                }
            }
        });
        add(startStopButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setFont(resetButton.getFont().deriveFont(18.0f));
        resetButton.setBounds(160, 100, 120, 40);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.reset();
            }
        });
        add(resetButton);

        swingTimer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.tick();
            }
        });
        setVisible(true);
    }

    @Override
    public void onStart() {
        startStopButton.setText("Stop");
        swingTimer.start();
    }

    @Override
    public void onStop() {
        startStopButton.setText("Start");
        swingTimer.stop();
    }

    @Override
    public void onReset() {
        startStopButton.setText("Start");
        timerLabel.setText("Minute: 0 Second: 0");
    }

    @Override
    public void onTick(int minutes, int seconds) {
        timerLabel.setText("Minute: " + minutes + " Second: " + seconds);
    }
}

