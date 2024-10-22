package question2;

import java.util.ArrayList;
import java.util.List;

class StockMarket implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers(price);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(double price) {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
