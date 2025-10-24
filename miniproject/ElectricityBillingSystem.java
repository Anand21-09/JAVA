import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ElectricityBillingSystem {
    
    private String customerName;
    private int customerID;
    private double unitsConsumed;
    private double totalBill;

    // Constructor to initialize customer details and units consumed
    public ElectricityBillingSystem(String customerName, int customerID, double unitsConsumed) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.unitsConsumed = unitsConsumed;
        this.totalBill = calculateBill(unitsConsumed);
    }

    // Method to calculate bill based on units consumed
    private double calculateBill(double units) {
        double rate;

        if (units <= 100) {
            rate = 1.20;
        } else if (units <= 300) {
            rate = 2.00;
        } else {
            rate = 3.00;
        }

        return units * rate;
    }

    // Method to display the bill on the console
    public void displayBill() {
        System.out.println("------ Electricity Bill ------");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: $" + String.format("%.2f", totalBill));
        System.out.println("------------------------------");
    }

    // Method to generate the report file
    public void generateReportFile() {
        String fileName = "ElectricityBill_Report_" + customerID + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("------ Electricity Bill Report ------\n");
            writer.write("Customer Name: " + customerName + "\n");
            writer.write("Customer ID: " + customerID + "\n");
            writer.write("Units Consumed: " + unitsConsumed + "\n");
            writer.write("Total Bill Amount: $" + String.format("%.2f", totalBill) + "\n");
            writer.write("-------------------------------------\n");
            System.out.println("Report generated successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the report file.");
            e.printStackTrace();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter units consumed: ");
        double units = scanner.nextDouble();

        // Create an instance of ElectricityBillingSystem
        ElectricityBillingSystem bill = new ElectricityBillingSystem(name, id, units);

        // Display the bill on the console
        bill.displayBill();

        // Generate a report file
        bill.generateReportFile();

        scanner.close();
    }
}
