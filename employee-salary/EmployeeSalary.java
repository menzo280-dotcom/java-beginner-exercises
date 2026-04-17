import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter hourly wage: ");
        double wage = scanner.nextDouble();

        double salary = hours * wage;

        System.out.println("Employee ID: " + employeeId);
        System.out.printf("Salary: %.2f%n", salary);

        scanner.close();
    }
}
