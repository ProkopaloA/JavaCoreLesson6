package com.lgs.lab.interface2;

public class Main {
public static void main(String[] args) {
	MyCalculator calc = new MyCalculator(10, 2);
	calc.minus();
	calc.plus();
	calc.multiply();
	calc.devide();
	System.out.println(calc);
}
}
