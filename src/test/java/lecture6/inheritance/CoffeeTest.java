package lecture6.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {
    @Test
    public void getCappuccino() {
        Cappuccino coffee = new Cappuccino();
        assertEquals("Cappuccino", coffee.getName());
        assertEquals(450, coffee.getPrice());
    }

    @Test
    public void getEspresso() {
        Espresso coffee = new Espresso();
        assertEquals("Espresso", coffee.getName());
        assertEquals(320, coffee.getPrice());
    }
}