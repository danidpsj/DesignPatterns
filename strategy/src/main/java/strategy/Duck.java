package strategy;

import fly.FlyBehaviour;
import quack.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flybehaviour;
	QuackBehaviour quackbehaviour;
	
	public Duck() {
		
	}
	
	/**
	 * The display method has a particular implementation for each duck
	 * so each subclass should impletent its own code
	 */
	public abstract void display();
	
	/**
	 * The swim method has the same implementation for every duck, so in
	 * order no do not duplicate code, it implementation is placed here
	 */
	public void swim() {
		System.out.println("Every duck swims");
	}
	
	/**
	 * There exist a certain group of fly avilities between all the ducks.
	 * As there is no a specific fly implementation for each duck, and there is no a 
	 * general implementation neither, we should implement a interface
	 */
	public void performFly() {
		flybehaviour.fly();
	}
	
	public void performQuack() {
		quackbehaviour.quack();
	}
	
	public void setFly(FlyBehaviour flyBehaviour) {
		this.flybehaviour = flyBehaviour;
	}
	
	public void setQuack(QuackBehaviour quackBehaviour) {
		this.quackbehaviour = quackBehaviour;
	}
}
