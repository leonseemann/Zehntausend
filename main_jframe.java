import java.awt.Color;
import java.util.Scanner;

import javax.swing.*;

public class main_jframe extends zehntausend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Erfolgreich Gestartet");
        zehntausend playerpick = new zehntausend();
        int anzahl_spieler = 6;

        Player[] player = new Player[anzahl_spieler];

        // Schleife zum Erstellen der Spieler
        for (int i = 0; i < anzahl_spieler; i++) {
            player[i] = new Player();
        }

        JFrame frame = new JFrame();


        JFrame custom_input = new JFrame();
        JTextField custom_textfield = new JTextField();
        JButton custom_testfield_button = new JButton();

        JPanel player_panel = new JPanel();
        JPanel button_panel = new JPanel();

        JButton button_one = new JButton();
        JButton button_five = new JButton();
        JButton button_street = new JButton();
        JButton button_3mal2 = new JButton();
        JButton button_3mal3 = new JButton();
        JButton button_3mal4 = new JButton();
        JButton button_3mal5 = new JButton();
        JButton button_3mal6 = new JButton();

        JButton button_nextPlayer = new JButton();
        JButton button_custom = new JButton();
        JButton button_reset = new JButton();

        JLabel[] player_label_name = new JLabel[6];
        JPanel[] list = new JPanel[6];

        for (int i = 0; i < 6; i++) {
            list[i] = new JPanel();
        }

        for (int i = 0; i < 6; i++) {
            player_label_name[i] = new JLabel();
            player_label_name[i].setText("<html>Name: " + player[i].getName() + "<br>Points: "
                    + Integer.toString(player[i].getPoints()) + "</html>");
            list[i].add(player_label_name[i]);
        }

        // ---------------------------Player Panel for Stats
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

        // ----------------------------------Buttons
        int button_abstand = 15;
        playerpick.setPlayer(0);
        // ---------------Button - 1
        button_one.setBounds(210 + button_abstand, 0, 200, 200);
        button_one.setText("One");
        button_one.addActionListener(e -> {
            eins(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(100);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ---------------Button - 5
        button_five.setBounds(0 + button_abstand, 0, 200, 200);
        button_five.setText("Five");
        button_five.addActionListener(e -> {
            fuenf(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(50);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ---------------Button - street
        button_street.setBounds(420 + button_abstand, 0, 200, 200);
        button_street.setText("Street");
        button_street.addActionListener(e -> {
            strasse(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(2000);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ---------------Button - 3x2
        button_3mal2.setBounds(630 + button_abstand, 0, 200, 200);
        button_3mal2.setText("3x2");
        button_3mal2.addActionListener(e -> {
            dreimalzwei(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(200);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ---------------Button - 3x3
        button_3mal3.setBounds(0 + button_abstand, 210, 200, 200);
        button_3mal3.setText("3x3");
        button_3mal3.addActionListener(e -> {
            dreimaldrei(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(300);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // --------------Button - 3x4
        button_3mal4.setBounds(210 + button_abstand, 210, 200, 200);
        button_3mal4.setText("3x4");
        button_3mal4.addActionListener(e -> {
            dreimalvier(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(400);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // --------------Button - 3x5
        button_3mal5.setBounds(420 + button_abstand, 210, 200, 200);
        button_3mal5.setText("3x5");
        button_3mal5.addActionListener(e -> {
            dreimalfuenf(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(500);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // --------------Button - 3x6
        button_3mal6.setBounds(630 + button_abstand, 210, 200, 200);
        button_3mal6.setText("3x6");
        button_3mal6.addActionListener(e -> {
            dreimalsechs(player[playerpick.getPlayer()]);
            playerpick.addResetPoints(600);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ------------Button next Player

        button_nextPlayer.setBounds(1025 + button_abstand, 0, 175, 410);
        button_nextPlayer.setText("Next Player");
        button_nextPlayer.addActionListener(e -> {
            playerpick.setResetPoints(0);
            if (playerpick.getPlayer() == 6 - 1) {
                playerpick.setPlayer(0);
            } else {
                playerpick.setPlayer(playerpick.getPlayer() + 1);
            }
        });

        // --------------Button - costom
        button_custom.setBounds(840 + button_abstand, 0, 175, 200);
        button_custom.setText("Costom");
        button_custom.addActionListener(e -> {
            custom_input.setVisible(true);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // --------------Button - reset
        button_reset.setBounds(840 + button_abstand, 210, 175, 200);
        button_reset.setText("Undo");
        button_reset.addActionListener(e -> {
            costom(player[playerpick.getPlayer()], - playerpick.getResetPoints());
            playerpick.setResetPoints(0);

            player_label_name[playerpick.getPlayer()].setText("<html>Name: " + player[playerpick.getPlayer()].getName()
                    + "<br>Points: " + Integer.toString(player[playerpick.getPlayer()].getPoints()) + "</html>");
            list[playerpick.getPlayer()].add(player_label_name[playerpick.getPlayer()]);
        });

        // ------------------- Panel for Buttons
        button_panel.setLayout(null);
        button_panel.setBounds(0, 275, 1250, 425);
        button_panel.setBackground(new Color(0xC9A58D));

        // --------------Add Buttons
        button_panel.add(button_one);
        button_panel.add(button_five);
        button_panel.add(button_street);
        button_panel.add(button_3mal2);
        button_panel.add(button_3mal3);
        button_panel.add(button_3mal4);
        button_panel.add(button_3mal5);
        button_panel.add(button_3mal6);
        button_panel.add(button_nextPlayer);
        button_panel.add(button_custom);
        button_panel.add(button_reset);

        //--------------Custum Input
        custom_textfield.setBounds(10, 85, 100, 20);
        custom_testfield_button.setBounds(120, 85, 50, 20);
        custom_testfield_button.setText("Submit");
        custom_testfield_button.addActionListener(e -> {
            int p = Integer.valueOf(custom_textfield.getText());
            costom(player_label_name[playerpick.getPlayer()], p);
        });

        //-------------Custom Input Frame

        custom_input.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        custom_input.setTitle("Custom Input");
        custom_input.setLayout(null);
        custom_input.getContentPane().setBackground(new Color(0xC9A58D));
        custom_input.setOpacity(1f);
        custom_input.setSize(500, 250);
        custom_input.add(custom_textfield);
        custom_input.add(custom_testfield_button);

        //--------------Main Frame
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
