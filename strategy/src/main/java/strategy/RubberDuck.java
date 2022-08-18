package strategy;

import fly.FlyNoWay;
import fly.FlyWithWings;
import quack.MuteQuack;
import quack.Squeak;

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
