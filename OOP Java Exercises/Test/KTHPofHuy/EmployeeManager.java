public interface EmployeeManager {
    void addEmployee(Employee e);
    void editEmployee(Employee e);
    Employee searchEmployee(String fullname);
    double getTotalSalary();
}