package tcs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Sort Employee objects by name if two emp objects have same name then by age
public class CompareEmployee {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
		new Employee(1, "Akash", 90),
		new Employee(2, "Vimal", 60),
		new Employee(3, "Akash", 30));
		
		sortEmployees(empList);
		
	}

	private static void sortEmployees(List<Employee> empList) {
		
		List<Employee> sortedList = empList.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(sortedList);
		
		//using Collectons.sort method
		Collections.sort(empList, Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge));
		//System.out.println(empList);
		
	}

}
