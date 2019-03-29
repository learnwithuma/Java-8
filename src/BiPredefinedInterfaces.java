import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class BiPredefinedInterfaces {
	public static void main(String[] args) {

		IntPredicate p1 = (i1) -> i1 > 100;

		System.out.println(p1.test(50));

		IntFunction<Integer> f1 = (i1) -> i1 * 100;

		System.out.println(f1.apply(50));

		IntConsumer c1 = (i1) -> System.out.println(i1);
		c1.accept(100);

		UnaryOperator<Integer> u1 = (i1) -> i1 * i1;
		System.out.println(u1.apply(10));

		BinaryOperator<Integer> b1 = (i1, i2) -> i1 * i2;
		System.out.println(b1.apply(20, 20));

		IntUnaryOperator u2 = (i1) -> i1 * i1;
		System.out.println(u1.apply(50));

		IntBinaryOperator b2 = (i1, i2) -> i1 * i2;
		System.out.println(b2.applyAsInt(20, 20));

	}
}
