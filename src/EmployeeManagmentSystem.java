import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeManagmentSystem {

    private ArrayList<Employee> employees;
    private HashMap<String, Employee> employeeMap;
    private Scanner sc;

    public EmployeeManagmentSystem() {
        employees = EmployeeFileHandler.load();
        employeeMap = new HashMap<>();
        for (Employee e : employees) {
            employeeMap.put(e.getId(), e);
        }
        sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Salary Report");
            System.out.println("6. Department Summary");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            switch (sc.nextLine()) {
                case "1": addEmployee(); break;
                case "2": viewAll(); break;
                case "3": updateSalary(); break;
                case "4": deleteEmployee(); break;
                case "5": EmployeeReportGenerator.salaryReport(employees); break;
                case "6": EmployeeReportGenerator.departmentSummary(employees); break;
                case "0":
                    EmployeeFileHandler.save(employees);
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addEmployee() {
        System.out.print("ID: ");
        String id = sc.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee already exists.");
            return;
        }

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Position: ");
        String pos = sc.nextLine();
        System.out.print("Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        Employee e = new Employee(id, name, dept, pos, salary);
        employees.add(e);
        employeeMap.put(id, e);

        System.out.println("✅ Employee added.");
    }

    private void viewAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    private void updateSalary() {
        System.out.print("Employee ID: ");
        String id = sc.nextLine();

        Employee e = employeeMap.get(id);
        if (e == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("New Salary: ");
        e.setSalary(Double.parseDouble(sc.nextLine()));
        System.out.println("✅ Salary updated.");
    }

    private void deleteEmployee() {
        System.out.print("Employee ID: ");
        String id = sc.nextLine();

        Employee e = employeeMap.remove(id);
        if (e != null) {
            employees.remove(e);
            System.out.println("✅ Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        new EmployeeManagmentSystem().start();
    }
}
