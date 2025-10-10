import Employees.Manager;
import Employees.Developerr;
import com.assignment.utilities.EmployeeUtilities;

public class AssignmentMaon {

	public static void main(String[] args) {
		 Manager manager = new Manager("Alice", 101, 80000, 10);
		        Developerr developer = new Developerr("Bob", 102, 60000, "Java");

		        // Use utility methods
		        EmployeeUtilities.printEmployeeDetails(manager);
		        EmployeeUtilities.printEmployeeDetails(developer);

		        // Increase salary (protected method works inside same package)
		        EmployeeUtilities.increaseSalary(manager, 5000);
		        EmployeeUtilities.increaseSalary(developer, 3000);

		        System.out.println("\nAfter salary increment:");
		        EmployeeUtilities.printEmployeeDetails(manager);
		        EmployeeUtilities.printEmployeeDetails(developer);

		}

	

	}


