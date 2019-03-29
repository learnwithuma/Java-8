// Lambda Expression and Collections sort
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

class CustomComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		return i1 > i2 ? -1 : i1 < i2 ? 1 : 0;
	}
}

class CollectionsSorting {

	private static List<Integer> initializeNumbersList() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(1);
		numbers.add(20);
		return numbers;
	}

	private static Map<Integer, Integer> initializeNumbersMap() {
		Map<Integer, Integer> numbers = new TreeMap<Integer, Integer>((i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0);
		numbers.put(1, 100);
		numbers.put(2, 200);
		numbers.put(3, 300);
		numbers.put(4, 400);
		return numbers;
	}

	public static void main(String[] args) {
		List<Integer> numbers = initializeNumbersList();

		System.out.println("List - Without Lambda Expression");
		Collections.sort(numbers, new CustomComparator());
		System.out.println(numbers);

		System.out.println("List - With Lambda Expression");
		numbers = initializeNumbersList();
		Collections.sort(numbers, (i1, i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0);
		System.out.println(numbers);

		System.out.println("TreeMap - With Lambda Expression");
		Map<Integer, Integer> numbersMap = initializeNumbersMap();
		System.out.println(numbersMap);
		


	}
}