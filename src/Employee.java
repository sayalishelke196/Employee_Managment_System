import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String department;
    private String position;
    private double salary;
    private LocalDate joinDate;

    public Employee(String id, String name, String department,
                    String position, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.joinDate = LocalDate.now();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format(
            "ID:%s | Name:%s | Dept:%s | Position:%s | Salary:₹%.2f | Joined:%s",
            id, name, department, position, salary, joinDate.format(df)
        );
    }
}
