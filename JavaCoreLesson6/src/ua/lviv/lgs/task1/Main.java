package ua.lviv.lgs.task1;

public class Main {
	public static void main(String[] args) {
		HourlyRate HRW = new HourlyRate("Vasya", 50.25, 168);
		MonthlyRate MRW = new MonthlyRate ("Oleg", 10500);
		HRW.salary();
		MRW.salary();
	}

}
