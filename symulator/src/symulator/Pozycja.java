package symulator;

public class Pozycja {
    private double x;
    private double y;
    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void aktualizujPozycje(double deltaX, double deltaY){
        this.x = this.x + deltaX;
        this.y = this.y +deltaY;
    }
    public String getPozycja(){
        return "(" + x + ", " + y + ")";
    }
}
