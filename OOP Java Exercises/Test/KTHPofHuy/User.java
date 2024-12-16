public abstract class User {
    // Thuộc tính
    protected String user_id;
    protected String user_name;
    protected String user_fullname;
    protected double user_cosalary;

    // Constructor không tham số
    public User() {}

    // Constructor đầy đủ tham số
    public User(String user_id, String user_name, String user_fullname, double user_cosalary) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_fullname = user_fullname;
        this.user_cosalary = user_cosalary;
    }

    // Getter và Setter
    public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        this.user_id = user_id;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getUserFullname() {
        return user_fullname;
    }

    public void setUserFullname(String user_fullname) {
        this.user_fullname = user_fullname;
    }

    public double getUserCosalary() {
        return user_cosalary;
    }

    public void setUserCosalary(double user_cosalary) {
        this.user_cosalary = user_cosalary;
    }

    // Phương thức trừu tượng
    public abstract double getSalary();

    // Phương thức toString
    @Override
    public String toString() {
        return "User ID: " + user_id + ", Username: " + user_name +
               ", Full Name: " + user_fullname + ", Co-Salary: " + user_cosalary;
    }
}
