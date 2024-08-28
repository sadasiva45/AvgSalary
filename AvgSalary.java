
public class AvgSalary {

	public static void main(String[] args) {
		


	        int[] salaries = {4000, 2300, 5000, 23000, 45000, 8000, 9000, 4700, 5600};

	       
	        double totalSalary = 0;
	        for (int salary : salaries) {
	            totalSalary += salary;
	        }
	        double averageSalary = totalSalary / salaries.length;

	      
	        for (int i = 0; i < salaries.length; i++) {
	            if (salaries[i] < averageSalary) {
	                salaries[i] += salaries[i] * 0.5;
	            }
	        }

	        
	        System.out.println("New salary list:");
	        for (int salary : salaries) {
	            System.out.println(salary);
	        }

	}

}
