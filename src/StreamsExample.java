
// Lambda Expression and Collections

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamsExample {

	private static List<Integer> initializeNumbersList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(1);
		numbers.add(20);
		return numbers;
	}

	public static void main(String[] args) {
		List<Integer> numbers = initializeNumbersList();

		System.out.println("Filter - Without Streams");
		List<Integer> bigNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) >= 15) {
				bigNumbers.add(numbers.get(i));
			}
		}
		System.out.println(bigNumbers);

		System.out.println("Filter - With Streams");
		bigNumbers = new ArrayList<Integer>();
		bigNumbers = numbers.stream().filter(i -> i >= 15).collect(Collectors.toList());
		System.out.println(bigNumbers);

		System.out.println("Mapped Objects - Without Streams");
		List<Integer> sqNumbers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {
			sqNumbers.add(numbers.get(i) * numbers.get(i));
		}
		System.out.println(sqNumbers);

		System.out.println("Mapped Objects - With Streams");
		sqNumbers = new ArrayList<Integer>();
		sqNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(sqNumbers);

		System.out.println("Count");
		long num = numbers.stream().map(i -> i * i).count();
		System.out.println(num);

		System.out.println("Sorted");
		List<Integer> sortedNumbers = new ArrayList<Integer>();
		sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);

		System.out.println("Min and Max");
		Integer minValue = numbers.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		Integer maxValue = numbers.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(minValue);
		System.out.println(maxValue);

		System.out.println("forEach");
		numbers.stream().forEach(i1 -> System.out.println(i1));
		numbers.stream().forEach(System.out::println);

		System.out.println("toArray");
		Integer[] arr = numbers.stream().toArray(Integer[]::new);
		System.out.println(arr);

		System.out.println("Streams for group of values");
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8,9);
		s1.forEach(i1 -> System.out.println(i1));
		
		System.out.println("Streams for Arrays");
		Integer[] intArr = {10,20,30,40,50};
		Stream<Integer> s2 = Stream.of(intArr);
		s2.forEach(i1 -> System.out.println(i1));
	}
}