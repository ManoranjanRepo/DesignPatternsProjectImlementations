package com.manu.patterns.factory;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing veggiePiza");

	}

	@Override
	public void bake() {
		System.out.println("baking veggiePiza");

	}

	@Override
	public void cut() {
		System.out.println("cutting veggiePiza");

	}

}
