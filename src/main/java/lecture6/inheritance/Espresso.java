package lecture6.inheritance;

public class Espresso extends Coffee {

    public Espresso() {
        super("Espresso", 320);
    }

    public Espresso(double price) {
        super("Espresso", price);
    }
}
