import java.awt.Color;
import java.util.Scanner;

import javax.swing.*;

public class main_jframe extends zehntausend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Spieler");
        int anzahl_spieler = 6;

        Player[] player = new Player[anzahl_spieler];

        // Schleife zum Erstellen der Spieler
        for (int i = 0; i < anzahl_spieler; i++) {
            player[i] = new Player();
            System.out.println("\n");
        }

        JFrame frame = new JFrame();
        JPanel player_panel = new JPanel();
        JPanel button_panel = new JPanel();
        JLabel[] player_label_name = new JLabel[6];
        // JLabel[] player_label_points = new JLabel[6];
        JPanel[] list = new JPanel[6];

        for (int i = 0; i < 6; i++) {
            list[i] = new JPanel();
        }

        for (int i = 0; i < 6; i++) {
            player_label_name[i] = new JLabel();
            player_label_name[i].setText("<html>Name: " + player[i].getName() + "<br>Points: "+ Integer.toString(player[i].getPoints()) + "</html>");
            list[i].add(player_label_name[i]);
            // list[i].add(player_label_points[i]);
        }

        int list_distance = 0;

        for (int i = 0; i < 6; i++) {
            list[i].setBounds(list_distance, 25, 200, 200);
            list_distance += 208;
            list[i].setBackground(new Color(0x7195A0));
            player_panel.add(list[i]);
        }

        player_panel.setLayout(null);
        player_panel.setBounds(0, 10, 1250, 250);
        player_panel.setBackground(new Color(0xAEB081));

        button_panel.setLayout(null);
        button_panel.setBounds(0, 275, 1250, 425);
        button_panel.setBackground(Color.white);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Game");
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xC9A58D));
        frame.setOpacity(1f);
        frame.setSize(1250, 750);
        frame.add(player_panel);
        frame.add(button_panel);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
