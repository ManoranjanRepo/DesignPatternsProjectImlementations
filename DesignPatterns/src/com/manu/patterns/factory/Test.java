package com.manu.patterns.factory;

public class Test {
	public static void main(String[] args) {
		
	  PizzaStore ps = new PizzaStore();
       ps.orderPizza("cheese");
       ps.orderPizza("veggie");
}
}
