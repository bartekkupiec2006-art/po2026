package symulator;

public class Samochod {
    private Silnik silnik;
    private SkrzyniaBiegow skrzynia;
    public void wlacz() {
        silnik.uruchom();
    }
    public void wylacz(){
        silnik.zatrzymaj();
        skrzynia.zerujBieg();
    }
}
