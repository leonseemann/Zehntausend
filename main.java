import java.util.Scanner;

public class main extends zehntausend {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void main(String[] args) {

        int pick = 0;
        int temp = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der Spieler");
        int anzahl_spieler = scanner.nextInt();

        // Neues Array Objekt
        Player[] player = new Player[anzahl_spieler];

        // Schleife zum Erstellen der Spieler
        for (int i = 0; i < anzahl_spieler; i++) {
            System.out.println("Name:");
            player[i] = new Player(scanner.next());
            System.out.println("\n");
        }
        clearScreen();
        // for (int i = 0; i < anzahl_spieler; i++) {
        // System.out.printf("Spieler: %s%nPunkte: %s%n%n", player[i].getName(),
        // player[i].getPoints());
        // }

        loop:  while (true) {
            for (int z = 0; z < anzahl_spieler; z++) {
                System.out.printf("Spieler:  %s%nPunkte: %s%n%n", player[z].getName(), player[z].getPoints());
            }
            System.out.printf("%s, was hast du gew\u00fcrfelt?%n%n", player[pick].getName());
            System.out.printf(
                    "0. N\u00e4chster Spieler%n1. Eine 5. %n2. Eine 1. %n3. 3 mal eine 2 %n4. 3 mal eine 3 %n5. 3 mal eine 4 %n6. 3 mal eine 5%n7. 3 mal eine 6 %n8. Eine Stra\u00dfe%n9. Benutzerdifinierte Punkte%n10. Punkte zur\u00fccksetzen (Runde)%n");
            int i = scanner.nextInt();
            switch (i) {
            case 0:
                if (pick == anzahl_spieler - 1) {
                    pick = 0;
                } else {
                    pick++;
                }

                temp = 0;
                break;
            case 1:
                fuenf(player[pick]);
                temp += 50;
                break;
            case 2:
                eins(player[pick]);
                temp += 100;
                break;
            case 3:
                dreimalzwei(player[pick]);
                temp += 200;
                break;
            case 4:
                dreimaldrei(player[pick]);
                temp += 300;
                break;
            case 5:
                dreimalvier(player[pick]);
                temp += 400;
                break;
            case 6:
                dreimalfuenf(player[pick]);
                temp += 500;
                break;
            case 7:
                dreimalsechs(player[pick]);
                temp += 600;
                break;
            case 8:
                System.out.printf("%n%nGerettet? %n%s. Ja%n%s. Nein%n", 0, 1);
                int gerettet = scanner.nextInt();
                switch (gerettet) {
                case 0:
                    strasse(player[pick]);
                    System.out.println("Super, mit wie vielen Punkten?");
                    int gerettet_punkte = scanner.nextInt();
                    costom(player[pick], gerettet_punkte);
                    temp += 2000 + gerettet_punkte;
                    break;
                case 1:
                    System.out.println("Looser");
                    break;

                default:
                    System.out.println("Ung\u00fcltige eingabe.");
                }
                break;
            case 9:
                System.out.println("Anzahl der Punkte die abgezogen werden sollen.");
                costom(player[pick], scanner.nextInt());
                break;
            case 10:
                costom(player[pick], -temp);
                temp = 0;
                break;
            default:
                System.err.printf("%s ist eine ungueltige Eingabe.%n", i);
                break;
            }
            clearScreen();
            // System.out.printf("Spieler: %s%nPunkte: %s%n%n", player[pick].getName(),
            // player[pick].getPoints());
            for (int j = 0; j < anzahl_spieler; j++) {
                if (player[j].getPoints() == 0) {
                    break loop;
                }
            }
        }
    }
}
