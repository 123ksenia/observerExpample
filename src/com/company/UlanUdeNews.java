package com.company;

import java.util.ArrayList;
import java.util.List;
public class UlanUdeNews implements Observed{
    List<String> inform = new ArrayList<>();
    List<Observer> subscribes = new ArrayList<>();
    public  void addNews(String inform){
        this.inform.add(inform);
        notifyObservers();
    }
    public void removeNews(String inform){
        this.inform.remove(inform);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribes){
            observer.handleEvent(this.inform);
        }
    }
}
