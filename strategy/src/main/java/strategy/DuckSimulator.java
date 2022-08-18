package strategy;

import fly.FlyNoWay;
import quack.MuteQuack;

public class DuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();

		System.out.println("");
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.swim();
		rubber.performFly();
		rubber.performQuack();
		
		System.out.println("");
		System.out.println("Changing behaviour during runtime");
		System.out.println("");
		
		mallard.setFly(new FlyNoWay());
		mallard.setQuack(new MuteQuack());
		
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();
	}

}
