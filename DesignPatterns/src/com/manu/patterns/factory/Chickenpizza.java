package com.manu.patterns.factory;

public class Chickenpizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing chickenpizza");

	}

	@Override
	public void bake() {
		System.out.println("baking chickenpizza");

	}

	@Override
	public void cut() {
		System.out.println("cutting chickenpizza");

	}

}
