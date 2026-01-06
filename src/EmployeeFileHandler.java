import java.io.*;
import java.util.ArrayList;

public class EmployeeFileHandler {

    private static final String FOLDER_NAME = "data";
    private static final String FILE_NAME = FOLDER_NAME + "/employee.ser";

    // Save employee list to file
    public static void save(ArrayList<Employee> employees) {
        try {
            // Ensure data folder exists
            File folder = new File(FOLDER_NAME);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(employees);
                System.out.println("📁 Data saved successfully to " + FILE_NAME);
            }

        } catch (IOException e) {
            System.out.println("❌ Error saving data: " + e.getMessage());
        }
    }

    // Load employee list from file
    @SuppressWarnings("unchecked")
    public static ArrayList<Employee> load() {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No existing employee data found. Starting fresh.");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error loading data: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
