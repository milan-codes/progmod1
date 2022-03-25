package lecture6.inheritance;

public class Cappuccino extends Coffee {

    public Cappuccino() {
        super("Cappuccino", 450);
    }

    public Cappuccino(double price) {
        super("Cappuccino", price);
    }
}
