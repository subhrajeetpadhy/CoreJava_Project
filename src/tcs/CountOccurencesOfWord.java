package tcs;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a programme to Find the frequency/occurrence of each word in a string array
 *
 */

public class CountOccurencesOfWord {
	public static void main(String[] args) {
		String string = ("Let it snow, let it snow, let it snow");
		Map<String, Long> groupByWordMap = countOfOccurences(string);
		System.out.println(groupByWordMap);
	}

	private static Map<String, Long> countOfOccurences(String string) {
		String tmpString = string.replaceAll("[^A-Za-z\\s]", "").toLowerCase();
		Map<String, Long> groupByWordMap = Arrays.stream(tmpString.split(" "))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return groupByWordMap;
	}
}