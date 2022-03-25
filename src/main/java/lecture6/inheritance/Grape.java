package lecture6.inheritance;

public class Grape extends Fruit {
    private String type;

    public Grape() {
        super("Grape", 3.14);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
