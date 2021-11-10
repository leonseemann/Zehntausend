public class Player {
    private int points;
    private String name;

    public Player() {
        this(10000);
    }

    public Player(int points) {
        this(points, "Leer");
    }

    public Player(String name) {
        this(10000, name);
    }

    public Player(int points, String name) {
        this.points = points;
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void reuturnPoints() {
        System.out.printf("Points: %s", points);
    }

    public void returnName() {
        System.out.printf("Name: %s", name);
    }
}
