package tcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Find the largest and second largest number from a array/list
 *
 */

class LargestAndSecondLargest {
	
	public static void main(String[] args)
	{
		int arr[] = { 12, 35, 23, 34, 23 };
		int arrayLength = arr.length;
		findSecondLargestWithoutSorting(arr, arrayLength);
		
		List<Integer> numbers = Arrays.asList(12, 35, 23, 34, 23);
		System.out.println("Largest & Second largest number : "+findLargestAndSecondLargestNumber(numbers));
	}
	
	public static void findSecondLargestWithoutSorting(int arr[],
			int arrayLength)
	{
		int i;
		int first = 0;
		int second = 0;
		if (arrayLength < 2) {
			System.out.print(" Invalid Input ");
			return;
		}

		for (i = 0; i < arrayLength; i++) {
			/*If current element is greater than
            first then update both first and second*/
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}

			/*If arr[i] is in between first and
               second then update second*/
			else if (arr[i] > second && arr[i] != first) {
				second = arr[i];
			}

		}

		if (second == 0)
			System.out.print("There is no second largest"
					+ " element\n");
		else
			System.out.print("Without sorting, Second largest number : " + second);
	}


	private static List<Integer> findLargestAndSecondLargestNumber(List<Integer> numbers) {
		
		List<Integer> list = new ArrayList<>();
		System.out.println("\nfindLargestAndSecondLargestNumber starts...");
		int largestNumber = numbers.stream().max(Integer::compare).get();
		System.out.println("Largest number : "+largestNumber);
		int secondLargestNumber = numbers
				.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		System.out.println("Second largest number : "+secondLargestNumber);
		list.add(largestNumber);
		list.add(secondLargestNumber);
		return list;
	}
}