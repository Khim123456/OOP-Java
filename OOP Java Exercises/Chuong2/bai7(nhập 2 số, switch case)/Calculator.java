package bai7;

import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nhap hai so thuc tu ban phim
		System.out.print("Nhap so thuc thu nhat: ");
		double num1=scanner.nextDouble();
		
		System.out.print("Nhap so thuc thu hai: ");
		double num2=scanner.nextDouble();
		
		//Nhap ki tu dieu khien
		System.out.print("Nhap ki tu ('A', 'S', 'M', 'D'): ");
		char operation = scanner.next().toUpperCase().charAt(0);
		
		//kiem tra va thuc hien phep toan tuong ung
		switch(operation) {
		case 'A':
			System.out.println("Tong = "+(num1+num2));
			break;
		
		case 'S':
			System.out.println("Hieu = "+(num1 - num2));
			break;
			
		case 'M':
			System.out.println("Tich = "+(num1*num2));
			break;
			
		case 'D':
			if (num2 != 0) {
			System.out.println("Thuong = "+(num1/num2));
			}
			else {
				System.out.println("Khong the chia cho 0!");
				
			}
			break;
		default:
			System.out.println("Ki tu vua nhap khong hop le!");
			
			
			
		}
		scanner.close();
	}

}
