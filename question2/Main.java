package question2;

import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        User user1 = new User("Tajwar");
        User user2 = new User("Sawon");

        stockMarket.registerObserver(user1);
        stockMarket.registerObserver(user2);

        stockMarket.setPrice(1000.0);
        stockMarket.setPrice(950.0);

        stockMarket.removeObserver(user2);

        stockMarket.setPrice(1100.0);
}
}