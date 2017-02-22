package edu.jalc.everydaythings.bottle;

import edu.jalc.everydaythings.liquid.Beer;

public class BeerBottle extends Bottle {

	private Beer beer;

	private BeerBottle(){
		super(0);
		this.beer = null;
	}

	public BeerBottle(double capacity, Beer beer){
		super(capacity);
		this.beer = beer;
	}

	public Beer getBeer(){
		return this.beer;
	}

	public String toString(){
		return this.getCapacity() + "oz " + this.getBeer();
	}
}
