package lecture6.inheritance;

import java.util.Objects;

public class Shopping extends Basket {

    void addGoods(Goods item) {
        super.goodsList.add(item);
    }

    void updatePrice(String item, double newPrice) {
        for (Goods good : super.goodsList) {
            if (Objects.equals(good.getName(), item)) {
                good.setPrice(newPrice);
                break;
            }
        }
    }

    void removeGoods(Goods item) {
        super.goodsList.removeIf(good -> Objects.equals(good.getName(), item.getName()));
    }
}
