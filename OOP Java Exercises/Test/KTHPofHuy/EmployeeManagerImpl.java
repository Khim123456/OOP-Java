import java.util.ArrayList;

public class EmployeeManagerImpl implements EmployeeManager {
    ArrayList<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        try {
            employeeList.add(e);
        } catch (Exception ex) {
            System.out.println("Loi khi them nhan vien: " + ex.getMessage());
        }
    }

    @Override
    public void editEmployee(Employee e) {
        try {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getUserId().equals(e.getUserId())) {
                    employeeList.set(i, e);
                    System.out.println("Cap nhat thong tin thanh cong!");
                    return;
                }
            }
            throw new Exception("Khong tim thay nhan vien voi ID: " + e.getUserId());
        } catch (Exception ex) {
            System.out.println("Loi khi cap nhat nhan vien: " + ex.getMessage());
        }
    }

    @Override
    public Employee searchEmployee(String fullname) {
        try {
            for (Employee e : employeeList) {
                if (e.getUserFullname().equalsIgnoreCase(fullname)) {
                    return e;
                }
            }
            throw new Exception("Khong tim thay nhan vien voi ten: " + fullname);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    @Override
    public double getTotalSalary() {
        try {
            double total = 0;
            for (Employee e : employeeList) {
                total += e.getSalary();
            }
            return total;
        } catch (Exception ex) {
            System.out.println("Loi khi tinh tong luong: " + ex.getMessage());
            return 0;
        }
    }
}