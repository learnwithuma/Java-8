
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class IterableForEach {

	public static void main(String[] args) {

		// creating sample Collection
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(100);
		numbers.add(1);
		numbers.add(20);

		// Iterate using Iterator
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("Iteration Value::" + i);
		}

		// Iterate through forEach method of Iterable
		Consumer<Integer> consumer = (c) -> System.out.println("Iteration Value::" + c);
		numbers.forEach(consumer);
		
		Predicate<Integer> p1 = i -> i > 10;
		numbers.removeIf(p1);
		System.out.println(numbers);
		
		

	}

}
