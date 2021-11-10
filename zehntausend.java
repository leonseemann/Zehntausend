public class zehntausend {
    public static void fuenf(Player p) {
        p.setPoints(p.getPoints() - 50);
    }

    public static void eins(Player p) {
        p.setPoints(p.getPoints() - 100);
    }

    public static void dreimalzwei(Player p) {
        p.setPoints(p.getPoints() - 200);
    }

    public static void dreimaldrei(Player p) {
        p.setPoints(p.getPoints() - 300);
    }

    public static void dreimalvier(Player p) {
        p.setPoints(p.getPoints() - 400);
    }

    public static void dreimalfuenf(Player p) {
        p.setPoints(p.getPoints() - 500);
    }

    public static void dreimalsechs(Player p) {
        p.setPoints(p.getPoints() - 600);
    }

    public static void strasse(Player p){
        p.setPoints(p.getPoints() - 2000);
    }

    public static void costom(Player p, int points){
        p.setPoints(p.getPoints() - points);
    }

    private int playerpick, resetpoints;

    public void setPlayer(int playerpick){
        this.playerpick = playerpick;
    }

    public int getPlayer(){
        return this.playerpick;
    }

    public void setResetPoints(int resetpoints){
        this.resetpoints = resetpoints;
    }
    public void addResetPoints(int resetpoints){
        this.resetpoints += resetpoints;
    }

    public int getResetPoints(){
        return this.resetpoints;
    }

}
