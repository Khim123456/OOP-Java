package bai6;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nhap so luong Part time employee
		System.out.print("Enter number of part time employee: ");
		int n = scanner.nextInt();
		
		ArrayList<PartTimeEmployee>
		partTimeEmployees = new ArrayList<>();
		for(int i=0; i<n; i++) {
			System.out.println("Enter detail for Part time employee "+(i+1)+": ");
			PartTimeEmployee pte = new PartTimeEmployee();
			pte.inputData();
			partTimeEmployees.add(pte);
		}
		// Nhap so luong employee
		System.out.print("Enter number of employee: ");
		int m = scanner.nextInt();
		ArrayList<Employee>
		employees = new ArrayList<>();
		for(int i=0; i<m; i++) {
			System.out.println("Enter details for employee "+(i+1)+":");
			Employee emp = new Employee();
			emp.inputData();
			employees.add(emp);
		}
		
		//Hien thi thong tin cac part time employee
		System.out.println("---Part time employee Information---");
		for(PartTimeEmployee pte:partTimeEmployees) {
			System.out.println(pte);
		}
		
		//Hien thi thong tin cac employee
		System.out.println("---Employee Information---");
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		
	}
}
