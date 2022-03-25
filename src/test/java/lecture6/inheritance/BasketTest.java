package lecture6.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {
    @Test
    public void createReceipt() {
        Basket basket = new Basket();

        assertEquals("", basket.createReceipt());

        String goods1 = "milk";
        double price1 = 300.0;
        basket.goodsList.add(new Goods(goods1, price1));

        assertEquals(goods1 + " " + price1 + "\r\n", basket.createReceipt());

        String goods2 = "milk";
        double price2 = 300.0;
        basket.goodsList.add(new Goods(goods2, price2));

        assertEquals(goods1 + " " + price1 + "\r\n" + goods2 + " " + price2 + "\r\n", basket.createReceipt());
    }

    @Test
    public void getTotalPrice() {
        Basket basket = new Basket();

        assertEquals(0, basket.getTotalPrice());

        String goods1 = "milk";
        int price1 = 300;
        basket.goodsList.add(new Goods(goods1, price1));

        assertEquals(price1, basket.getTotalPrice());

        String goods2 = "milk";
        int price2 = 300;
        basket.goodsList.add(new Goods(goods2, price2));

        assertEquals(price1 + price2, basket.getTotalPrice());
    }
}