package strategy;

import fly.FlyWithWings;
import quack.Squeak;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		flybehaviour = new FlyWithWings();
		quackbehaviour = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("I am a mallad duck");
	}

}
