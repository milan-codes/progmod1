package lecture6.inheritance;

import java.util.ArrayList;

public class Basket {
    protected ArrayList<Goods> goodsList = new ArrayList<>();

    String createReceipt() {
        StringBuilder sb = new StringBuilder();
        for (Goods item : goodsList) {
            sb.append(item.toString());
        }

        return sb.toString();
    }

    double getTotalPrice() {
        double total = 0;
        for (Goods item : goodsList) {
            total += item.getPrice();
        }

        return total;
    }
}
