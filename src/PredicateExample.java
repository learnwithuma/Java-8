import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {

		Predicate<Integer> p1 = i -> i > 10;

		System.out.println(p1.test(15));

		System.out.println(p1.test(10));

		System.out.println(p1.test(6));

		Predicate<String> p2 = str -> str.length() > 5;

		System.out.println(p2.test("Helloo"));

		// Predicate joining
		Predicate<Integer> p3 = i -> i > 20;

		System.out.println(p1.and(p3).test(15));

		// Predicate isEqual Method
		Predicate<Integer> p4 = Predicate.isEqual(50);

		System.out.println(p4.test(51));

	}
}
