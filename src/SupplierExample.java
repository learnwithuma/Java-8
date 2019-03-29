// Supplier

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<Double> s1 = () -> Math.random();

		System.out.println(s1.get());
	

	}
}
