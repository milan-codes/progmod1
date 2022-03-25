package lecture6.inheritance;

public class Apple extends Fruit {
    private int pieces;
    private Colour colour;

    public Apple() {
        super("Apple", 3.14);
    }

    public Apple(Colour colour) {
        super("Apple", 3.14);
        this.colour = colour;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
