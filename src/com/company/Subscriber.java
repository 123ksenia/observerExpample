package com.company;
import java.util.List;
public class Subscriber implements Observer{
    String name;
    public  Subscriber(String name){
        this.name=name;
    }


    @Override
    public void handleEvent(List<String> inform) {
        System.out.println("Dear"+name+"\nwe have news for you:\n"+inform+"\n===============================================\n");
    }
}
