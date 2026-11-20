package symulator;

public class Silnik extends Komponent {
    private int maxObroty;
    private int obroty;
    public Silnik(String nazwa, double waga, double cena, int maxObroty){
        super(nazwa, waga, cena);
        this.maxObroty = maxObroty;
        this.obroty = 0;
    }
    public void uruchom(){
        this.obroty = 800;
    }
    public void zatrzymaj(){
        this.obroty = 0;
    }
    public void zwiekszObroty(int wartosc) {
        if (obroty > 0) {
            obroty = obroty + wartosc;
            if (obroty > maxObroty) {
                obroty = maxObroty;
            }
        }
    }
    public void zmniejszObroty(int wartosc) {
        if (obroty > 0) {
            obroty = obroty - wartosc;
            if (obroty < 800) {
                obroty = 800;
            }
        }
    }
    public int getObroty() {
        return obroty;
    }
}
