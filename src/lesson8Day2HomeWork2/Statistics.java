package lesson8Day2HomeWork2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		//return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return
		double sum= 0;
		for(EmployeeData ed: aList) {
			sum += ed.getSalary();
		}
		
		return sum;
	}
}
