package ua.lviv.lgs.task1;

public class MonthlyRate extends Worker implements Salary {
	private double monthlyRate;

	public MonthlyRate(String name, double monthlyRate) {
		super(name);
		this.monthlyRate = monthlyRate;
	}

	@Override
	public void salary() {
		System.out.println("Зарплата робітника " + super.getName() + " = " + monthlyRate + " грн.");
		
	}
	

}
