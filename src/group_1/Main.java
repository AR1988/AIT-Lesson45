package group_1;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        Timer timer1 = new Timer();
        timer1.scheduleAtFixedRate(new TimerTask() {
            int i = 20;
            public void run() {
                label1.setText("Таймер 1 - осталось : " + i + " сек.");
                i--;
                if (i < 0) {
                    timer1.cancel();
                    label1.setText("Таймер 1 - время вышло");
                }
            }
        }, 0, 1000);

        JLabel label2 = new JLabel();
        Timer timer2 = new Timer();
        timer2.scheduleAtFixedRate(new TimerTask() {
            int i = 0;
            public void run() {
                label2.setText("Таймер 2 - прошло : " + i + " сек.");
                i++;
            }
        }, 0, 1000);

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setBounds(500, 300, 300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label1, BorderLayout.NORTH);
        frame.add(label2, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
