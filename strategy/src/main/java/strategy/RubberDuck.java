package strategy;

import fly.FlyNoWay;
import quack.MuteQuack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flybehaviour = new FlyNoWay();
		quackbehaviour = new MuteQuack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a rubber duck");
	}

}
