package bai6;
import java.util.Scanner;

public class Employee extends Person {
	protected String employeeID;
	protected String dateHired;
	
	public Employee() {}
	
	public Employee(String name, char gender, int age, String employeeID, String dateHired) {
		super(name, gender, age);
		this.employeeID = employeeID;
		this.dateHired = dateHired;
		
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public String getDateHired() {
		return dateHired;
	}
	
	public void setEmployeeID(String employeeID){
		this.employeeID = employeeID;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public void inputData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter gender: ");
		gender = scanner.next().charAt(gender);
		System.out.print("Enter age: ");
		age = scanner.nextInt();
		scanner.nextLine();//Xoa bo dem
		System.out.print("Enter employee ID: ");
		employeeID = scanner.nextLine();
		System.out.print("Enter date hired: ");
		dateHired = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString()+", Employee ID: "+employeeID+", Date hired: "+dateHired;
	}
	

}
