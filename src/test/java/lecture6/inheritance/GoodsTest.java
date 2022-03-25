package lecture6.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoodsTest {
    private static final String name1 = "chocolate";
    private static final String name2 = "candy";
    private static final int price1 = 400;
    private static final int price2 = 250;
    private Goods goods = new Goods(name1, price1);

    @Test
    public void testSetName() {
        assertEquals(name1, goods.getName());

        goods.setName(name2);

        assertEquals(name2, goods.getName());
    }

    @Test
    public void testSetPrice() {
        assertEquals(price1, goods.getPrice());

        goods.setPrice(price2);

        assertEquals(price2, goods.getPrice());
    }
}