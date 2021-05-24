package ua.lviv.lgs.task1;

public class HourlyRate extends Worker implements Salary{
	private double rate;
	private int hour;
	public HourlyRate(String name, double rate, int hour) {
		super(name);
		this.rate = rate;
		this.hour = hour;
	}
	@Override
	public void salary() {
		double salary = this.rate * this.hour;
		System.out.println("Зарплата робітника " + super.getName() + " = " + salary + " грн.");
		
	}
	
	
}
