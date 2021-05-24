package com.lgs.lab.interface2;

public class MyCalculator implements com.lgs.lab.interface1.Numerable {
	double a;
	double b;
		
	public MyCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double plus() {
		return this.a+this.b;
	}

	@Override
	public double minus() {
		return this.a-this.b;
	}

	@Override
	public double multiply() {
		return this.a*this.b;
	}

	@Override
	public double devide() {
		return this.a/this.b;
	}

	@Override
	public String toString() {
		return "Результат операцій над числами " + a + " та " + b + " : додавання = " + plus() + ", віднімання = " + minus() + ", множення = "
				+ multiply() + ", ділення = " + devide();
	}
	
	

}
