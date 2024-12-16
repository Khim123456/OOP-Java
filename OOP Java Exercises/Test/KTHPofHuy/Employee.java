// Lớp Employee kế thừa từ User
public class Employee extends User {
    // Thuộc tính bổ sung
    private int employee_basic_salary;
    private String employee_department;

    public Employee(){
        super();
    }

    // Constructor
    public Employee(String user_id, String user_name, String user_fullname, double user_cosalary, int employee_basic_salary, String employee_department) {
        super(user_id, user_name, user_fullname, user_cosalary);
        this.employee_basic_salary = employee_basic_salary;
        this.employee_department = employee_department;
    }

    // Getter và Setter
    public int getEmployeeBasicSalary() {
        return employee_basic_salary;
    }

    public void setEmployeeBasicSalary(int employee_basic_salary) {
        this.employee_basic_salary = employee_basic_salary;
    }

    public String getEmployeeDepartment() {
        return employee_department;
    }

    public void setEmployeeDepartment(String employee_department) {
        this.employee_department = employee_department;
    }

    // Cài đặt phương thức getSalary()
    @Override
    public double getSalary() {
        double bonus = 0;
        switch (employee_department) {
            case "Nhan su":
                bonus = 1.0;
                break;
            case "Kinh doanh":
                bonus = 1.1;
                break;
            case "Cong nghe":
                bonus = 1.15;
                break;
            case "Quan tri":
                bonus = 1.2;
                break;
            default:
                bonus = 1.0;
        }
        return getUserCosalary() * employee_basic_salary * bonus;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return super.toString() + ", Phong ban: " + employee_department + ", Luong co ban: " + employee_basic_salary + ", Tong luong: " + getSalary();
    }
}
