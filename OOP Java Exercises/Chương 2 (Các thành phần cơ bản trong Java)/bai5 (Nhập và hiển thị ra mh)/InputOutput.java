package bai5;

import java.util.Scanner;

	public class InputOutput {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			//Nhap so nguyen
			System.out.print("Nhap mot so nguyen: ");
			
			int songuyen = scanner.nextInt();
			
			//Nhap so thuc
			System.out.print("Nhap mot so thuc: ");
			double sothuc = scanner.nextDouble();
			scanner.nextLine(); //Xoa bo dem
			
			//Nhap ki tu
			System.out.print("Nhap mot ki tu: ");
			char kitu = scanner.nextLine().charAt(0);
			
			//Nhap chuoi ki tu
			System.out.print("Nhap mot chuoi ki tu: ");
			String chuoi = scanner.nextLine();
			
			//Hien thi ra man hinh
			System.out.println("Thong tin da nhap la: ");
			System.out.println("So nguyen: "+songuyen);
			System.out.println("So thuc: "+sothuc);
			System.out.println("Ki tu: "+kitu);
			System.out.println("Chuoi ki tu: "+chuoi);
			
			scanner.close();
			
		}

	}