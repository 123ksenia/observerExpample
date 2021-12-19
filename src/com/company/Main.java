package com.company;

public class Main {

    public static void main(String[] args) {
	UlanUdeNews uunews=new UlanUdeNews();
	uunews.addNews("first news");
	uunews.addNews("second news");
	Observer firstSubscriber=new InformPolicy();
	Observer secondSubscriber=new ChanelArigus();

	uunews.addObserver(firstSubscriber);
	uunews.addObserver(secondSubscriber);

	uunews.addNews("third news");
	uunews.removeNews("first news");
    }
}
