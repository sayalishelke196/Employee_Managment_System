import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeReportGenerator {

    public static void salaryReport(ArrayList<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        double total = 0;
        Employee highest = employees.get(0);
        Employee lowest = employees.get(0);

        for (Employee e : employees) {
            total += e.getSalary();
            if (e.getSalary() > highest.getSalary()) highest = e;
            if (e.getSalary() < lowest.getSalary()) lowest = e;
        }

        System.out.println("\n💰 SALARY REPORT");
        System.out.println("Total Employees: " + employees.size());
        System.out.println("Average Salary: ₹" + (total / employees.size()));
        System.out.println("Highest Salary: " + highest);
        System.out.println("Lowest Salary: " + lowest);
    }

    public static void departmentSummary(ArrayList<Employee> employees) {
        HashMap<String, Integer> map = new HashMap<>();

        for (Employee e : employees) {
            map.put(e.getDepartment(),
                    map.getOrDefault(e.getDepartment(), 0) + 1);
        }

        System.out.println("\n🏢 DEPARTMENT SUMMARY");
        for (String dept : map.keySet()) {
            System.out.println(dept + " : " + map.get(dept) + " employees");
        }
    }
}
