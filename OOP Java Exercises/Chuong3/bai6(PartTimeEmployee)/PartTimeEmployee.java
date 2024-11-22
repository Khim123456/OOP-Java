package bai6;
import java.util.Scanner;


public class PartTimeEmployee extends Employee {
	private int hoursPerWeek;
	
	public PartTimeEmployee() {}
	
	public PartTimeEmployee(String name, char gender, int age, String employeeID, String dateHired, int hoursPerWeek) {
		super(name, gender, age, employeeID, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}
	
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override
	public void inputData() {
		super.inputData();//Goi input data cua lop cha de nhap name, gender, age, employee id, date hired
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter hours per week: ");
		hoursPerWeek = scanner.nextInt();
		
	}
	
	@Override
	public String toString() {
		return super.toString()+", Hours per week: "+hoursPerWeek;
	}

}
