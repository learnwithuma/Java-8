import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i * 10;

		System.out.println(f1.apply(10));

		System.out.println(f1.apply(2));

		System.out.println(f1.apply(50));

		Function<String, Integer> f2 = str -> str.length();

		System.out.println(f2.apply("Helloo"));

		// Function Chaining

		System.out.println(f2.andThen(f1).apply("Dave"));

		Function<String, String> f = Function.identity();
		String hello = f.apply("hello");
		System.out.println(hello);

	}
}
