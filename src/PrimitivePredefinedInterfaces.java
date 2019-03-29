import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class PrimitivePredefinedInterfaces {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p1 = (i1, i2) -> i1 + i2 > 100;

		System.out.println(p1.test(50, 50));

		BiFunction<Integer, Integer, Integer> f1 = (i1, i2) -> i1 + i2;

		System.out.println(f1.apply(50, 50));

		BiConsumer<Integer, Integer> c1 = (i1, i2) -> System.out.println(i1 + i2);
		c1.accept(100, 200);

	}
}
