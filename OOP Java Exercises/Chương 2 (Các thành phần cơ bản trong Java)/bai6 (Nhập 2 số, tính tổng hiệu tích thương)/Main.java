package bai6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Nhap hai so nguyen tu ban phim
		System.out.print("Nhap so nguyen thu nhat: ");
		int a = scanner.nextInt();
		
		System.out.print("Nhap so nguyen thu hai: ");
		int b = scanner.nextInt();
		
		//Tinh tong hieu tich thuong
		int tong = a+b;
		int hieu = a-b;
		int tich = a*b;
		double thuong = b !=0 ? (double)a/b : Double.NaN; //Tranh chia cho 0
		
		//Hien thi ra man hinh
		System.out.println("Tong = "+tong);
		System.out.println("Hieu = "+hieu);
		System.out.println("Tich = "+tich);
		
		if(b != 0) {
			System.out.println("Thuong = "+thuong);
		}
		else {
			System.out.println("Khong the tinh thuong vi so chia = 0!");
		}
		
		scanner.close();
				
	}

}
