import java.awt.Color;

import javax.swing.*;

public class main_jframe extends zehntausend {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel player = new JPanel();
        JPanel[] list = new JPanel[6];

        for (int i = 0; i < 6; i++) {
            list[i] = new JPanel();
        }

        int list_distance = 0;

        for (int i = 0; i < 6; i++) {
            list[i].setBounds(list_distance, 25, 200, 200);
            list_distance += 208;
            list[i].setBackground(new Color(0x7195A0));
            player.add(list[i]);
        }

        player.setLayout(null);
        player.setBounds(0, 10, 1250, 250);
        player.setBackground(new Color(0xAEB081));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Game");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xC9A58D));
        frame.setOpacity(1f);
        frame.setSize(1250, 750);
        frame.add(player);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
