import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManagerImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU QUAN LY NHAN VIEN =====");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Sua thong tin nhan vien");
            System.out.println("3. Tim kiem nhan vien");
            System.out.println("4. Tinh tong luong");
            System.out.println("5. Exit");
            System.out.print("Chon chuc nang: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhap ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap ten dang nhap: ");
                    String username = scanner.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String fullname = scanner.nextLine();
                    System.out.print("Nhap he so luong: ");
                    double cosalary = scanner.nextDouble();
                    System.out.print("Nhap luong co ban: ");
                    int basicSalary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap phong ban: ");
                    String department = scanner.nextLine();
                    manager.addEmployee(new Employee(id, username, fullname, cosalary, basicSalary, department));
                    break;
                case 2:
                    System.out.print("Nhap ID nhan vien can sua: ");
                    String editId = scanner.nextLine();
                    System.out.print("Nhap ten dang nhap moi: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Nhap ho ten moi: ");
                    String newFullname = scanner.nextLine();
                    System.out.print("Nhap he so luong moi: ");
                    double newCosalary = scanner.nextDouble();
                    System.out.print("Nhap luong co ban moi: ");
                    int newBasicSalary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap phong ban moi: ");
                    String newDepartment = scanner.nextLine();
                    Employee updateEmployee = new Employee(editId, newUsername, newFullname, newCosalary, newBasicSalary, newDepartment);
                    manager.editEmployee(updateEmployee);
                    break;
                case 3:
                    System.out.print("Nhap ho ten nhan vien: ");
                    String searchName = scanner.nextLine();
                    System.out.println(manager.searchEmployee(searchName));
                    break;
                case 4:
                    System.out.println("Tong luong cua tat ca nhan vien la: " + manager.getTotalSalary());
                    break;
                case 5:
                    System.out.println("Da thoat chuong trinh. Hen gap lai ban lan sau!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long thu lai!");
            }
        }
    }
}
